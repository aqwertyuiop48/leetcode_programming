import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Integer m
            && IntStream.rangeClosed(1, 5 * m + 5).filter(n -> IntStream.iterate(n / 5, x -> x > 0, x -> x / 5).sum() == m).toArray() instanceof int[] r
            ? r.length + (r.length > 0 ? "\n" + Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "") : "");
    }
}
