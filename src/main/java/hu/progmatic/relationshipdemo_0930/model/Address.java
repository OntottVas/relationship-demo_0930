package hu.progmatic.relationshipdemo_0930.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String country;
    String zip;
    String city;
    String street;

    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private Person person;

    public Address() {
    }

    public Address(String country, String zip, String city, String street, Person person) {
        this.country = country;
        this.zip = zip;
        this.city = city;
        this.street = street;
        this.person = person;
    }

}
