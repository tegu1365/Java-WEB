package entities;

import java.time.LocalDateTime;
import java.util.List;

public class Event {
    private Integer id;
    private String name;
    private Track track;
    private List<Team> teams;
    private LocalDateTime dateOfEvent;

}
