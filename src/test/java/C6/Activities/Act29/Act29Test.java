package C6.Activities.Act29;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Act29Test {

    @Test
    void numDistinctValues() {
        Act29 act29 = new Act29();
        act29.myList.add(1);
        act29.myList.add(1);
        assertEquals(1, act29.numDistinctValues());
        act29.myList.add(2);
        act29.myList.add(2);
        assertEquals(2, act29.numDistinctValues());
        act29.myList.add(3);
        assertEquals(3, act29.numDistinctValues());
        act29.myList.add(4);
        assertEquals(4, act29.numDistinctValues());
        act29.myList.add(5);
        assertEquals(5, act29.numDistinctValues());
    }

    @Test
    void numDistinctValuesZero() {
        Act29 act29 = new Act29();
        assertEquals(0, act29.numDistinctValues());
    }
}