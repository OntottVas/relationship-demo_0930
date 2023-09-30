package hu.progmatic.relationshipdemo_0930.repository;

import hu.progmatic.relationshipdemo_0930.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
