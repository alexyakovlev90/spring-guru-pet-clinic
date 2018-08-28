package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.Speciality;
import guru.springframework.petclinic.service.SpecialityService;

import java.util.Set;


public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Speciality object) {

    }

    @Override
    public Speciality save(Speciality object) {
        return null;
    }

    @Override
    public Speciality findById(Long id) {
        return null;
    }
}
