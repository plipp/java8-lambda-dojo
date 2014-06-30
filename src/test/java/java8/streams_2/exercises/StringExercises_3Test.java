package java8.streams_2.exercises;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class StringExercises_3Test {
    @Test
    public void noLowercaseLettersInAnEmptyString() {
        assertEquals(0, StringExercises_3.countLowercaseLetters(""));
    }

    @Test
    public void countsLowercaseLetterExample() {
        assertEquals(3, StringExercises_3.countLowercaseLetters("aBcDeF"));
    }

    @Test
    public void suppoertsNoLowercaseLetters() {
        assertEquals(0, StringExercises_3.countLowercaseLetters("ABCDEF"));
    }

    @Test
    public void noStringReturnedForEmptyList() {
        assertFalse(StringExercises_3.mostLowercaseString(Collections.<String>emptyList()).isPresent());
    }

    @Test
    public void findsMostLowercaseString() {
        Optional<String> result = StringExercises_3.mostLowercaseString(Arrays.asList("a", "abc", "ABCde"));
        assertEquals(result, Optional.of("abc"));
    }
}