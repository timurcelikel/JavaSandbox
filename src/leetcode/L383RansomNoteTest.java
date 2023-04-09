package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L383RansomNoteTest {

    L383RansomNote l383RansomNote;

    @Before
    public void setUp() {
        l383RansomNote = new L383RansomNote();
    }

    @Test
    public void canConstruct1() {
        boolean actual = l383RansomNote.canConstruct("aa", "aab");
        assertTrue(actual);
    }

    @Test
    public void canConstruct2() {
        boolean actual = l383RansomNote.canConstruct("abc", "abc");
        assertTrue(actual);
    }

    @Test
    public void canConstruct3() {
        boolean actual = l383RansomNote.canConstruct("d", "abc");
        assertFalse(actual);
    }
}