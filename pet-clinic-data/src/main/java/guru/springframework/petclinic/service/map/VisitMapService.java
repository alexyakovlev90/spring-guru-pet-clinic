package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.Visit;
import guru.springframework.petclinic.service.VisitService;

import java.util.Set;

/**
 * Created by Alexander Yakovlev on 28.08.2018.
 */
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return null;
    }

    @Override
    public Visit findById(Long id) {
        return null;
    }


    @Override
    public Visit save(Visit object) {
        return null;
    }

    @Override
    public void delete(Visit object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
