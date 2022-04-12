import acm.program.*;

public class IsMultiple extends CommandLineProgram {
    
    public void run(){
        println("15 isMultiple 3 yeilds: " + isMultiple(15,3));
        println("2 isMultiple 3 yeilds: " + isMultiple(2,3));
        println("121 isMultiple 11 yeilds: " + isMultiple(121,11));
        println("122 isMultiple 11 yeilds: " + isMultiple(122,11));
    }

    private boolean isMultiple(int first, int second){
        boolean divisible = true;
        int remainder = 0;
        remainder = first % second;
        if(remainder == 0){
            divisible = true;
            //return true;
        }else{
            //return false;
            divisible = false;
        }
       return divisible;
        // return first % second == 0;
    }


    public static void main(String[] args) {
        IsMultiple i = new IsMultiple();
        i.run();
    }
}
