package PlaneTest;

import JavaAir.Plane.Plane;
import JavaAir.Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(20, plane.getPlaneType().getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(3000, plane.getPlaneType().getWeight());
    }
}
