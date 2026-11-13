import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            && Arrays.stream(w).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && IntStream.range(0, m).map(i -> t[3 + 2 * i] - t[2 + 2 * i] + 1).boxed().min(Integer::compare).get() instanceof Integer len
            ? len + "\n" + IntStream.range(0, n).mapToObj(i -> Integer.toString(i % len)).collect(Collectors.joining(" ")) : "");
    }
}
