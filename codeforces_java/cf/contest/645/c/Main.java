import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer k
            && IntStream.range(0, n).filter(i -> t[2].charAt(i) == '0').toArray() instanceof int[] p
            ? IntStream.range(0, p.length - k).map(i -> Integer.valueOf(Arrays.binarySearch(p, i, i + k + 1, (p[i] + p[i + k] + 1) / 2)) instanceof Integer r && Integer.valueOf(Math.max(r, -r - 1)) instanceof Integer ip
                ? Math.min(Math.max(p[ip] - p[i], p[i + k] - p[ip]), Math.max(p[Math.max(ip - 1, i)] - p[i], p[i + k] - p[Math.max(ip - 1, i)])) : 0).min().getAsInt() : "");
    }
}
