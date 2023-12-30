import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class code1 {

    public static void main(String[] args) {
        String folderPath = "C:/Users/OneDrive/Documents";
        String extension = "txt";

        List<String> filteredFiles = getFilesWithExtension(folderPath, extension);

        System.out.println("Files with extension ." + extension + " in " + folderPath + ":");
        for (String file : filteredFiles) {
            System.out.println(file);
        }
    }

    static List<String> getFilesWithExtension(String folderPath, String extension) {
        List<String> resultFiles = new ArrayList<>();

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith("." + extension)) {
                    resultFiles.add(file.getName());
                }
            }
        }

        return resultFiles;
    }
}
