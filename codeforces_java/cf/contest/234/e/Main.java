import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Boolean.valueOf(Boolean.valueOf(new java.io.File("input.txt").exists()) instanceof Boolean f
            && (f ? new java.io.FileInputStream("input.txt") : System.in) instanceof java.io.InputStream in
            && (f ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt")) : System.out) instanceof java.io.PrintStream out
            && new Scanner(in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) (n / 4) instanceof Integer m
            && new int[]{s.nextInt()} instanceof int[] xs
            && (Integer) s.nextInt() instanceof Integer a
            && (Integer) s.nextInt() instanceof Integer b
            && (Integer) s.nextInt() instanceof Integer c
            && new String[n] instanceof String[] nm
            && new int[n] instanceof int[] sc
            && IntStream.range(0, n).allMatch(i -> (nm[i] = s.next()) != null && (sc[i] = s.nextInt()) >= 0)
            && IntStream.range(0, n).boxed().sorted((p, q) -> sc[q] - sc[p]).map(i -> nm[i]).toList() instanceof List<String> srt
            && IntStream.range(0, 4).mapToObj(p -> new ArrayList<>(srt.subList(p * m, p * m + m))).toList() instanceof List<ArrayList<String>> pots
            && out.append(IntStream.range(0, m).mapToObj(g -> "Group " + (char) ('A' + g) + ":\n"
                + IntStream.range(0, 4).mapToObj(p -> pots.get(p).remove((g < m - 1 ? (xs[0] = (xs[0] * a + b) % c) : 0) % pots.get(p).size())).collect(Collectors.joining("\n"))).collect(Collectors.joining("\n")) + "\n").checkError());
    }
}
