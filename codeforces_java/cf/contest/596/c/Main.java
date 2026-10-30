import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer y ? ((long) (y - x + 100000) << 20) | x : 0L).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken()) + 100000).toArray() instanceof int[] w
            && new int[200005] instanceof int[] ptr
            && IntStream.range(0, n).filter(i -> i == 0 || (keys[i] >> 20) != (keys[i - 1] >> 20)).allMatch(i -> (ptr[(int) (keys[i] >> 20)] = i + 1) > 0)
            && new HashSet<Long>() instanceof HashSet<Long> placed && new int[n] instanceof int[] rx && new int[n] instanceof int[] ry
            && IntStream.range(0, n).allMatch(i -> (Integer) w[i] instanceof Integer wi && wi >= 0 && wi < 200003 && ptr[wi] > 0 && ptr[wi] <= n && (keys[ptr[wi] - 1] >> 20) == wi
                && (Integer) (int) (keys[ptr[wi] - 1] & 1048575L) instanceof Integer x && (Integer) (x + wi - 100000) instanceof Integer y
                && (x == 0 || placed.contains(((long) (x - 1) << 20) | y)) && (y == 0 || placed.contains(((long) x << 20) | (y - 1)))
                && placed.add(((long) x << 20) | y) && ++ptr[wi] > 0 && (rx[i] = x) >= 0 && (ry[i] = y) >= 0)
            ? "YES\n" + IntStream.range(0, n).mapToObj(i -> rx[i] + " " + ry[i]).collect(Collectors.joining("\n")) : "NO");
    }
}
