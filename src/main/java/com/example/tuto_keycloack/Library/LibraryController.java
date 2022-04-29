package com.example.tuto_keycloack.Library;

import com.example.tuto_keycloack.Book.BookRepository;
import org.keycloak.KeycloakSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;


@RestController
@CrossOrigin("*")
public class LibraryController {
    private final HttpServletRequest request;
    private final BookRepository bookRepository;

    @Autowired
    public LibraryController(HttpServletRequest request, BookRepository bookRepository) {
        this.request = request;
        this.bookRepository = bookRepository;
    }

    @GetMapping(value = "/")
    public String getHome() {
        return "index";
    }

    @GetMapping(value = "/books")
    public String getBooks() {
        return "index";
       // configCommonAttributes(model);
        ///model.addAttribute("books", "All Books");
        //return "books";
    }

    @GetMapping(value = "/manager")
    public String getManager(Model model) {
        return "index";
       // configCommonAttributes(model);
       // model.addAttribute("books", "Detail Manager");
       // return "manager";
    }

    @GetMapping(value = "/logout")
    public String logout() throws ServletException {
        request.logout();
        return "redirect:/";
    }

    private void configCommonAttributes(Model model) {
        model.addAttribute("name", getKeycloakSecurityContext().getIdToken().getGivenName());
    }

    private KeycloakSecurityContext getKeycloakSecurityContext() {
        return (KeycloakSecurityContext) request.getAttribute(KeycloakSecurityContext.class.getName());
    }
}
