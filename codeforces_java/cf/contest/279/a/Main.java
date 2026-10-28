import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer x && Integer.valueOf(s.nextInt()) instanceof Integer y
            && new int[]{0, 0} instanceof int[] pos && new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}} instanceof int[][] dirs
            ? IntStream.range(0, 400).filter(i -> Integer.valueOf(i / 2 + 1) instanceof Integer len && dirs[i % 4] instanceof int[] d
                && Integer.valueOf(pos[0] + d[0] * len) instanceof Integer ex && Integer.valueOf(pos[1] + d[1] * len) instanceof Integer ey
                && (x >= Math.min(pos[0], ex) && x <= Math.max(pos[0], ex) && y >= Math.min(pos[1], ey) && y <= Math.max(pos[1], ey) || (pos[0] = ex) == Integer.MIN_VALUE & (pos[1] = ey) == Integer.MIN_VALUE)).findFirst().getAsInt() : "");
    }
}
