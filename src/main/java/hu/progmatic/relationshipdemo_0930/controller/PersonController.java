package hu.progmatic.relationshipdemo_0930.controller;

import hu.progmatic.relationshipdemo_0930.model.Person;
import hu.progmatic.relationshipdemo_0930.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Iterable<Person> getAllPersons() {
        return personService.getAllPerson();
    }
}
