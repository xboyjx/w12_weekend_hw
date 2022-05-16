package EmployeeTest;

import JavaAir.Employee.Employee;
import JavaAir.Employee.Pilot;
import JavaAir.Employee.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Pilot("Jacob", Rank.MANAGER, "DB24") ;
        }

    @Test
    public void employeeHasName(){
        assertEquals("Jacob", employee.getName());
    }

    @Test
    public void employeeHasRank(){
        assertEquals(Rank.MANAGER, employee.getRank());
    }


}

