import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n + 1).map(i -> i < n ? s.nextInt() : 0).toArray() instanceof int[] a
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st
            && new ArrayList<String>() instanceof ArrayList<String> out
            && IntStream.rangeClosed(1, n + 1).allMatch(i ->
                IntStream.generate(() -> 0).takeWhile(z -> st.size() > a[i - 1]).allMatch(z -> out.add(st.pop() + " " + (i - 1)))
                && IntStream.generate(() -> 0).takeWhile(z -> st.size() < a[i - 1]).allMatch(z -> st.offerFirst(i)))
            ? out.size() + (out.isEmpty() ? "" : "\n" + String.join("\n", out))
            : "");
    }
}

