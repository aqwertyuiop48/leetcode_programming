import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && IntStream.range(0, m).map(j -> n - IntStream.range(0, n).filter(i -> t[2 + i].charAt(j) == '*').findFirst().orElse(n)).toArray() instanceof int[] h
            ? IntStream.range(1, m).map(j -> Math.max(0, h[j] - h[j - 1])).max().orElse(0) + " " + IntStream.range(1, m).map(j -> Math.max(0, h[j - 1] - h[j])).max().orElse(0) : "");
    }
}
