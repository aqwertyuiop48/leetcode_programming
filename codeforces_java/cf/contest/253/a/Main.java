import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry(new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in, new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new Scanner(io.getKey()) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Character.valueOf(n > m ? 'B' : 'G') instanceof Character f && Character.valueOf(n > m ? 'G' : 'B') instanceof Character o
            ? IntStream.range(0, 2 * Math.min(n, m)).mapToObj(i -> String.valueOf(i % 2 == 0 ? f : o)).collect(Collectors.joining())
                + String.valueOf(f).repeat(Math.abs(n - m)) : ""));
    }
}
