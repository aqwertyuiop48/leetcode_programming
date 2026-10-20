import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf((n - 3) / 4) instanceof Integer a
            && ((IntBinaryOperator) (r, c) -> c == 0 && r >= 1 ? '^'
                : Integer.valueOf(r % 2 == 0 ? (r == 0 ? 0 : 1) : 0) instanceof Integer s0 && Integer.valueOf(r % 2 == 0 ? n - s0 : n - 1) instanceof Integer L
                && Integer.valueOf(r % 2 == 0 ? c - s0 : n - 1 - c) instanceof Integer k
                ? (k < 0 || k > L - 1 ? '.' : k == L - 1 ? (r < n - 1 ? 'v' : '.') : k < L - 2 - a - a + 2 || (k - (L - 2 - a - a + 2)) % 2 == 1 ? (r % 2 == 0 ? '>' : '<') : '.') : '.') instanceof IntBinaryOperator cell
            ? (n == 3 ? ">vv\n^<.\n^.<\n1 3" : n == 5 ? ">...v\nv.<..\n..^..\n>....\n..^.<\n1 1"
                : IntStream.range(0, n).mapToObj(r -> IntStream.range(0, n).mapToObj(c -> String.valueOf((char) cell.applyAsInt(r, c))).collect(Collectors.joining())).collect(Collectors.joining("\n")) + "\n1 1") : "");
    }
}
