package fdc.challenge.anagrams.general;

import java.io.File;
import java.util.List;

/**
 * This is the abstract class that you should extend for this challenge.
 */
public abstract class AbstractChecker {

    /**
     * For a given subject (= a word/phrase/name), this should return all valid anagrams that can be found in the specified dictionary.
     * The returned list should be ordered alphabetically, in descending order.
     *
     * @param subject    The subject string to find anagrams for
     * @param dictionary The file containing the dictionary that should be used for finding anagrams
     * @return A list of all valid anagrams for the subject that can be found in the dictionary,
     * in alphabetically descending order.
     */
    public abstract List<String> findAllAnagramsForSubject(String subject, File dictionary);

    /**
     * This should find the longest possible anagram inside the specified dictionary.
     * If there are several possible longest anagrams, returning any of these is valid.
     *
     * @param dictionary The file containing the dictionary that should be used for finding the longest anagram
     * @return The longest possible anagram inside the dictionary
     */
    public abstract String findLongestAnagram(File dictionary);

    /**
     * Checks two given strings whether they are anagrams of each other.
     * An anagram means that both strings consist of exactly the same characters but in a different order.
     * For this purpose, only anagrams that use the same amount of characters (not a subset) are valid anagrams.
     * Example: For the subject "BRAINY", "BINARY" is an anagram.
     *
     * @param subject   The base string to make comparisons to
     * @param candidate The candidate string for determining whether it's an anagram to the subject
     * @return True, if the candidate is a valid anagram to the subject
     */
    public abstract boolean isAnagram(String subject, String candidate);

    /**
     * For a given subject, find all anagrams that could be created for a substring of n=length characters
     *
     * @param subject    The base string to use a substring from
     * @param length     The length of the substring to restrict anagrams to
     * @param dictionary The file containing the dictionary that should be used for finding the longest anagram
     * @return A list of anagrams that could be found with substrings of a certain length
     */
    public abstract List<String> findAllContainedAnagrams(String subject, int length, File dictionary);
}
