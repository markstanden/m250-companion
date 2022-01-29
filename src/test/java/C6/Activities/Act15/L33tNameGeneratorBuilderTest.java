package C6.Activities.Act15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L33tNameGeneratorBuilderTest {

    @Test
    void testBuilderFull() {
        L33tNameGenerator fng = L33tNameGenerator.create()
                .withName("Test")
                .withPlace("TestSuite")
                .withLang("Java")
                .build();
        assertEquals("test", fng.getNAME());
        assertEquals("testsuite", fng.getPLACE());
        assertEquals("java", fng.getLANG());
    }
    @Test
    void testBuilderNoName() {
        L33tNameGenerator fng = L33tNameGenerator.create()
                .withPlace("TestSuite")
                .withLang("Java")
                .build();
        assertEquals("", fng.getNAME());
        assertEquals("testsuite", fng.getPLACE());
        assertEquals("java", fng.getLANG());
    }

    @Test
    void testBuilderNoPlace() {
        L33tNameGenerator fng = L33tNameGenerator.create()
                .withName("Test")
                .withLang("Java")
                .build();
        assertEquals("test", fng.getNAME());
        assertEquals("", fng.getPLACE());
        assertEquals("java", fng.getLANG());
    }

    @Test
    void testBuilderNoAnimal() {
        L33tNameGenerator fng = L33tNameGenerator.create()
                .withName("Test")
                .withPlace("TestSuite")
                .build();
        assertEquals("test", fng.getNAME());
        assertEquals("testsuite", fng.getPLACE());
        assertEquals("", fng.getLANG());
    }

    @Test
    void testBuilderNothing() {
        L33tNameGenerator fng = L33tNameGenerator.create()
                .build();
        assertEquals("", fng.getNAME());
        assertEquals("", fng.getPLACE());
        assertEquals("", fng.getLANG());
    }
}