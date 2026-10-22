import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[1 + 2 * i])).toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[2 + 2 * i])).toArray() instanceof int[] b
            && Integer.valueOf(IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray()[n - 1]) instanceof Integer th
            ? IntStream.range(0, n).mapToObj(i -> i < n / 2 || a[i] <= th ? "1" : "0").collect(Collectors.joining()) + "\n"
                + IntStream.range(0, n).mapToObj(i -> i < n / 2 || b[i] <= th ? "1" : "0").collect(Collectors.joining()) : "");
    }
}
