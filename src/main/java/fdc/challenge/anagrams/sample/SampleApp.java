package fdc.challenge.anagrams.sample;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class SampleApp {

    // TODO: change this for your application
    public static final String APP_NAME = "sample";

    public static void main(String[] args) throws URISyntaxException, IOException {
        AnagramChecker checker = new AnagramChecker();


        File dictionary = getFileFromResource("fdc/challenge/anagrams/" + APP_NAME + "/sample_dictionary.txt");
        PrintWriter writer = new PrintWriter("output/" + APP_NAME + "/anagrams", StandardCharsets.UTF_8);
        List<String> anagrams = checker.findAllAnagramsForSubject("BINARY", dictionary);
        anagrams.forEach(writer::println);
        writer.close();
    }

    private static File getFileFromResource(String path) throws URISyntaxException {
        ClassLoader classLoader = SampleApp.class.getClassLoader();
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + path);
        } else {
            return new File(resource.toURI());
        }
    }
}
