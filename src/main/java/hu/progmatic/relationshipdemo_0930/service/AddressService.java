package hu.progmatic.relationshipdemo_0930.service;

import hu.progmatic.relationshipdemo_0930.model.Address;
import hu.progmatic.relationshipdemo_0930.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddressRepository addressRepository;


    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Iterable<Address> getAllAddresses() {
        return addressRepository.findAll();
    }


}
