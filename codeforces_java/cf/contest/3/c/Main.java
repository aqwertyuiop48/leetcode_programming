import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.range(0, 3).mapToObj(i -> s.next()).collect(Collectors.joining())).ifPresent(b ->
            System.out.println(
                new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}} instanceof int[][] lines
                && new long[]{b.chars().filter(c -> c == 'X').count(), b.chars().filter(c -> c == '0').count()} instanceof long[] cnt
                && new boolean[]{Arrays.stream(lines).anyMatch(l -> b.charAt(l[0]) == 'X' && b.charAt(l[1]) == 'X' && b.charAt(l[2]) == 'X')} instanceof boolean[] winX
                && new boolean[]{Arrays.stream(lines).anyMatch(l -> b.charAt(l[0]) == '0' && b.charAt(l[1]) == '0' && b.charAt(l[2]) == '0')} instanceof boolean[] winO
                ? (cnt[0] < cnt[1] || cnt[0] > cnt[1] + 1 || (winX[0] && winO[0]) || (winX[0] && cnt[0] != cnt[1] + 1) || (winO[0] && cnt[0] != cnt[1])
                    ? "illegal"
                    : winX[0] ? "the first player won"
                    : winO[0] ? "the second player won"
                    : cnt[0] + cnt[1] == 9 ? "draw"
                    : cnt[0] == cnt[1] ? "first" : "second")
                : "")));
    }
}





