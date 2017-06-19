/**
 * Created by user on 19.06.2017.
 */
public class Aufgabe1
{
    public static void main(String[] args)
    {
        //Create root-directory
        System.out.println("[INFO] Create Root-Directory...");
        Folder rootFolder = new Folder("Root");

        //Create various subdirectories
        System.out.println("[INFO] Create a sub-directory of root...");
        Folder firstSubDir = new Folder("FirstSubDir");
        rootFolder.Add(firstSubDir);
        System.out.println("[INFO] Create another sub-directory of root...");
        Folder secondSubdir = new Folder("SecondSubDir");
        rootFolder.Add(secondSubdir);
        System.out.println("[INFO] Create a sub-directory in the first-subdir...");
        firstSubDir.Add(new Folder("SubSubDir"));
        System.out.println("[INFO] Create a file in the first-subdir...");
        firstSubDir.Add(new File("File.jpg"));
        System.out.println("[INFO] Create a sub-directory in the second-subdir...");
        secondSubdir.Add(new Folder("SubSubDir"));
        System.out.println("[INFO] Create a second sub-directory in the second-subdir...");
        secondSubdir.Add(new Folder("SubSubDir2"));
        System.out.println("[INFO] Create a directory somewhere...");
        System.out.println("[INFO] Create a file in the root...");
        rootFolder.Add(new File("Root-File.txt"));

        //And print everything
        System.out.println("[INFO] Print Second-Sub-Dir...");
        secondSubdir.print();
        System.out.println("[INFO] Print Root...");
        rootFolder.print();
    }
}
