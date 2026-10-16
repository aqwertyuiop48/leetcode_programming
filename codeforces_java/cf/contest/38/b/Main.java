import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +") instanceof String[] t
            && new int[]{t[0].charAt(0) - 'a', t[0].charAt(1) - '1', t[1].charAt(0) - 'a', t[1].charAt(1) - '1'} instanceof int[] p
            ? IntStream.range(0, 64).filter(s -> !(s / 8 == p[0] || s % 8 == p[1]
                || (s / 8 == p[2] && s % 8 == p[3])
                || Math.abs(s / 8 - p[2]) * Math.abs(s % 8 - p[3]) == 2
                || Math.abs(s / 8 - p[0]) * Math.abs(s % 8 - p[1]) == 2)).count()
            : 0);
    }
}




