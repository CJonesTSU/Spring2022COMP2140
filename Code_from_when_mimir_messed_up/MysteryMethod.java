import acm.program.*;

public class MysteryMethod extends CommandLineProgram{
    public void run()
    {
        int x = 9;
        int y = 2;
        int z = 5;

        mystery(5, y, x);
        mystery(y, 9, z);
    }

    private void mystery(int a, int b, int c)
    {
        println(b + ", " + (c - a));
    }

    public static void main(String[] args){
        MysteryMethod m = new MysteryMethod();
        m.run();
    }

}
