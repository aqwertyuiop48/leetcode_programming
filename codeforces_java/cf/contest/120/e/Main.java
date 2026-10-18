import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out)).ifPresent(out ->
        Optional.of(new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in))).ifPresent(s ->
            out.println(IntStream.range(0, s.nextInt()).mapToObj(i -> String.valueOf(1 - s.nextInt() % 2))
                .collect(Collectors.joining("\n")))));
    }
}
