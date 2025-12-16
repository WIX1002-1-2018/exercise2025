package W09;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * W09E06 - Demonstrating java.io.File Usage
 * Purpose: Showcase common `File` operations without heavy I/O: creating
 *          references, checking existence/metadata, creating files/directories,
 *          listing directory contents, and deleting temporary artifacts.
 * Key Concepts: path vs existence, absolute vs relative paths, `isFile()` vs
 *               `isDirectory()`, `length()`, `lastModified()`, `mkdirs()`,
 *               `list()`, safe creation/deletion with guards.
 * Notes: Uses a temp directory `demoDir` and file `demoDir/example.txt` in the
 *        working directory; cleans them up at the end.
 *
 * @author pensyarah
 */
public class W09E06 {

    public static void main(String[] args) {
        File workingDir = new File(".");
        File demoDir = new File("demoDir");
        File demoFile = new File(demoDir, "example.txt");

        System.out.println("Working dir absolute: " + workingDir.getAbsolutePath());

        // Create directory if needed
        if (!demoDir.exists()) {
            boolean created = demoDir.mkdirs();
            System.out.println("Created demoDir: " + created);
        }

        // Create a small empty file
        try {
            if (demoFile.createNewFile()) {
                System.out.println("Created file: " + demoFile.getPath());
            } else {
                System.out.println("File already exists: " + demoFile.getPath());
            }
        } catch (IOException e) {
            System.out.println("Could not create file: " + e.getMessage());
        }

        // Metadata checks
        System.out.println("demoFile exists? " + demoFile.exists());
        System.out.println("demoFile is file? " + demoFile.isFile());
        System.out.println("demoDir is directory? " + demoDir.isDirectory());
        System.out.println("demoFile length (bytes): " + demoFile.length());
        System.out.println("demoFile lastModified: " + demoFile.lastModified());

        // List contents of demoDir
        String[] contents = demoDir.list();
        if (contents != null) {
            System.out.println("demoDir contents: " + Arrays.toString(contents));
        }

        // Cleanup: delete file then directory
        boolean fileDeleted = demoFile.delete();
        boolean dirDeleted = demoDir.delete();
        System.out.println("Cleanup fileDeleted=" + fileDeleted + ", dirDeleted=" + dirDeleted);
    }
}