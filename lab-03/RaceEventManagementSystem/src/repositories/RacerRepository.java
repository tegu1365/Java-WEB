package repositories;

import entities.Racer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RacerRepository {
    // structure to store your Racers
    private static Map<Integer, Racer> racerTable = new HashMap<Integer,Racer>();
    private static Integer sequence = 0;

    /**
     * Add racer to your DB
     * @param racer
     */
    public void addRacer(Racer racer) {
        if(racer.getId()!=null) {
            throw new IllegalArgumentException("Cannot create Racer with already given ID.");
        }
        racer.setId(sequence++);
        racerTable.put(racer.getId(), racer);
    }

    /**
     * Delete racer by id. If there is no element to be deleted then return false;
     * @param id
     * @return if there is element to delete -> true, if not -> false
     */
    public boolean deleteRacerById(Integer id) {
        return racerTable.remove(id) == null ? false : true;
    }

    /**
     * Get racer by passed id. If there is no element return Optional empty
     * @param id
     * @return Optional of Racer
     */
    public Optional<Racer> getRacerById(Integer id) {
        return Optional.of(racerTable.get(id));
    }
}