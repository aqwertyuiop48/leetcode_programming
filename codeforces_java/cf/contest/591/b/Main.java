import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && tk.nextToken() instanceof String s && IntStream.range(0, 26).toArray() instanceof int[] q
            && IntStream.range(0, m).filter(i -> (Integer) (tk.nextToken().charAt(0) - 'a') instanceof Integer x && (Integer) (tk.nextToken().charAt(0) - 'a') instanceof Integer y
                && (x.equals(y) || (q[x] = q[x] ^ q[y]) + (q[y] = q[y] ^ q[x]) + (q[x] = q[x] ^ q[y]) >= 0)).count() >= 0
            && new int[26] instanceof int[] p && IntStream.range(0, 26).filter(l -> (p[q[l]] = l) >= 0).count() >= 0
            ? s.chars().mapToObj(c -> String.valueOf((char) ('a' + p[c - 'a']))).collect(Collectors.joining()) : "");
    }
}
