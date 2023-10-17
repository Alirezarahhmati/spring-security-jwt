package Alireza.SpringSecurity.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class controller {

    @GetMapping
    public ResponseEntity<String> sayHello () {
        return ResponseEntity.ok("Hello from secured endpoint");
    }

    @GetMapping("/good-bye")
    public ResponseEntity<String> sayGoodBye () {
        return ResponseEntity.ok("Good Bye, i hope see you soon!");
    }
}
