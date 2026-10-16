import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && Integer.valueOf(s.nextInt()) instanceof Integer m
                && Integer.valueOf(s.nextInt()) instanceof Integer k
                && s.next() != null
                && Integer.valueOf(s.next().equals("head") ? -1 : 1) instanceof Integer d0
                && s.next() instanceof String str
                && new int[]{m, k, d0, 0} instanceof int[] st
                && (IntStream.range(0, str.length()).allMatch(i ->
                    (st[2] = st[1] + st[2] < 1 || st[1] + st[2] > n ? -st[2] : st[2]) != 0
                    && (st[0] += str.charAt(i) == '0' ? (st[0] < st[1] ? (st[0] > 1 ? -1 : 0) : (st[0] < n ? 1 : 0)) : 0) >= 0
                    && (st[1] += st[2]) > 0
                    && (str.charAt(i) == '0'
                        ? st[0] != st[1] || (st[3] = i + 1) < 0
                        : (st[0] = st[1] - 1 > n - st[1] ? 1 : n) > 0)) || true)
                ? (st[3] > 0 ? "Controller " + st[3] : "Stowaway")
                : ""));
    }
}



