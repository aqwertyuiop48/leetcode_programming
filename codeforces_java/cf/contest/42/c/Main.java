import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.range(0, 4).map(i -> s.nextInt()).toArray() instanceof int[] a
            && ((IntFunction<String>) i -> (a[i] /= 2) + (a[(i + 1) % 4] /= 2) > 0 ? "/" + (i + 1) : "") instanceof IntFunction<String> dv
            && ((IntFunction<String>) i -> a[i]++ + a[(i + 1) % 4]++ > 0 ? "+" + (i + 1) : "") instanceof IntFunction<String> ad
            ? Stream.iterate(0, i -> i + 1).takeWhile(i -> !Arrays.stream(a).allMatch(x -> x == 1)).map(i ->
                IntStream.range(0, 4).filter(k -> a[k] % 2 == 0 && a[(k + 1) % 4] % 2 == 0).boxed().findFirst().map(dv::apply)
                    .orElseGet(() -> IntStream.range(0, 4).filter(k -> a[k] % 2 == 1 && a[(k + 1) % 4] % 2 == 1 && Math.max(a[k], a[(k + 1) % 4]) > 1).boxed().findFirst().map(ad::apply)
                        .orElseGet(() -> Long.valueOf(IntStream.range(0, 4).filter(k -> a[k] % 2 == 0).count()) instanceof Long c
                            && Integer.valueOf(IntStream.range(0, 4).filter(k -> a[k] % 2 == 0).findFirst().getAsInt()) instanceof Integer e
                            ? ad.apply(e) + (c == 1 ? "\n" + ad.apply((e + 3) % 4) : "") : "")))
                .collect(Collectors.joining("\n"))
            : ""));
    }
}




