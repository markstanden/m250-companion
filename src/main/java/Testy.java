import java.sql.SQLOutput;
import java.util.Locale;

public class Testy
{
    // Write your smallString(String) method here.
    public void smallString(String text){
        String result = text.trim().toLowerCase();
        if(result.length() >= 3){
            System.out.println(result.substring(1, result.length() - 1));
        } else {
            System.out.println("String too short");
        }
    }
}