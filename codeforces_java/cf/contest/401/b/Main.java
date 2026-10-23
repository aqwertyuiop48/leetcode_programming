import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && (Integer) Integer.parseInt(t[0]) instanceof Integer x
            && new boolean[x + 1] instanceof boolean[] u
            && new int[]{2, 0} instanceof int[] p
            && IntStream.range(0, Integer.parseInt(t[1])).allMatch(i -> t[p[0]].equals("1")
                ? (u[Integer.parseInt(t[p[0] + 1])] = u[Integer.parseInt(t[p[0] + 2])] = true) && (p[0] += 3) > 0
                : (u[Integer.parseInt(t[p[0] + 1])] = true) && (p[0] += 2) > 0)
            ? IntStream.range(1, x).map(i -> u[i] ? (p[1] = 0) : (++p[1]) % 2).sum() + " " + IntStream.range(1, x).filter(i -> !u[i]).count() : "");
    }
}
