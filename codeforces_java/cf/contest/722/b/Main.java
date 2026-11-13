import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).replace("\r", "").split("\n") instanceof String[] ln
            && Integer.valueOf(ln[0].trim()) instanceof Integer n
            && Arrays.stream(ln[1].trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] p
            ? (IntStream.range(0, n).allMatch(i -> ln[2 + i].chars().filter(c -> "aeiouy".indexOf(c) >= 0).count() == p[i]) ? "YES" : "NO") : "");
    }
}
