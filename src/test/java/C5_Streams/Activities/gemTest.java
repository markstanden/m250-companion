package C5_Streams.Activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import BaseTests.ConsoleTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class gemTest extends ConsoleTest {

    private List<Gem> gems;
    private Solution solution;

    @BeforeEach
    public void setUp() {
        super.setUp();

        gems = new ArrayList<Gem>();
        gems.add(new Gem("ruby", "red", 1.0));
        gems.add(new Gem("ruby", "pink", 2.0));
        gems.add(new Gem("diamond", "pink", 2.0));
        gems.add(new Gem("diamond", "clear", 4.0));
        gems.add(new Gem("ruby", "clear", 3.0));
        gems.add(new Gem("sapphire", "blue", 2.0));
        gems.add(new Gem("glass", "clear", 2.0));
        gems.add(new Gem("brick", "red", 5.0));
        gems.add(new Gem("lips", "red", 0.01));
        gems.add(new Gem("emerald", "green", 0.01));

        solution = new Solution();
    }

    @Test
    public void firstFourNonDiamondsTest() {
        solution.printNonDiamonds(gems);
        assertEquals("ruby, colour = red, weight = 1.0\n" +
                "ruby, colour = pink, weight = 2.0\n" +
                "ruby, colour = clear, weight = 3.0\n" +
                "sapphire, colour = blue, weight = 2.0", getStrippedConsole());
    }

    @Test
    public void getNumberOfBlueOrGreenTest() {
        long testOutput = solution.getNumberOfBlueOrGreen(gems);
        assertEquals(2, testOutput);
    }

    @Test
    public void rubyWeightTest() {
        double testOutput = solution.getTotalWeightOfKind(gems, "ruby");
        assertEquals(6.0, testOutput);
    }

    @Test
    public void brickWeightTest() {
        double testOutput = solution.getTotalWeightOfKind(gems, "brick");
        assertEquals(5.0, testOutput);
    }

    @Test
    public void nonRubyGemTest() {
        solution.printNonRubyWeights(gems);
        assertEquals("2.0\n4.0\n2.0\n2.0\n5.0\n0.01\n0.01", getStrippedConsole());
    }

    @Test
    public void redGemTest() {
        solution.printRedGems(gems);
        assertEquals("ruby, colour = red, weight = 1.0\n" +
                "brick, colour = red, weight = 5.0\n" +
                "lips, colour = red, weight = 0.01", getStrippedConsole());
    }
}

