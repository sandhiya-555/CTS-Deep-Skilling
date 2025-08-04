package org.example.jwt;

import org.example.jwt.Jwtutil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Base64;

@RestController
public class Authcontroller {

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
        String base64Credentials = authHeader.substring("Basic ".length());
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        String[] values = credentials.split(":", 2);
        String username = values[0];
        String password = values[1];

        // Dummy check
        if (username.equals("user") && password.equals("pwd")) {
            String token = Jwtutil.generateToken(username);
            return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
