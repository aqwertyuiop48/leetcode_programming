import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf((int) (long) it.next()) instanceof Integer t && Integer.valueOf((int) Math.min(80, it.next())) instanceof Integer N
            && new long[82] instanceof long[] s && new long[82] instanceof long[] E && (s[0] = 1) > 0 && (s[1] = 2) > 0 && (E[1] = 1) > 0
            && IntStream.range(2, 82).allMatch(i -> (s[i] = s[i - 1] + s[i - 2]) > 0 && (E[i] = E[i - 2] + 1) > 0)
            && ((Function<Long, long[][]>) u -> Stream.iterate(new long[]{N, u, 0, 0}, r -> r[0] >= 0, r -> r[0] >= 2 ? (r[1] <= s[(int) r[0] - 1] ? new long[]{r[0] - 1, r[1], 0, 0} : new long[]{r[0] - 2, r[1] - s[(int) r[0] - 1], 0, 0}) : new long[]{-1, 0, 0, 0}).toArray(long[][]::new) instanceof long[][] rows
                && IntStream.iterate(rows.length - 1, i -> i >= 0, i -> i - 1).allMatch(i -> rows[i][0] == 0 ? (rows[i][2] = 0) + (rows[i][3] = 0) == 0
                    : rows[i][0] == 1 ? (rows[i][2] = rows[i][1] == 1 ? 0 : 1) + (rows[i][3] = 1 - rows[i][2]) == 1
                    : rows[i + 1][0] == rows[i][0] - 1 ? (rows[i][2] = Math.min(rows[i + 1][2], rows[i + 1][3] + 2)) >= 0 && (rows[i][3] = Math.min(rows[i + 1][2], rows[i + 1][3]) + 1 + E[(int) rows[i][0] - 2]) >= 0
                    : (rows[i][2] = rows[i + 1][2] + 1) > 0 && (rows[i][3] = rows[i + 1][3]) >= 0) ? rows : null) instanceof Function<Long, long[][]> trace
            ? IntStream.range(0, t).mapToObj(q -> Long.valueOf(it.next()) instanceof Long u && Long.valueOf(it.next()) instanceof Long v
                ? (u.equals(v) ? "0" : trace.apply(u) instanceof long[][] ru && trace.apply(v) instanceof long[][] rv
                    && Integer.valueOf(IntStream.range(0, ru.length).filter(i -> ru[i][0] <= 1 || ru[i + 1][0] != rv[i + 1][0]).findFirst().getAsInt()) instanceof Integer sp
                    && new long[]{ru[sp][0] <= 1 ? (ru[sp][1] == rv[sp][1] ? 0 : 1)
                        : ru[sp + 1][0] == ru[sp][0] - 1 ? Math.min(ru[sp + 1][2], ru[sp + 1][3]) + 1 + rv[sp + 1][2] : Math.min(rv[sp + 1][2], rv[sp + 1][3]) + 1 + ru[sp + 1][2]} instanceof long[] acc
                    && IntStream.iterate(sp - 1, i -> i >= 0, i -> i - 1).allMatch(i -> ru[i + 1][0] != ru[i][0] - 1 || (acc[0] = Math.min(acc[0], Math.min(ru[i + 1][2] + 2 + rv[i + 1][3], ru[i + 1][3] + 2 + rv[i + 1][2]))) >= 0)
                    ? String.valueOf(acc[0]) : "?")
                : "").collect(Collectors.joining("\n")) : "");
    }
}
