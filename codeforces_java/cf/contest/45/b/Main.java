import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.println(
            IntStream.range(0, a[0]).map(i -> s.nextInt() - 1).toArray() instanceof int[] g
            && IntStream.range(0, a[1]).map(i -> s.nextInt()).toArray() instanceof int[] v
            && IntStream.range(0, a[1]).map(i -> s.nextInt()).toArray() instanceof int[] b
            && new boolean[a[0]] instanceof boolean[] seen
            && new int[]{0} instanceof int[] res
            ? IntStream.range(0, a[1]).mapToObj(i -> "" + (res[0] = (int) IntStream.iterate((v[i] + res[0] - 1) % a[0], x -> g[x]).limit(Math.min(b[i], a[0])).filter(x -> !seen[x] && (seen[x] = true)).count())).collect(Collectors.joining("\n"))
            : "")));
    }
}



