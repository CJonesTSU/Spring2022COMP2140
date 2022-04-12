import acm.program.*;

public class Average extends CommandLineProgram{
    
    public void run(){
        int number = 5;
        double mid = average(5.0, 10.2);
        println(mid);
    }

    private double average(double a, double b){
        double sum = a + b;
        double avg = sum / 2;
        return avg;
    }

    public static void main(String[] args) {
        Average a = new Average();
        a.run();
    }
}
