import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && s.next() != null
            && Integer.valueOf(s.next().equals("head") ? -1 : 1) instanceof Integer d0
            && s.next() instanceof String str
            && new boolean[n + 2] instanceof boolean[] cur
            && new boolean[n + 2] instanceof boolean[] nxt
            && (cur[m] = true)
            && new int[]{k, d0, 0} instanceof int[] reg
            && (IntStream.range(0, str.length()).allMatch(i ->
                (Integer) (reg[0] + reg[1] < 1 || reg[0] + reg[1] > n ? -reg[1] : reg[1]) instanceof Integer nd
                && (Integer) (reg[0] + nd) instanceof Integer nk
                && (Boolean) IntStream.rangeClosed(1, n).anyMatch(x -> cur[x]) instanceof Boolean any
                && IntStream.rangeClosed(1, n).allMatch(x ->
                    ((nxt[x] = (str.charAt(i) == '0' ? (cur[x - 1] || cur[x] || cur[x + 1]) && x != reg[0] : any) && x != nk) || true))
                && (Long) IntStream.rangeClosed(1, n).filter(x -> nxt[x]).count() instanceof Long alive
                && (alive > 0 || (reg[2] = i + 1) < 0)
                && IntStream.rangeClosed(1, n).allMatch(x -> (cur[x] = nxt[x]) || true)
                && (reg[0] = nk) > 0
                && (reg[1] = nd) != 0) || true)
            ? (reg[2] > 0 ? "Controller " + reg[2] : "Stowaway")
            : "");
    }
}

