package EmployeeTest;

import JavaAir.Employee.CabinCrewMember;
import JavaAir.Employee.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class cabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jacob", Rank.NORMAL);
    }

    @Test
    public void cabinCrewMemberCanSendMessage(){
        assertEquals("I love JavaAir", cabinCrewMember.message("JavaAir"));
    }
}
