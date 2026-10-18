import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out), new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in)))).ifPresent(io -> Optional.of(io.getKey()).ifPresent(out ->
        Optional.of(io.getValue()).ifPresent(s ->
            Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nk ->
                out.println(IntStream.range(0, nk[0]).map(i -> s.nextInt())
                    .map(a -> a - nk[1] * Math.min(3, a / nk[1])).sum())))));
    }
}
