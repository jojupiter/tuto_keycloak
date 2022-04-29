package com.example.tuto_keycloack.customers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class CustomersController {
    /*
    @GetMapping("/customers/hello")
    public ResponseEntity<String> helloPublic() {
        return ResponseEntity.ok("Hello public customers");
    }
    @GetMapping("/users/hello")
    public ResponseEntity<String> helloUser() {
        return ResponseEntity.ok("Hello public user");
    }
    @PreAuthorize("hasRole('MEMBER')")
    @GetMapping("/members/hello")
    public ResponseEntity<String> helloMember() {
        return ResponseEntity.ok("Hello dear member");
    }
    @RolesAllowed("hasRole('ADMIN')")
    @GetMapping("/admin/hello")
    public ResponseEntity<String> helloAdmin() {
        return ResponseEntity.ok("Hello dear admin");
    }
    @PreAuthorize("hasRole('MODERATOR')")
    @GetMapping("/moderators/hello")
    public ResponseEntity<String> helloModerator() {
        return ResponseEntity.ok("Hello dear moderator");
    }

     */
}
