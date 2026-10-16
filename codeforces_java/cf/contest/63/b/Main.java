import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt()}).ifPresent(nk ->
            System.out.println(
                IntStream.range(0, nk[0]).map(i -> sc.nextInt()).toArray() instanceof int[] a
                && IntStream.rangeClosed(0, nk[1]).map(r -> (int) Arrays.stream(a).filter(x -> x == r).count()).toArray() instanceof int[] cnt
                ? Stream.iterate(cnt, c -> c[nk[1]] < nk[0], c -> IntStream.rangeClosed(0, nk[1]).map(r -> c[r] + (r > 1 && c[r - 1] > 0 ? 1 : 0) - (r >= 1 && r < nk[1] && c[r] > 0 ? 1 : 0)).toArray())
                    .mapToInt(c -> 1).sum()
                : 0)));
    }
}



