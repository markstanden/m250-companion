import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestyChildrenTest {


    ByteArrayOutputStream console;
    TestyChildren tc;

    @BeforeEach
    public void setUp() {
        /* Redirect the stdout to our printstream
         * to monitor console output. */
        console = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(console);
        System.setOut(ps);

        HashSet<Integer> testData = new HashSet<>();
        Stream.iterate(1, x -> x + 1)
                .limit(100)
                .forEach(i -> testData.add(i));

        tc = new TestyChildren();
        HashSet<String> one = new HashSet<>();
        one.add("John");
        one.add("Steve");
        one.add("Scott");
        one.add("Nick");
        tc.children.put(1, one);

        HashSet<String> two = new HashSet<>();
        two.add("Andy");
        two.add("Jim");
        two.add("Alex");
        tc.children.put(2, two);

        HashSet<String> three = new HashSet<>();
        three.add("Brian");
        three.add("Gary");
        tc.children.put(3, three);

        HashSet<String> four = new HashSet<>();
        four.add("Nick");
        four.add("Chris");
        tc.children.put(4, four);

        HashSet<String> five = new HashSet<>();
        five.add("Mike");
        tc.children.put(5, five);
    }

    @Test
    void moreThan3Children() {

    }
}