package bg.fmi.web.lab.racereventmanagment.service;

import bg.fmi.web.lab.racereventmanagment.model.Racer;
import bg.fmi.web.lab.racereventmanagment.repository.RacerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class RacerService {
    private RacerRepository racerRepository;

    @Autowired
    public RacerService(RacerRepository racerRepository){
        this.racerRepository=racerRepository;
    }

    public List<Racer> getAllRacers() {
        return racerRepository.getAllRacers();
    }

    public List<Racer> getAllRacersByFirstName(String firstName) {
        return racerRepository.getAllRacers().stream()
                .filter(racer -> Objects.equals(racer.getFirstName(), firstName) )
                .toList(); // this filtering should be leavet to DB - it will be much faster and saves data transfer from the DB.
        // it is highly recommended for the DB to have index by the field by which we are filtering.
    }
    public void createRacer(String firstName, String lastName, Integer age) {
        racerRepository.createRacer(new Racer(firstName, lastName, age));
    }
    public boolean deleteRacerById(Integer id) {
        return racerRepository.deleteRacerById(id);
    }
}
