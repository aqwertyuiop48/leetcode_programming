import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && new int[1000001] instanceof int[] c && new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 6} instanceof int[] sg
            && IntStream.range(0, 1000001).allMatch(x -> (c[x] = x == 0 ? 0 : c[x / 10] + sg[x % 10]) >= 0)
            ? IntStream.rangeClosed(Integer.parseInt(t[0]), Integer.parseInt(t[1])).mapToLong(x -> c[x]).sum() : "");
    }
}
