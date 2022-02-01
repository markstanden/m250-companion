package C6.Quiz3;

public class Triangle {
    public static void perimeter(double lengthA, double lengthB){
        double hyp = Math.hypot(lengthA, lengthB);
        System.out.println(lengthA + lengthB + hyp);
    }
}
