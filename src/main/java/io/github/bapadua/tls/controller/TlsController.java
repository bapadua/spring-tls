package io.github.bapadua.tls.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TlsController {

    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok().body("TLS on Springboot");
    }
}
