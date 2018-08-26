package guru.springframework.petclinic.service;

import guru.springframework.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by Alexander Yakovlev on 26.08.2018.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
