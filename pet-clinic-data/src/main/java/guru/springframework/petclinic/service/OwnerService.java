package guru.springframework.petclinic.service;

import guru.springframework.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by Alexander Yakovlev on 26.08.2018.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
