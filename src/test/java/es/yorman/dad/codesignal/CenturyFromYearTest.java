package es.yorman.dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CenturyFromYearTest {

	private CenturyFromYear cfy;
	
	@Before
	public void setup() {
		cfy = new CenturyFromYear();
	}
	
	@Test
	public void test1() {
		assertEquals(20, cfy.solution(1905));
	}
	
	@Test
	public void test2() {
		assertEquals(17, cfy.solution(1700));
	}
	
	@Test
	public void test3() {
		assertEquals(20, cfy.solution(1988));
	}
	
	@Test
	public void test4() {
		assertEquals(20, cfy.solution(2000));
	}
	
	@Test
	public void test5() {
		assertEquals(21, cfy.solution(2001));
	}

	@Test
	public void test6() {
		assertEquals(2, cfy.solution(200));
	}
}
