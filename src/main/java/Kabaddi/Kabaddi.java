package Kabaddi;

import java.util.Arrays;

public class Kabaddi
{
    // Write your printTeamSurnames method here
    public void printTeamSurnames(String allNames) {
        String[] names = allNames.split(",");
        for(String name: names){
            System.out.println(name.trim().split(" ")[1]);
        }
    }

    public void printTeamSurnamesFun(String allNames) {
        Arrays.stream(allNames.split(","))
                .map(name -> name.trim())
                .map(name -> name.split(" ")[1])
                .forEach(surname -> System.out.println(surname));
    }
}