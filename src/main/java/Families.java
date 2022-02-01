import java.util.HashMap;
import java.util.HashSet;

public class Families
{
    HashMap<Integer, HashSet<String>> children;

    //constructor
    public Families()
    {
        children = new HashMap<Integer, HashSet<String>>();
    }



    // Write your method moreThan3Children() here
    public void moreThan3Children(){
        long moreThanThree = children.values().stream()
                .filter(occupants -> occupants.size() >= 3)
                .count();

        String result = moreThanThree > 0 ? String.valueOf(moreThanThree) : "No";
        System.out.println(result + " houses have three or more children");
    }

}