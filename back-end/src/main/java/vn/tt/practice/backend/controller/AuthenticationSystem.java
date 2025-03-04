package vn.tt.practice.backend.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.tt.practice.backend.dto.LoginDTO;
import vn.tt.practice.backend.dto.SignUpDTO;
import vn.tt.practice.backend.service.LoginService;
import vn.tt.practice.backend.service.SignUpService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
public class AuthenticationSystem {
    private LoginService loginService;
    private final SignUpService signUpService;


    @PostMapping("/sign-in")
    public ResponseEntity<String> login(@RequestBody LoginDTO login) {
        return ResponseEntity.ok().body(loginService.login(login));
    }

    @PostMapping("/sign-up")
    public ResponseEntity<String> register(@RequestBody SignUpDTO data) {
        return ResponseEntity.ok().body(signUpService.save(data));
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok().body("test");
    }
}
