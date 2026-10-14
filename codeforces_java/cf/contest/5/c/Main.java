import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(str ->
            System.out.println(
                new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st
                && st.offerFirst(-1)
                && new int[]{0} instanceof int[] max
                && new int[]{1} instanceof int[] count
                && IntStream.range(0, str.length()).allMatch(i ->
                    str.charAt(i) == '(' ? st.offerFirst(i)
                    : st.pollFirst() != null
                      && (st.isEmpty()
                          ? st.offerFirst(i)
                          : (i - st.peekFirst() > max[0]
                              ? (max[0] = i - st.peekFirst()) >= 0 & (count[0] = 1) >= 0
                              : (i - st.peekFirst() == max[0]
                                  ? (count[0] += 1) >= 0
                                  : true))))
                ? max[0] + " " + count[0]
                : "")));
    }
}

