package sample.proj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
@Slf4j
public class SimpleController {

    @GetMapping("simple")
    public ResponseEntity<String> getSimple() {
        return ResponseEntity.ok("Simple Response");
    }
}
