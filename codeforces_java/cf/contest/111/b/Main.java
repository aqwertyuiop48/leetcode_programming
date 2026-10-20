import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).map(tk -> Arrays.stream(tk).mapToInt(Integer::parseInt).toArray()).map(t -> new int[100001] instanceof int[] last ? IntStream.rangeClosed(1, t[0]).mapToObj(i -> IntStream.rangeClosed(1, (int) Math.sqrt(t[2 * i - 1])).filter(d -> t[2 * i - 1] % d == 0).flatMap(d -> d * d == t[2 * i - 1] ? IntStream.of(d) : IntStream.of(d, t[2 * i - 1] / d)).toArray() instanceof int[] dv && (Long) IntStream.of(dv).filter(d -> last[d] < i - t[2 * i]).count() instanceof Long c && IntStream.of(dv).allMatch(d -> (last[d] = i) > 0) ? String.valueOf(c) : "").collect(Collectors.joining("\n")) : "").ifPresent(System.out::println);
    }
}

