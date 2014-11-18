package mainStrategyPattern;

public class Intializer {
	public static void main(String[] args) {
        // Three contexts following different strategies
        // It instantiates each strategy at runtime.
        // In my head I wanted to create a static class Context,
        // that would have been called calculator, because it instantiates
        // the three instances at once. I think it very depends on the usage
        // of the pattern but the concept remains the same
        
		System.out.println("\nRunning Wikipedia's Strategy");
		StrategyStatic.runStrategy();
		System.out.println("\nRunning Static Strategy");
		StrategyExample.runStrategy();
	}
}
