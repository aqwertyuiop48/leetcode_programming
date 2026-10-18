import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(IntStream.generate(s::nextInt).limit(n).toArray()).ifPresent(a ->
            Optional.of(new int[n + 1]).ifPresent(pos ->
            Optional.of(new int[n + 1]).ifPresent(t ->
            Optional.of(new int[]{0}).ifPresent(len ->
                System.out.print(IntStream.range(0, n).allMatch(i -> (pos[s.nextInt()] = i) >= 0)
                    && IntStream.range(0, n).allMatch(i -> Optional.of(-pos[a[i]]).map(x -> Optional.of(Arrays.binarySearch(t, 0, len[0], x)).map(r -> r < 0 ? -r - 1 : r).get()).map(p -> (t[p] = -pos[a[i]]) <= 0 & (len[0] = Math.max(len[0], p + 1)) > 0).get())
                    ? len[0] : -1)))))));
    }
}




