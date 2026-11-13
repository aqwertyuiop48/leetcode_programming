import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            && Arrays.stream(w).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            ? IntStream.range(0, m).map(i -> Math.max(0, IntStream.rangeClosed(t[2 + n + 2 * i], t[3 + n + 2 * i]).map(k -> t[1 + k]).sum())).sum() : "");
    }
}
