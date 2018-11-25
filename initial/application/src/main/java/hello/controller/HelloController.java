package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.service.MyService;

@RestController
public class HelloController {

	@Autowired
    private MyService myService;

    @GetMapping("/message")
    public String home() {
        return myService.message();
    }
}
