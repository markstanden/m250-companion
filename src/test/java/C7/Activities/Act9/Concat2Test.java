package C7.Activities.Act9;

import BaseTests.ConsoleTest;
import C7.Activities.Act9.Concat2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Concat2Test extends ConsoleTest {
    Concat2 con;

    @Override
    @BeforeEach
    public void setUp(){
        super.setUp();
        con = new Concat2();
        con.words[0] = "Testy";
        con.words[1] = "McTest";
        con.words[2] = "Friendly";
        con.words[3] = "Little";
        con.words[4] = "Pest";
    }

    @Test
    public void printConcatFirstLast(){
        con.concatenateThese(0,4);
        assertEquals("TestyPest", getStrippedConsole());
    }

    @Test
    public void printConcatLastTwo(){
        con.concatenateThese(3,4);
        assertEquals("LittlePest", getStrippedConsole());
    }

    @Test
    public void printConcatLastFirst(){
        con.concatenateThese(4,0);
        assertEquals("PestTesty", getStrippedConsole());
    }

    @Test
    public void printConcatBothLast(){
        con.concatenateThese(4,4);
        assertEquals("PestPest", getStrippedConsole());
    }

    @Test
    public void printConcatFirstError(){
        con.concatenateThese(5,0);
        assertEquals("Invalid index", getStrippedConsole());
    }

    @Test
    public void printConcatSecondError(){
        con.concatenateThese(0,5);
        assertEquals("Invalid index", getStrippedConsole());
    }

    @Test
    public void printConcatBothError(){
        con.concatenateThese(5,5);
        assertEquals("Invalid index", getStrippedConsole());
    }

}