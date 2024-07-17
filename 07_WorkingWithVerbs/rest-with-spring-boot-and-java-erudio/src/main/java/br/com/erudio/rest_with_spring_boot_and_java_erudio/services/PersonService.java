package br.com.erudio.rest_with_spring_boot_and_java_erudio.services;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.entities.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());


    public Person findById(String id){
        logger.info("Finding one person");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("José");
        person.setLastName("Neto");
        person.setAddress("Sertanópolis - Paraná");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll(){
        logger.info("Finding all");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person create(Person person){
        logger.info("Creating a Person");
        Person obj = new Person();
        obj.setFirstName(person.getFirstName());
        obj.setLastName(person.getLastName());
        obj.setAddress(person.getAddress());
        obj.setGender(person.getGender());
        return obj;

    }

    public Person update(Person person){
        logger.info("Updating a person");

        return person;
    }

    public void deleteById(Long id){
        logger.info("deleting a person");

    }
    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name" + i);
        person.setAddress("Some address " + i);
        person.setGender("Male");
        return person;
    }
}
