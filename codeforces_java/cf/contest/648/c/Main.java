import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(IntStream.range(0, n * m).filter(x -> t[2 + x / m].charAt(x % m) == 'S').findFirst().getAsInt()) instanceof Integer s0
            && Integer.valueOf((int) IntStream.range(0, n).mapToLong(i -> t[2 + i].chars().filter(c -> c == '*').count()).sum() + 1) instanceof Integer moves
            && new int[]{s0 / m, s0 % m} instanceof int[] pos && new int[n * m] instanceof int[] vis
            ? IntStream.range(0, moves).mapToObj(i -> Integer.valueOf(IntStream.range(0, 4).filter(dd -> Integer.valueOf(pos[0] + (dd == 1 ? -1 : dd == 3 ? 1 : 0)) instanceof Integer nr && Integer.valueOf(pos[1] + (dd == 0 ? -1 : dd == 2 ? 1 : 0)) instanceof Integer nc
                    && nr >= 0 && nr < n && nc >= 0 && nc < m && (t[2 + nr].charAt(nc) == '*' && vis[nr * m + nc] == 0 || t[2 + nr].charAt(nc) == 'S' && i == moves - 1)).findFirst().getAsInt()) instanceof Integer d
                && (pos[0] += d == 1 ? -1 : d == 3 ? 1 : 0) > -5 && (pos[1] += d == 0 ? -1 : d == 2 ? 1 : 0) > -5 && (vis[pos[0] * m + pos[1]] = 1) > 0
                ? String.valueOf("LURD".charAt(d)) : "").collect(Collectors.joining()) : "");
    }
}
