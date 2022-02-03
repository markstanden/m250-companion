package C6_Collections.Activities.Act12;

public class Height {
    public int height;

    public Height(int anInt)
    {
        height = anInt;
    }

    // Write your choose(int) method here
    public void choose(int aHeight){
        System.out.println(aHeight < height ? "Less than height" : "Greater than or equal to height");
    }
}
