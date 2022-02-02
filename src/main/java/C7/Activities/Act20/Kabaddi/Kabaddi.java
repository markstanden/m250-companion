package C7.Activities.Act20.Kabaddi;

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
        //"Name1 Surname1, Name2 Surname2, Name3 Surname3"
        Arrays.stream(allNames.split(". *,"))
                .forEach(System.out::println);
    }

    public void printTeamSurnamesFunSimple(String allNames) {
        Arrays.stream(allNames.split(","))
                .map(name -> name.trim())
                .map(name -> name.split(" ")[1])
                .forEach(System.out::println);
    }
}