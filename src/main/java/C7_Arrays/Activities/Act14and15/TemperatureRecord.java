package C7_Arrays.Activities.Act14and15;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TemperatureRecord
{
    int[] temps = new int[7];

    /**
     * print out the number of days on which the temperature
     * was equal to or exceeded the int parameter.
     * @param limit the temperature lower bound (inclusive)
     */
    public void numGreaterThanEqual(int limit){
        long count = Arrays.stream(temps)
                .filter(temp -> temp >= limit)
                .count();

        System.out.println(count);


        /*
        Classic Java

        int count = 0;
        for(int temp : temps){
            if (temp >= limit){
                count++;
            }
        }
        System.out.println(count);
        */
    }

    /**
     * print out the last day of the week on which the highest temperature occurred.
     */
    public void hottestDay(){
        String[] weekdays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int hottestIndex = IntStream.range(0, temps.length)
                .reduce(0, (hottest, current) -> temps[current] >= temps[hottest] ? current : hottest);

        System.out.println(weekdays[hottestIndex]);

        /*
        Classic Java
        int hottestIndex = 0;

        for(int i = 1; i < temps.length; i++){
            if (temps[i] >= temps[hottestIndex]){
                hottestIndex = i;
            }
        }
        System.out.println(weekdays[hottestIndex]);
        */
    }
}
