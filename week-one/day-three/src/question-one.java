import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

class GetRecursiveDir {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: provide a directory path.");
            return;
        }
        try {
            Path root = Path.of(args[0]);
            if (Files.isDirectory(root)) {
                traverseDir(0, root);
            }
            else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("Invalid path provided.");
        }
    }

    /*
        Recursive function to go through the elements of a directory and call
        itself if it finds another directory.

        Params: int  depth - counter used for indenting during printing
                Path dir   - the directory to be printed and traversed
     */
    private static void traverseDir(int depth, Path dir) {
        printIndented(depth, dir);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file : stream) {
                traverseDir(depth + 1, file);
            }
        } catch (Exception e) {
            // do nothing
        }
    }

    /*
        Prints the ending portion of the given path, indented to
        the provided depth.

        Params: int  depth - counter used for indenting during printing
                Path file  - the file/directory name to be printed
     */
    private static void printIndented(int depth, Path file) {
        file = file.getName(file.getNameCount() - 1);
        for (int i = 0; i < depth; ++i) {
            System.out.print("   ");
        }
        System.out.println(file.toString());
    }
}