import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out), new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in)))).ifPresent(io -> Optional.of(io.getKey()).ifPresent(out ->
        Optional.of(io.getValue()).ifPresent(s ->
            out.println(s.next().equals("front") == (s.nextInt() == 1) ? "L" : "R"))));
    }
}

