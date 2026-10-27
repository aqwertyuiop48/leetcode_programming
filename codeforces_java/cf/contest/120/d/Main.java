import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out), new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in)))).ifPresent(io -> Optional.of(io.getKey()).ifPresent(out ->
        Optional.of(io.getValue()).ifPresent(s ->
            Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
                Optional.of(IntStream.range(0, nm[0]).mapToObj(i -> IntStream.range(0, nm[1]).map(j -> s.nextInt()).toArray()).toArray(int[][]::new)).ifPresent(g ->
                    Optional.of(IntStream.range(0, 3).map(i -> s.nextInt()).sorted().toArray()).ifPresent(target ->
                        out.println(Stream.of(
                                Arrays.stream(g).mapToInt(r -> Arrays.stream(r).sum()).toArray(),
                                IntStream.range(0, nm[1]).map(j -> IntStream.range(0, nm[0]).map(i -> g[i][j]).sum()).toArray())
                            .mapToLong(v -> IntStream.range(1, v.length).mapToLong(i -> IntStream.range(i + 1, v.length).filter(j ->
                                Arrays.equals(IntStream.of(Arrays.stream(v, 0, i).sum(), Arrays.stream(v, i, j).sum(), Arrays.stream(v, j, v.length).sum()).sorted().toArray(), target)).count()).sum())
                            .sum())))))));
    }
}

