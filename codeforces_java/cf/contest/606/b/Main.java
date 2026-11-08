import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer x && Integer.valueOf(t.nextToken()) instanceof Integer y
            && Integer.valueOf(t.nextToken()) instanceof Integer x0 && Integer.valueOf(t.nextToken()) instanceof Integer y0 && t.nextToken() instanceof String s && Integer.valueOf(s.length()) instanceof Integer len
            && new int[len + 1] instanceof int[] out && new boolean[(x + 2) * (y + 2)] instanceof boolean[] vis && new int[]{x0, y0} instanceof int[] pos && (vis[x0 * (y + 2) + y0] = true) && (out[0] = 1) == 1
            && IntStream.range(1, len).filter(k -> Integer.valueOf(pos[0] + (s.charAt(k - 1) == 'D' ? 1 : s.charAt(k - 1) == 'U' ? -1 : 0)) instanceof Integer nr
                && Integer.valueOf(pos[1] + (s.charAt(k - 1) == 'R' ? 1 : s.charAt(k - 1) == 'L' ? -1 : 0)) instanceof Integer nc
                && (out[k] = nr >= 1 && nr <= x && nc >= 1 && nc <= y && (pos[0] = nr) > 0 && (pos[1] = nc) > 0 && !vis[nr * (y + 2) + nc] && (vis[nr * (y + 2) + nc] = true) ? 1 : 0) >= 0).count() >= 0
            && (out[len] = x * y - IntStream.range(0, len).map(k -> out[k]).sum()) >= 0
            ? Arrays.toString(out).replace("[", "").replace("]", "").replace(",", "") : "");
    }
}
