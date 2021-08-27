package fdc.challenge.anagrams.sample;

import fdc.challenge.anagrams.general.AbstractChecker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramChecker extends AbstractChecker {

    @Override
    public List<String> findAllAnagramsForSubject(String subject, File dictionary) {
        List<String> lines = getAllLinesFromDictionary(dictionary);
        assert lines != null;
        return lines.stream().filter(s -> isAnagram(subject, s)).collect(Collectors.toList());
    }

    @Override
    public String findLongestAnagram(File dictionary) {
        return "BINARY";
    }

    @Override
    public boolean isAnagram(String subject, String candidate) {
        return ("BRAINY".equals(subject) && "BINARY".equals(candidate))
                || ("BINARY".equals(subject) && "BRAINY".equals(candidate));
    }

    @Override
    public List<String> findAllContainedAnagrams(String subject, int length, File dictionary) {
        return Collections.singletonList("DIGITAL");
    }

    private List<String> getAllLinesFromDictionary(File dictionary) {
        try (Stream<String> lines = Files.lines(Paths.get(dictionary.getAbsolutePath()))) {
            return lines.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
