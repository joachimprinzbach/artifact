package ch.joachim;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonService {

    @Inject
    PersonRepository personRepository;

    @GET
    public List<Person> helloWorld() {
        Person person = personRepository.find(1L);
        return Arrays.asList(person);
    }
}
