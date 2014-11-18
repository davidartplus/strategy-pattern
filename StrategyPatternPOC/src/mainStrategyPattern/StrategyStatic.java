package mainStrategyPattern;

/** My static idea of testing the pattern **/


class Calculator{
	static public final int OPTION_ADD = 1;
	static public final int OPTION_SUBTRACT = 2;
	static public final int OPTION_MULTIPLY = 3;
	
	private Add add;
	private Subtract subtract;
	private Multiply multiply;
	
	public Calculator(){
		add = new Add();
		subtract = new Subtract();
		multiply = new Multiply();
	}
	
	public int execute(int a, int b, int option){
		switch(option){
		case OPTION_ADD:
			return add.execute(a, b);
		case OPTION_SUBTRACT:
			return subtract.execute(a, b);
		case OPTION_MULTIPLY:
			return multiply.execute(a, b);
		}
		return -1;
	}
}

class StrategyStatic {
	public static void runStrategy() {
		Calculator calculator = new Calculator();
		
        int resultA = calculator.execute(3,4,Calculator.OPTION_ADD);
        int resultB = calculator.execute(3,4,Calculator.OPTION_SUBTRACT);
        int resultC = calculator.execute(3,4,Calculator.OPTION_MULTIPLY);
        
        /*
        System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );*/
	}
}
