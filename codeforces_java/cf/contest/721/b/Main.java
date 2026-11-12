import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer k
            && Integer.valueOf(t[n + 2].length()) instanceof Integer len
            && Integer.valueOf((int) IntStream.range(0, n).filter(i -> t[2 + i].length() < len).count()) instanceof Integer a
            && Integer.valueOf((int) IntStream.range(0, n).filter(i -> t[2 + i].length() == len).count()) instanceof Integer b
            ? (a + 1 + 5 * (a / k)) + " " + (a + b + 5 * ((a + b - 1) / k)) : "");
    }
}
