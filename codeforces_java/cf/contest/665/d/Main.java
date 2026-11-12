import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && Long.valueOf(Arrays.stream(a).filter(x -> x == 1).count()) instanceof Long c1
            && new boolean[2000002] instanceof boolean[] cp
            && IntStream.rangeClosed(2, 1415).filter(i -> !cp[i]).filter(i -> IntStream.iterate(i * i, j -> j <= 2000001, j -> j + i).filter(j -> cp[j] = true).count() >= 0).count() >= 0
            && (c1 > 1
                ? IntStream.concat(IntStream.generate(() -> 1).limit(c1), Arrays.stream(a).filter(x -> x > 1 && !cp[x + 1]).limit(1)).toArray()
                : IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(i + 1, n).filter(j -> !cp[a[i] + a[j]]).mapToObj(j -> new int[]{a[i], a[j]})).findFirst().orElse(new int[]{a[0]})) instanceof int[] res
            ? res.length + "\n" + Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
