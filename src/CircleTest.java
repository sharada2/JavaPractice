import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Controller.CirCotroller;

public class CircleTest {

	@SuppressWarnings("deprecation")
	@Test
	public void areaTest() {
		CirCotroller c = new CirCotroller();
		double actualValue =  c.Area();
		System.out.print(actualValue);
		assertEquals(254.34,actualValue,0.01);
		
	}
}
