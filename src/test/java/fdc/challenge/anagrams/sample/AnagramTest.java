package fdc.challenge.anagrams.sample;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    void testSimpleAnagrams() {
        AnagramChecker checker = new AnagramChecker();
        assertTrue(checker.isAnagram("BRAINY", "BINARY"));
        assertTrue(checker.isAnagram("BINARY", "BRAINY"));
        assertFalse(checker.isAnagram("BRAINY", "BRAINY"));
        assertFalse(checker.isAnagram("DIGITAL", "BINARY"));
    }

    @Test
    void testFindAnagramsForSubject() {
        AnagramChecker checker = new AnagramChecker();
        File dictionary = new File("src/test/resources/fdc/challenge/anagrams/" + SampleApp.APP_NAME + "/sample_dictionary.txt");
        List<String> anagrams = checker.findAllAnagramsForSubject("BINARY", dictionary);
        assertEquals(1, anagrams.size());
        assertEquals("BRAINY", anagrams.get(0));
    }

    @Test
    void testFindLongestAnagram() {
        AnagramChecker checker = new AnagramChecker();
        File dictionary = new File("src/test/resources/fdc/challenge/anagrams/" + SampleApp.APP_NAME + "/sample_dictionary.txt");
        String longestAnagram = checker.findLongestAnagram(dictionary);
        assertEquals(6, longestAnagram.length());
    }

    @Test
    void testLongestContainedAnagram() {
        AnagramChecker checker = new AnagramChecker();
        File dictionary = new File("src/test/resources/fdc/challenge/anagrams/" + SampleApp.APP_NAME + "/sample_dictionary.txt");
        List<String> containedAnagrams = checker.findAllContainedAnagrams("DIGITALIS", 7, dictionary);
        assertEquals("DIGITAL", containedAnagrams.get(0));
    }
}
