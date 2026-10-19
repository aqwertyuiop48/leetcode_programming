import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st && new int[]{0} instanceof int[] best
            && IntStream.range(0, n).map(i -> s.nextInt()).allMatch(x -> IntStream.iterate(0, z -> !st.isEmpty() && st.peek() < x, z -> z + 1).allMatch(z -> (best[0] = Math.max(best[0], x ^ st.pop())) >= 0)
                && (st.isEmpty() || (best[0] = Math.max(best[0], x ^ st.peek())) >= 0) && st.offerFirst(x))
            ? best[0] : "");
    }
}
