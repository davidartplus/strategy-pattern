package mainStrategyPattern;

import org.junit.Test;

public class StrategyTest {
	
	static final double ITERATIONS = 800000000;

	@Test
	public void testShouldRunStrategyExemple100() {
		for(int i = 0; i < ITERATIONS; i++){
			StrategyExample.runStrategy();
		}
	}
	  
	@Test
	public void testShouldRunStrategyStatic100() {
		for(int i = 0; i < ITERATIONS; i++){
			StrategyStatic.runStrategy();
		}
	}
}
