package br.com.erudio.rest_with_spring_boot_and_java_erudio.controllers;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.converters.NumberConverter;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.exceptions.MathOperationException;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.math.SimpleMath;
import org.springframework.web.bind.annotation.*;



@RestController
public class MathController {

    private SimpleMath math = new SimpleMath();

    @RequestMapping(value ="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable (value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new MathOperationException("Please set a numeric value");
        }
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/minus/{numberOne}/{numberTwo}")
    public Double minus(@PathVariable(value = "numberOne") String numberOne,@PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new MathOperationException("Please set a numeric value");
        }
        return math.minus(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/times/{numberOne}/{numberTwo}")
    public Double times(@PathVariable(value = "numberOne") String numberOne,@PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new MathOperationException("Please set a numeric value");
        }
        return math.times(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable(value = "numberOne") String numberOne,@PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new MathOperationException("Please set a numeric value");
        }
        return math.div(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable(value = "numberOne") String numberOne,@PathVariable(value = "numberTwo") String numberTwo){
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new MathOperationException("Please set a numeric value");
        }
        return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sqrt/{number}")
    public Double sqrt(@PathVariable(value = "number") String numberOne){
        if (!NumberConverter.isNumeric(numberOne)){
            throw new MathOperationException("Please set a numeric value");
        }
        return math.sqrt(NumberConverter.convertToDouble(numberOne));
    }


}
