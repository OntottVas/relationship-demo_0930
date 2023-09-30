package hu.progmatic.relationshipdemo_0930.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person() {

    }
}
