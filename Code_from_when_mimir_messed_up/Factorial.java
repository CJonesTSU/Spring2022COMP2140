import acm.program.*;

public class Factorial extends CommandLineProgram {
	
	private static final int MAX_NUM = 4;
	
	public void run() {
		for(int i = 0; i < MAX_NUM; i++) {
			println(i + "! = " + factorial(i));
		}
	}

	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

    public static void main(String[] args){
        Factorial f = new Factorial();
        f.run();
    }
}
