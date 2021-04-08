import java.io.FileReader;

class CountChar {
    final static String PATH = "./week-one/day-three/in/in.txt";

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: character to count must be given as command line argument.");
            return;
        }
        if (args[0].length() > 1) {
            System.out.println("Usage: argument must be 1 character.");
            return;
        }

        char toCount = args[0].charAt(0);
        int count = 0;
        try (FileReader fr = new FileReader(PATH)) {
            int c;
            while(true) {
                c = fr.read();
                if (c == -1) { break; }
                if (toCount == (char) c) { ++count; }
            }
        } catch (Exception e) {
            System.out.println("A problem occurred");
            return;
        }

        System.out.println("The character '" + toCount + "' was found " + count + " times.");
    }
}