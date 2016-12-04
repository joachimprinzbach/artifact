package ch.joachim;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
public class ApplicationStartUp {

    @Inject PersonRepository personRepository;

    @PostConstruct
    public void onStartup() {
        Person p = new Person();
        p.setFirstName("Hans");
        p.setLastName("Muster");
        personRepository.create(p);
    }
}
