import acm.program.*;

public class ReturnMax extends CommandLineProgram {
    public void run(){
        println("The maximum of 2 and 3 is " + returnMax(2,3));
        println("The maximum of 3 and 2 is " + returnMax(3,2));
        println("The maximum of 3 and 3 is " + returnMax(3,3));
        println("The maximum of -3 and 3 is " + returnMax(-3,3));
        println("The maximum of -3 and -3 is " + returnMax(-3,-3));
        println("The maximum of -3 and 0 is " + returnMax(-3,0));
        println("The maximum of 3 and 0 is " + returnMax(3,0));
    }

    private int returnMax(int a, int b){
        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        return max;
        // if( a >  b){
        //     return a;
        // }
        // return b;
        
    }

    public static void main(String[] args){
        ReturnMax r = new ReturnMax();
        r.run();
    }
}
