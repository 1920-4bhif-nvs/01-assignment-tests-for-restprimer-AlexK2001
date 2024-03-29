package at.htl.restprimer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Path("time")
public class TimeServerRessource {
    @GET
    public String time() {

        return "Time: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd. MMMM yyyy, hh:mm:ss"));

    }
}
