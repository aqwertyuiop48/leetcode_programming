import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> sc.next()).collect(Collectors.joining()) instanceof String g
            && Integer.valueOf((int) g.chars().filter(Character::isDigit).count()) instanceof Integer k
            && Integer.valueOf(g.indexOf('@')) instanceof Integer apple
            && new int[]{-m, m, -1, 1} instanceof int[] dc
            && Integer.valueOf(1 << (2 * (k - 1))) instanceof Integer P
            && IntStream.rangeClosed(1, k).map(d -> g.indexOf((char) ('0' + d))).toArray() instanceof int[] pos
            && IntStream.range(0, k - 1).map(j -> IntStream.range(0, 4).filter(d -> pos[j] + dc[d] == pos[j + 1] && (d < 2 || pos[j] / m == pos[j + 1] / m)).findFirst().getAsInt()).toArray() instanceof int[] d0
            && Integer.valueOf(IntStream.range(0, k - 1).map(j -> d0[j] << (2 * j)).sum()) instanceof Integer code0
            && new boolean[n * m * P] instanceof boolean[] seen
            && new int[n * m * P] instanceof int[] q
            && new int[]{0, 1, 0} instanceof int[] st
            && (q[0] = pos[0] * P + code0) >= 0 && (seen[q[0]] = true)
            ? IntStream.iterate(0, lv -> st[0] < st[1], lv -> lv + 1).filter(lv -> Integer.valueOf(st[1]) instanceof Integer end
                && IntStream.range(st[0], end).anyMatch(i -> Integer.valueOf(q[i] / P) instanceof Integer head && Integer.valueOf(q[i] % P) instanceof Integer code
                    && new int[]{head} instanceof int[] cur
                    && IntStream.range(0, 4).anyMatch(d -> Integer.valueOf(head + dc[d]) instanceof Integer nh
                        && nh >= 0 && nh < n * m && (d >= 2 ? head / m == nh / m : true) && g.charAt(nh) != '#'
                        && (cur[0] = head) == head
                        && IntStream.range(0, Math.max(0, k - 2)).noneMatch(j -> (cur[0] += dc[code >> (2 * j) & 3]) == nh)
                        && Integer.valueOf((code << 2 | (d ^ 1)) & (P - 1)) instanceof Integer nc
                        && (nh.equals(apple) || !seen[nh * P + nc] && (seen[nh * P + nc] = true) && (q[st[1]++] = nh * P + nc) >= 0 && false))
                    ) | (st[0] = end) < 0).findFirst() instanceof OptionalInt ok && ok.isPresent() ? ok.getAsInt() + 1 : -1 : "");
    }
}

