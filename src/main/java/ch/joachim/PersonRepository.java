package ch.joachim;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonRepository {

    @PersistenceContext(unitName = "EETestPU1")
    EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void create(Person entity) {
        getEntityManager().persist(entity);
    }

    public void edit(Person entity) {
        getEntityManager().merge(entity);
    }

    public void remove(Person entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public Person find(Object id) {
        return getEntityManager().find(Person.class, id);
    }

}
