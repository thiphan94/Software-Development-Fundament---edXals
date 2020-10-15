package week2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SquarelotronTest {

    @Test
    public void testInitialisation1() {
	Squarelotron m1 = new Squarelotron(2);  // Creates the matrix:
	assertEquals(2, m1.size);
	assertEquals(1, m1.squarelotron[0][0]);
	assertEquals(2, m1.squarelotron[0][1]);
	assertEquals(3, m1.squarelotron[1][0]);
	assertEquals(4, m1.squarelotron[1][1]);	
		
    }
	
    @Test
    public void testInitialisation2() {
	Squarelotron m1 = new Squarelotron(3);  // Creates the matrix:
	assertEquals(3, m1.size);
	assertEquals(1, m1.squarelotron[0][0]);
	assertEquals(2, m1.squarelotron[0][1]);
	assertEquals(3, m1.squarelotron[0][2]);
	assertEquals(4, m1.squarelotron[1][0]);
	assertEquals(5, m1.squarelotron[1][1]);
	assertEquals(6, m1.squarelotron[1][2]);
		
    }

    @Test
    public void testUpsideDownFlip1() {
	Squarelotron m1 = new Squarelotron(4);
	m1 = m1.upsideDownFlip(1);
	assertEquals(13, m1.squarelotron[0][0]);
	assertEquals(15, m1.squarelotron[0][2]);
	assertEquals(9, m1.squarelotron[1][0]);
	assertEquals(6, m1.squarelotron[1][1]);
	assertEquals(8, m1.squarelotron[2][3]);
	assertEquals(4, m1.squarelotron[3][3]);
	
    }
	
    @Test
    public void testUpsideDownFlip2() {
	Squarelotron m1 = new Squarelotron(4);
	m1 = m1.upsideDownFlip(2);
	assertEquals(13, m1.squarelotron[3][0]);
	assertEquals(15, m1.squarelotron[3][2]);
	assertEquals(6, m1.squarelotron[2][1]);
	assertEquals(7, m1.squarelotron[2][2]);
	assertEquals(11, m1.squarelotron[1][2]);
	
    }
    
    @Test
    public void testUpsideDownFlip3() {
	Squarelotron m1 = new Squarelotron(3);
	m1 = m1.upsideDownFlip(1);
	assertEquals(7, m1.squarelotron[0][0]);
	assertEquals(1, m1.squarelotron[2][0]);
	assertEquals(4, m1.squarelotron[1][0]);
	assertEquals(9, m1.squarelotron[0][2]);
	assertEquals(3, m1.squarelotron[2][2]);
	
    }
    @Test
    public void testMainDiagonalFlip1() {
	Squarelotron m1 = new Squarelotron(3);
	m1 = m1.mainDiagonalFlip(1);
	assertEquals(4, m1.squarelotron[0][1]);
	assertEquals(2, m1.squarelotron[1][0]);
	assertEquals(8, m1.squarelotron[1][2]);
	assertEquals(6, m1.squarelotron[2][1]);
	}
	
    @Test
    public void testMainDiagonalFlip2() {
	Squarelotron m1 = new Squarelotron(4);
	m1 = m1.mainDiagonalFlip(2);
	/*
	assertEquals(4, m1.squarelotron[0][3]);
	assertEquals(5, m1.squarelotron[1][0]);
	assertEquals(6, m1.squarelotron[1][1]);
	assertEquals(10, m1.squarelotron[1][2]);
	assertEquals(15, m1.squarelotron[3][2]);
	*/
	assertEquals(7, m1.squarelotron[2][2]);
	assertEquals(10, m1.squarelotron[1][2]);
	}
	
   
    @Test
    public void testMainDiagonalFlip3() {
	Squarelotron m1 = new Squarelotron(2);
	m1 = m1.mainDiagonalFlip(1);
	assertEquals(1, m1.squarelotron[0][0]);
	assertEquals(3, m1.squarelotron[0][1]);
	assertEquals(2, m1.squarelotron[1][0]);
	assertEquals(4, m1.squarelotron[1][1]);
    }
	
    @Test
    public void testMainDiagonalFlip4() {
	Squarelotron m1 = new Squarelotron(5);
	m1 = m1.mainDiagonalFlip(2);
	assertEquals(12, m1.squarelotron[1][2]);
	assertEquals(8, m1.squarelotron[2][1]);
	assertEquals(9, m1.squarelotron[3][1]);
	assertEquals(14, m1.squarelotron[3][2]);
    }
    @Test 
    public void testRotateRight1() {
	Squarelotron m1 = new Squarelotron(2);
	m1.rotateRight(1);
	assertEquals(3, m1.squarelotron[0][0]);
	assertEquals(1, m1.squarelotron[0][1]);
	assertEquals(4, m1.squarelotron[1][0]);
	assertEquals(2, m1.squarelotron[1][1]);
	
    }
	
    @Test 
    public void testRotateRight2() {
	Squarelotron m1 = new Squarelotron(3);
	m1.rotateRight(-1);
	assertEquals(4, m1.squarelotron[0][0]);
	assertEquals(6, m1.squarelotron[2][1]);
	assertEquals(11, m1.squarelotron[1][2]);
	assertEquals(5, m1.squarelotron[3][1]);
	
    }
	
}