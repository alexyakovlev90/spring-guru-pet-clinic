package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.BaseEntity;

import java.util.*;


public class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object == null) {
            throw new RuntimeException("Object is null");
        }

        if (object.getId() == null) {
            object.setId(getNextId());
        }
        map.put(object.getId(), object);
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        final Set<Long> longs = map.keySet();

        if (!longs.isEmpty()) {
            return Collections.max(longs) + 1L;
        } else {
            return 1L;
        }
    }
}
