import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new long[n + 1] instanceof long[] bal
            && IntStream.range(0, m).allMatch(i -> (bal[Integer.parseInt(t[2 + 3 * i])] -= Long.parseLong(t[4 + 3 * i])) > Long.MIN_VALUE & (bal[Integer.parseInt(t[3 + 3 * i])] += Long.parseLong(t[4 + 3 * i])) > Long.MIN_VALUE)
            ? Arrays.stream(bal).filter(b -> b > 0).sum() : "");
    }
}
