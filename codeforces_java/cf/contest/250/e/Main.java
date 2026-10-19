import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().map(String::trim).filter(l -> !l.isEmpty()).toList() instanceof List<String> L
            && Integer.valueOf(Integer.parseInt(L.get(0).split("\\s+")[0])) instanceof Integer n
            && Integer.valueOf(Integer.parseInt(L.get(0).split("\\s+")[1])) instanceof Integer m
            && L.subList(1, n + 1).stream().map(String::toCharArray).toArray(char[][]::new) instanceof char[][] g
            && ((UnaryOperator<long[]>) st -> Integer.valueOf((int) st[0]) instanceof Integer f
                && Integer.valueOf((int) st[3]) instanceof Integer d
                && Integer.valueOf(d > 0 ? (int) st[2] : (int) st[1]) instanceof Integer pos
                && Integer.valueOf(d > 0 ? (int) st[2] + 1 : (int) st[1] - 1) instanceof Integer fr
                && Character.valueOf(fr < 0 || fr >= m ? '#' : g[f][fr]) instanceof Character c
                && Integer.valueOf(d > 0 ? (int) st[1] - 1 : (int) st[2] + 1) instanceof Integer o
                && (g[f + 1][pos] == '.'
                    ? (st[4] += 1) > 0 && (st[1] = st[2] = pos) >= 0 && (st[0] = f + 1) > 0 && (f + 1 < n - 1 || (st[5] = 1) > 0)
                    : c == '#'
                        ? (o < 0 || o >= m || g[f][o] == '#' ? (st[5] = 2) > 0 : (st[4] += 1 + st[2] - st[1]) > 0 && (st[3] = -d) != 0)
                        : c == '+'
                            ? (g[f][fr] = '.') == '.' && (st[4] += 1 + st[2] - st[1]) > 0 && (st[3] = -d) != 0
                            : (st[4] += 1) > 0 && (d > 0 ? (st[2] = fr) : (st[1] = fr)) >= 0) ? st : st) instanceof UnaryOperator<long[]> step
            && Stream.iterate(new long[]{0, 0, 0, 1, 0, 0}, x -> step.apply(x)).filter(x -> x[5] != 0).findFirst().get() instanceof long[] res
            ? (res[5] == 1 ? String.valueOf(res[4]) : "Never") : "");
    }
}
