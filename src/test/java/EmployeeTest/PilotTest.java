package EmployeeTest;

import JavaAir.Employee.Pilot;
import JavaAir.Employee.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Jacob", Rank.MANAGER, "DB24");
    }

    @Test
    public void pilotHasLicence(){
        assertEquals("DB24", pilot.getLicenceNo());
    }
}
