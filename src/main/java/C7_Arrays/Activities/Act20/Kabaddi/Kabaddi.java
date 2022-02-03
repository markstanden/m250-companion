package C7_Arrays.Activities.Act20.Kabaddi;

import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        //"Name1 Surname1,Name2 Surname2,Name3 Surname3"
        /*
            \b      surname starts at the start of a word block
            ()      groups the item we want to extract
            \w      alphanumeric characters (and underscore)
            +       matches 1 or more
            (?= )   matches ahead of the group, but doesn't include it,
                    our surnames will either end with a comma or the end of string
            ,|$     comma or end of string, this will follow our group
         */
        Pattern p = Pattern.compile("\\b(\\w+)(?=,|$)");
        Matcher m = p.matcher(allNames);
        m.results()
                .map(MatchResult::group)
                .forEach(System.out::println);
    }

    public void printTeamSurnamesFunSimple(String allNames) {
        Arrays.stream(allNames.split(","))
                .map(name -> name.trim())
                .map(name -> name.split(" ")[1])
                .forEach(System.out::println);
    }
}