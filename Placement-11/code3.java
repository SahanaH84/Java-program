import java.util.*;

public class code3 {

    public static List<String> findClubbedWords(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();

        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                String prefix = word.substring(0, i);
                String suffix = word.substring(i);

                if (wordSet.contains(prefix) && wordSet.contains(suffix) && !word.equals(prefix) && !word.equals(suffix)) {
                    result.add(word);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of words:");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] words = new String[count];
        System.out.println("Enter the words:");

        for (int i = 0; i < count; i++) {
            words[i] = scanner.nextLine();
        }

        List<String> output = findClubbedWords(words);

        System.out.println("\nClubbed Words:");
        Set<String> uniqueOutput = new HashSet<>(output);
        if (uniqueOutput.isEmpty()) {
            System.out.println("No clubbed words found.");
        } else {
            for (String word : uniqueOutput) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}