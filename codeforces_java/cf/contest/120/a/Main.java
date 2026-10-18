import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out)).ifPresent(out ->
        Optional.of(new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in))).ifPresent(s ->
            out.println(s.next().equals("front") == (s.nextInt() == 1) ? "L" : "R")));
    }
}
