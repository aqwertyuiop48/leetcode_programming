import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer a && Integer.valueOf(t[2]) instanceof Integer b
            && new int[]{0} instanceof int[] run
            && IntStream.range(0, n).map(i -> t[4].charAt(i) == 49 ? (run[0] = 0) : ++run[0] == b ? (run[0] = 0) + i + 1 : 0).toArray() instanceof int[] pos
            && Long.valueOf(Arrays.stream(pos).filter(p -> p > 0).count() - a + 1) instanceof Long m
            ? m + "\n" + Arrays.stream(pos).filter(p -> p > 0).limit(m).mapToObj(Integer::toString).collect(Collectors.joining(" ")) : "");
    }
}
