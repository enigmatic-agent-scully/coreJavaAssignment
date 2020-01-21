package com.aj.corejava;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class QuestionsTest {

	@Test
	void testQ1BubbleSort() {
		int[] q1Arr = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
		int[] expected = { 0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9 };
		int[] result = Questions.q1BubbleSort(q1Arr);

		assertArrayEquals(expected, result);
		Questions.printSeparator();
	}

	@Test
	void testQ2Fibonacci() {
		int[] expected = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
				10946, 17711, 28657 };
		int[] result = Questions.q2Fibonacci();

		assertArrayEquals(expected, result);
		Questions.printSeparator();
	}

	@Test
	void testQ3ReverseString() {
		String expected = "gnirts a si sihT";
		String result = Questions.q3ReverseString("This is a string");

		assertEquals(expected, result);
		Questions.printSeparator();
	}

	@Test
	void testQ4NxFactorial() {
		int expected = 24;
		int result = Questions.q4NxFactorial(4);

		assertEquals(expected, result);
		Questions.printSeparator();
	}

	@Test
	void testQ5SubstringMethod() {
		String str = "Testing the substring method.";
		String expected = "Testing the sub";
		int num = 15;
		String result = Questions.q5SubstringMethod(str, num);

		assertEquals(expected, result);
		Questions.printSeparator();
	}

	@Test
	void testQ6isEven() {
		int num = 98;
		boolean expected = true;
		boolean result = Questions.q6isEven(num);

		assertEquals(expected, result);
		Questions.printSeparator();
	}

	@Test
	void testQ7ComparatorSort() {
		String[] expected = { "21", "30", "33", "AJ", "Alia", "Sonya", "Coding", "Construction", "IT" };
		String[] result = Questions.q7ComparatorSort();

		assertArrayEquals(expected, result);
	}

//	@Test
//	void testQ8palindromeArrayList() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ9ArrayListPrime() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ10TernaryFindMinimum() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ11FloatVars() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ12PrintEvens() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ13PrintTriangle() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ14SwitchCase() {
//		fail("Not yet implemented");
//	}

	@Test
	void testQ15MathInterfaceImplementation() {
		int[] expected = { 15, 9, 36, 4 };
		int[] result = Questions.q15MathInterfaceImplementation();

		assertArrayEquals(expected, result);
		Questions.printSeparator();
	}

//	@Test
//	void testQ16CountChars() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ17PrincipalInterestCalc() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ18AbstractStringMethods() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ19ManipulateArrayList() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testQ20readFilePrintDetails() {
//		fail("Not yet implemented");
//	}

}
