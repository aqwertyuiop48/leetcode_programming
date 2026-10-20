import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Boolean.valueOf(Boolean.valueOf(new java.io.File("input.txt").exists()) instanceof Boolean f
            && (f ? new java.io.FileInputStream("input.txt") : System.in) instanceof java.io.InputStream in
            && (f ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt")) : System.out) instanceof java.io.PrintStream out
            && (Integer) new Scanner(in).nextInt() instanceof Integer n
            && (Integer) (32 - Integer.numberOfLeadingZeros(n - 1)) instanceof Integer m
            && out.append(m + "\n" + IntStream.range(0, m).mapToObj(j ->
                IntStream.range(0, n).filter(i -> (i >> j & 1) == 1).count() + IntStream.range(0, n).filter(i -> (i >> j & 1) == 1).mapToObj(i -> " " + (i + 1)).collect(Collectors.joining())).collect(Collectors.joining("\n")) + "\n").checkError());
    }
}
