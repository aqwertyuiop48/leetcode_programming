import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer m
            && IntStream.range(0, n).toArray() instanceof int[] comp
            && Long.valueOf(IntStream.range(0, m).filter(i -> Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer a
                && Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer b
                && comp[a] != comp[b]
                && Integer.valueOf(comp[b]) instanceof Integer cb
                && IntStream.range(0, n).filter(v -> comp[v] == cb).map(v -> comp[v] = comp[a]).count() >= 0).count()) instanceof Long merges
            && m == n - 1 && merges == n - 1 ? "yes" : "no");
    }
}
