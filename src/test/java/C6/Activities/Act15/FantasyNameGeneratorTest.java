package C6.Activities.Act15;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FantasyNameGeneratorTest extends ConsoleTest {

    @Test
    void getName() {
        FantasyNameGenerator fng = FantasyNameGenerator
                .create()
                .withName("Test")
                .withPlace("TestSuite")
                .withAnimal("Robot")
                .build();
        assertEquals("Test", fng.getName());
    }
}