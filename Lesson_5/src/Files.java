import java.io.File;

public class Files {

    public static void main(String[] args) {
        String path = "c:\\Users\\krylo\\Google Диск\\My Library\\";
        File rootDir = new File(path);
        readFiles(rootDir, "");
    }

    private static void readFiles(File dir, String separator) {
        for (File currentFile : dir.listFiles()) {
            if (currentFile.isFile()) {
                System.out.println(separator + "File: " + currentFile.getName());
            }
            else {
                System.out.println(separator + "Dir: " + currentFile.getName());
                readFiles(currentFile, separator + "    ");
            }

        }

//        return readFiles("");
    }
}
