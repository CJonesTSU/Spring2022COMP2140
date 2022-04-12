import acm.program.*;

public class COMP2140 extends CommandLineProgram{
    public void run(){
        println(getClass("COMP2140"));
    }

    private String getClass(String s){
        String greeting = "";
        greeting = "Hi there all you fine folks in ";
        greeting = greeting + s;
        return greeting;
    }

    public static void main(String[] args) {
        COMP2140 c = new COMP2140();
        c.run();
    }
}