package mainStrategyPattern;

/** The classes that implement a concrete strategy should implement this.
* The Context class uses this to call the concrete strategy. */
interface Strategy {
    int execute(int a, int b); 
}
 
/** Implements the algorithm using the strategy interface */
class Add implements Strategy {
    public int execute(int a, int b) {
        //System.out.println("Called Add's execute()");
        return a + b;  // Do an addition with a and b
    }
}
 
class Subtract implements Strategy {
    public int execute(int a, int b) {
        //System.out.println("Called Subtract's execute()");
        return a - b;  // Do a subtraction with a and b
    }
}
 
class Multiply implements Strategy {
    public int execute(int a, int b) {
        //System.out.println("Called Multiply's execute()");
        return a * b;   // Do a multiplication with a and b
    }    
}