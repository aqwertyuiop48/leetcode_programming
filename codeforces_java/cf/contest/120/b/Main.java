import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out), new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in)))).ifPresent(io -> Optional.of(io.getKey()).ifPresent(out ->
        Optional.of(io.getValue()).ifPresent(s ->
            Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nk ->
                Optional.of(IntStream.range(0, nk[0]).map(i -> s.nextInt()).toArray()).ifPresent(a ->
                    out.println(IntStream.range(0, nk[0]).map(i -> (nk[1] - 1 + i) % nk[0])
                        .filter(i -> a[i] == 1).findFirst().getAsInt() + 1))))));
    }
}

