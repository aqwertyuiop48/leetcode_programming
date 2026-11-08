import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer a && Integer.valueOf(t[2]) instanceof Integer b
            && new int[]{-1, 0} instanceof int[] c
            ? n > a * b ? "-1" : IntStream.range(0, a).mapToObj(i -> IntStream.range(0, b).mapToObj(j -> String.valueOf((i + j) % 2 == 0 ? (c[0] += 2) <= n ? c[0] : 0 : (c[1] += 2) <= n ? c[1] : 0)).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
