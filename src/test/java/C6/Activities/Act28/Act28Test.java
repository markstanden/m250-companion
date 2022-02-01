package C6.Activities.Act28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Act28Test {
    Act28 t = new Act28();

    @BeforeEach
    public void setUp() {
        t.mySet.add(0.0);
        t.mySet.add(1.1);
        t.mySet.add(2.2);
        t.mySet.add(3.3);
        t.mySet.add(4.4);
    }

    @Test
    public void testHighest(){
        assertEquals(4.4, t.returnHighest());
    }

    @Test
    public void testSlightlyHigher(){
        t.mySet.add(4.4000001);
        assertEquals(4.4000001, t.returnHighest());
    }

    @Test
    public void testRemovedPreviousHighest(){
        t.mySet.remove(4.4);
        assertEquals(3.3, t.returnHighest());
    }

}
