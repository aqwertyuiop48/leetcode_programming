import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.range(0, n).boxed().flatMap(l -> IntStream.range(l, n).mapToObj(r ->
                IntStream.rangeClosed(l, r).map(i -> a[i]).sorted().toArray() instanceof int[] in && IntStream.concat(IntStream.range(0, l), IntStream.range(r + 1, n)).map(i -> -a[i]).sorted().map(x -> -x).toArray() instanceof int[] out
                    ? IntStream.of(in).sum() + IntStream.range(0, Math.min(k, Math.min(in.length, out.length))).map(i -> Math.max(0, out[i] - in[i])).sum() : 0)).mapToInt(x -> x).max().getAsInt() : 0);
    }
}
