import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] t
                && Stream.iterate(new long[]{1, n, 0, 0}, st -> st[0] <= st[1],
                        st -> st[2] <= st[3]
                            ? new long[]{st[0] + 1, st[1], st[2] + t[(int) st[0] - 1], st[3]}
                            : new long[]{st[0], st[1] - 1, st[2], st[3] + t[(int) st[1] - 1]})
                    .reduce((x, y) -> y).get() instanceof long[] midSt
                && (midSt[0] == midSt[1]
                    ? new long[]{midSt[2] <= midSt[3] ? midSt[0] + 1 : midSt[0], midSt[2] <= midSt[3] ? midSt[1] : midSt[1] - 1}
                    : new long[]{midSt[0], midSt[1]}) instanceof long[] finalSt
                ? (finalSt[0] - 1) + " " + (n - finalSt[1])
                : "")));
    }
}





