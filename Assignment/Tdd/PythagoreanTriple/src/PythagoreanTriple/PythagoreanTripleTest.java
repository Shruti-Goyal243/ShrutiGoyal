package PythagoreanTriple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PythagoreanTripleTest {


	static int[] p1 = {3,4,5};
    static int[] p2 = {3,5,7};
    static int[] p3 = {5,12,13};
    static int[] p4 = {4,54,5};
   
    PythagoreanTriple pT = new PythagoreanTriple();

    @Test
    public void validTriple() {
        assertEquals(1, pT.pythagoreanTriple(p1));
        assertEquals(1, pT.pythagoreanTriple(p3));
    }
    
    @Test
    public void invalidTriple(){
      assertEquals(0,pT.pythagoreanTriple(p2));
      assertEquals(0,pT.pythagoreanTriple(p4));
    }
  
}
