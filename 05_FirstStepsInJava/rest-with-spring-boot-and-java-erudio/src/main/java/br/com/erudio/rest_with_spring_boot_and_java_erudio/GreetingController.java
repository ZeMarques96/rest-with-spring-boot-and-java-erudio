package br.com.erudio.rest_with_spring_boot_and_java_erudio;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template= "Hello, %s!";
    private static final AtomicLong counter= new AtomicLong();

    @RequestMapping(value = "/sum{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(
            @PathVariable( name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo){
        return 1D;
    }
}
