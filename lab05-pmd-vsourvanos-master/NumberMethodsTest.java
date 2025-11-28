package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import lab05.*;

class NumberMethodsTest {

	//DELTA is the acceptable loss of precision when testing for double values
	private static final double DELTA = 0.01;

	/*
	 * IMPORTANT NOTE: Tests that are not preceded by the @Test annotation are
	 * not run! Include it before all test methods OR include it selectively
	 * when you only want to run particular tests
	 */

	/*
	 * NAMING CONVENTION: The name of each TESING METHOD should be descriptive as follows:
	 * <nameOfMethodBeingTested>_<ExpectedBehavior>_<StateUnderTest>
	 * (e.g. minimumInt_returnsMin_AllCases)
	 */
	

	@Test
	public void minimumInt_returnsMin_1stParamIsMin() {
		assertEquals(-2, NumberMethods.minimumInt(-2, 3));
	}
	
	public void minimumInt_returnsMin_2ndParamIsMin() {
		assertEquals(2, NumberMethods.minimumInt(3, 2));
	}

	@Test
	public void maximumDouble_returnsMax_1stParamIsMin() {
		assertEquals(3.4, NumberMethods.maximumDouble(2.3, 3.4), DELTA);
	}
	
	@Test
	public void maximumDouble_returnsMax_2ndParamIsMin() {
		assertEquals(-3.4, NumberMethods.maximumDouble(2.3, -3.4), DELTA);
	}
	
	@Test
	public void sumAllNumbersUpTo_returnsSum_paramIsPos() {
		assertEquals(78, NumberMethods.sumAllNumbersUpTo(12));
	}
	
	@Test
	public void sumAllNumbersUpTo_returnsMinus1_paramIsNeg() {
		assertEquals(-1, NumberMethods.sumAllNumbersUpTo(-3));
	}
}
