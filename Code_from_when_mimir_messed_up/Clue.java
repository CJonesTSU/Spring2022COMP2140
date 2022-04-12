import acm.program.*;

public class Clue extends CommandLineProgram{
    public void run() {
        String scarlett = "mustard";
        String suspect = "peacock";
        String lounge = "ballroom";
        String pipe = "study";
        String dagger = "pipe";
        String weapon = "dagger";
    
        clue(weapon, suspect, pipe);
        scarlett = clue(scarlett, pipe, suspect);
        dagger = clue(dagger, "lounge", scarlett);
        clue(dagger, lounge, "dagger");
    }
    
    private String clue(String suspect, String room, String weapon)
    {
        println(room + " in the " + weapon + " with the " + suspect);
        return room;
    }

    public static void main(String[] args){
        Clue c = new Clue();
        c.run();
    }
}