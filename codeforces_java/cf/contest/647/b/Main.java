import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new int[]{Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1} instanceof int[] b
            && IntStream.range(0, n).filter(i -> IntStream.range(0, m).filter(j -> t[2 + i].charAt(j) == '*' && (b[0] = Math.min(b[0], i)) >= 0 & (b[1] = Math.max(b[1], i)) >= 0 & (b[2] = Math.min(b[2], j)) >= 0 & (b[3] = Math.max(b[3], j)) >= 0).count() >= 0).count() >= 0
            ? b[1] < 0 ? 0 : Math.max(b[1] - b[0], b[3] - b[2]) + 1 : "");
    }
}
