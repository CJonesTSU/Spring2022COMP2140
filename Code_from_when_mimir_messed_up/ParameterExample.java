import acm.program.*;


public class ParameterExample extends CommandLineProgram{
    
    public void run() {
        printOpinion(5);
        printOpinion(19);
     }
     
     private void printOpinion(int num) {
        if(num == 5) {
           println("I love 5!");
        } else {
           println("Whattever");
        }
     }
     

    public static void main(String[] args) {
        ParameterExample p = new ParameterExample();
        p.run();
    }
}
