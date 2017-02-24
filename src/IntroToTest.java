import static org.junit.Assert.*;

import org.junit.Test;

public class IntroToTest {

	@Test
	public void test() {
		/*
		 * assertEquals(4, add(2, 2)); assertEquals(24, add(12, 12));
		 * assertEquals(-25, add(-13, -12)); assertEquals(25, squareNum(5));
		 * assertEquals(36, squareNum(6)); assertEquals(64, squareNum(8));
		 * assertEquals(10, absoluteValue(-10)); assertEquals(3,
		 * absoluteValue(3)); assertTrue(isWeekend("sunday"));
		 * assertFalse(isWeekend("monday")); assertTrue(isWeekend("Friday"));
		 * assertEquals("Hello Carl", giveGreeting("Carl")); assertEquals(
		 * "YO Edwin!!", giveEnthusiasticGreeting("Edwin"));
		 */
		assertEquals("A", getGrade(95));
		assertEquals("B", getGrade(83));
		assertEquals("C", getGrade(78));
		assertEquals("D", getGrade(66));
		assertEquals("F", getGrade(40));
	}

	int add(int n, int m) {
		return n + m;

	}

	int squareNum(int q) {
		return q * q;
	}

	int absoluteValue(int nom) {
		if (nom < 0) {
			return nom * -1;
		} else if (nom > 0) {
			return nom;
		} else {
			return 0;
		}
	}

	boolean isWeekend(String day) {
		if (day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			return true;
		} else {
			return false;
		}
	}

	String giveGreeting(String name) {
		return "Hello " + name;
	}

	String giveEnthusiasticGreeting(String name) {

		return "YO " + name + "!!";
	}
	String getGrade(int grade){
		if(grade>90){
			return "A";
		}else if(90>grade && grade>80){
			return "B";
		}else if(80>grade && grade>70){
			return "C";
		}else if(70>grade && grade>60){
			return "D";
		}else{
			return "F";
		}
	}
}
