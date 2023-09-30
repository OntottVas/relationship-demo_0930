package hu.progmatic.relationshipdemo_0930.repository;

import hu.progmatic.relationshipdemo_0930.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
