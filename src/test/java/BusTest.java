import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Lochgelly", 5);
        person = new Person();
        busStop = new BusStop("Lochgelly");
        busStop.addPerson(person);

    }

    @Test
    public void hasADestination(){
        assertEquals("Lochgelly", bus.getDestination());
    }

    @Test
    public void hasACapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void passengersStartEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

}
