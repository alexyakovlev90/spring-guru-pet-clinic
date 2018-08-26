package guru.springframework.petclinic.service;

import guru.springframework.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by Alexander Yakovlev on 26.08.2018.
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
