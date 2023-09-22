package es.yorman.dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdjacentElementsProductTest {
	
private AdjacentElementsProduct aep;
	
	@Before
	public void setup() {
		aep = new AdjacentElementsProduct();
	}
	
	@Test
	public void test1() {
		assertEquals(21, aep.solution(new int[]{3, 6, -2, -5, 7, 3}));
	}
	
	@Test
	public void test2() {
		assertEquals(2, aep.solution(new int[]{-1, -2}));
	}
	
	@Test
	public void test3() {
		assertEquals(6, aep.solution(new int[]{5, 1, 2, 3, 1, 4}));
	}
	
	@Test
	public void test4() {
		assertEquals(6, aep.solution(new int[]{1, 2, 3, 0}));
	}
	
	@Test
	public void test5() {
		assertEquals(50, aep.solution(new int[]{9, 5, 10, 2, 24, -1, -48}));
	}

	@Test
	public void test6() {
		assertEquals(30, aep.solution(new int[]{5, 6, -4, 2, 3, 2, -23}));
	}
}
