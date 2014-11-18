package mainStrategyPattern;
 
// Configured with a ConcreteStrategy object and maintains
// a reference to a Strategy object 
class Context {
    private Strategy strategy;
 
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int a, int b) {
        return this.strategy.execute(a, b);
    }
}
 
/** Tests the pattern */
class StrategyExample {
    public static void runStrategy() {
        Context context;

        context = new Context(new Add());
        int resultA = context.executeStrategy(3,4);
 
        context = new Context(new Subtract());
        int resultB = context.executeStrategy(3,4);
 
        context = new Context(new Multiply());
        int resultC = context.executeStrategy(3,4);
 
        /*System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );*/
    }
}

