package br.com.erudio.rest_with_spring_boot_and_java_erudio.controllers;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.entities.Person;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id")String id){
        return service.findById(id);
    }

    @RequestMapping
    public List<Person> findAll(){
        return service.findAll();
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person create(@RequestBody Person person){
        return service.create(person);
    }

    @PutMapping(value = "/{id}")
    public Person update(Person person){

        return service.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

}
