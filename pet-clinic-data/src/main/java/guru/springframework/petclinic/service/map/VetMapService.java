package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.service.VetService;
import org.springframework.stereotype.Component;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }
}
