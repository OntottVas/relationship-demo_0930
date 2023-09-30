package hu.progmatic.relationshipdemo_0930.service;

import hu.progmatic.relationshipdemo_0930.model.Person;
import hu.progmatic.relationshipdemo_0930.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Iterable<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
