package guru.springframework.petclinic.repository;

import guru.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
