import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class code3 {

    public static void main(String[] args) {
        String directoryPath = "C:/Users/OneDrive/Documents";
        try {
            Map<String, Integer> wordFrequency = findMostCommonWord(directoryPath);
            displayMostCommonWords(wordFrequency);
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    static Map<String, Integer> findMostCommonWord(String directoryPath) throws IOException {
        Map<String, Integer> wordFrequency = new HashMap<>();

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] words = line.toLowerCase().split("\\s+");
                            for (String word : words) {
                                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                            }
                        }
                    }
                }
            }
        }

        return wordFrequency;
    }

    static void displayMostCommonWords(Map<String, Integer> wordFrequency) {
        int maxFrequency = 0;

        for (int frequency : wordFrequency.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        System.out.println("Most common word(s) with frequency " + maxFrequency + ":");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey());
            }
        }
    }
}
