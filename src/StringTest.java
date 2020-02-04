import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void emptyTest() {
		int expected = 0;
		int actual = StringKata.add(" ");
		assertEquals(expected, actual);
	}
	
	@Test
	void singleNum() {
		int expected = 2;
		int actual = StringKata.add("2");
		assertEquals(expected, actual);
	}
	
	@Test
	void twoNum() {
		int expected = 4;
		int actual = StringKata.add("1, 3");
		assertEquals(expected, actual);
	}
	
	@Test
	void manyNum() {
		int expected = 40;
		int actual = StringKata.add("1, 3, 10, 11, 15");
		assertEquals(expected, actual);
	}
	
	@Test
	void newLine() {
		int expected = 12;
		int actual = StringKata.add("1\n2, 9");
		assertEquals(expected, actual);
	}
	
	@Test
	void noLet() {
		int expected = 3;
		int actual = StringKata.add("1,2,A");
		assertEquals(expected, actual);
	}
	
	@Test
	void spaceTest() {
		int expected = 10;
		int actual = StringKata.add("     3,      4,  3     ");
		assertEquals(expected, actual);
	}
	
	@Test
	void trailingTest() {
		int expected = 11;
		int actual = StringKata.add("3, 6, 2,     ");
		assertEquals(expected, actual);
	}
	
	@Test
	void newDelim() {
		int expected = 22;
		int actual = StringKata.add("//;\n 1;2, 9;10");
		assertEquals(expected, actual);
	}
	
	@Test
	void bothAnd() {
		int expected = 10;
		int actual = StringKata.add("//;\n 1\n2, 5;2");
		assertEquals(expected, actual);
	}
	
	@Test
	void negative() {
		int expected = 0;
		int actual = StringKata.add("1, -2");
		assertEquals(expected, actual);
	}
	
	@Test
	void overSizeTest() {
		int expected = 20;
		int actual = StringKata.add("2005, 15");
		assertEquals(expected, actual);
	}

	@Test
	void bigDelim() {
		int expected = 22;
		int actual = StringKata.add("//ABC&\n 1ABC&2, 9, 10");
		assertEquals(expected, actual);
	}
	
	
	


}
