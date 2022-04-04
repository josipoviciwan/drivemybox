package org.drivemybox.interview.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/greeting")
public class GreetingController {

    private final Greeter greeter;

    @Autowired
    public GreetingController(Greeter greeter) {
        this.greeter = greeter;
    }

    @GetMapping
    public String greet(@RequestParam(name = "name") String name) {
        return greeter.greet(name);
    }
}
