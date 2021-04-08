import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.StringJoiner;

class AppendToFile {
    final static String PATH = "./week-one/day-three/out/out.txt";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: Give text as command line arguments" +
                    " to append to file");
            return;
        }
        StringJoiner sj = new StringJoiner(" ");
        for (String arg : args) {
            sj.add(arg);
        }
        String toAppend = sj.toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true))) {
            writer.append(toAppend);
        } catch (Exception e) {
            System.out.println("A problem occurred.");
        }
    }
}
