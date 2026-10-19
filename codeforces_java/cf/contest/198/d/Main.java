import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            && new int[1][][] instanceof int[][][] cur
            && (cur[0] = new int[][]{{0, 0}, {0, 0}, {0, 1}}) != null
            && IntStream.rangeClosed(2, n).allMatch(i ->
                cur[0] instanceof int[][] o
                && new int[i * i * (i + 1)] instanceof int[] nx
                && new int[i * i * (i + 1)] instanceof int[] ny
                && new int[i * i * (i + 1)] instanceof int[] nz
                && IntStream.range(0, i * i).allMatch(k ->
                    (nx[k] = (k / i) % 2 == 0 ? k % i : i - 1 - k % i) >= 0
                    && (ny[k] = k / i) >= 0
                    && (nz[k] = 0) == 0)
                && IntStream.range(0, o[0].length).allMatch(u ->
                    (nx[i * i + u] = i % 2 == 1 ? i - 1 - o[2][u] : o[2][u]) >= 0
                    && (ny[i * i + u] = i - 1 - o[1][u]) >= 0
                    && (nz[i * i + u] = o[0][u] + 1) > 0)
                && IntStream.range(0, i * (i - 1)).allMatch(k ->
                    i % 2 == 1
                        ? ((nx[i * i + o[0].length + k] = k / (i - 1)) >= 0
                            && (ny[i * i + o[0].length + k] = 0) == 0
                            && (nz[i * i + o[0].length + k] = ((k / (i - 1)) % 2 == 0 ? k % (i - 1) : i - 2 - k % (i - 1)) + 1) > 0)
                        : ((nx[i * i + o[0].length + k] = i - 1 - ((k / i) % 2 == 0 ? k % i : i - 1 - k % i)) >= 0
                            && (ny[i * i + o[0].length + k] = 0) == 0
                            && (nz[i * i + o[0].length + k] = k / i + 1) > 0))
                && IntStream.range(0, i * i).allMatch(k ->
                    i % 2 == 1
                        ? ((nx[i * i + o[0].length + i * (i - 1) + k] = i - 1 - k / i) >= 0
                            && (ny[i * i + o[0].length + i * (i - 1) + k] = (k / i) % 2 == 0 ? k % i : i - 1 - k % i) >= 0
                            && (nz[i * i + o[0].length + i * (i - 1) + k] = i) > 0)
                        : ((nx[i * i + o[0].length + i * (i - 1) + k] = (k / i) % 2 == 0 ? k % i : i - 1 - k % i) >= 0
                            && (ny[i * i + o[0].length + i * (i - 1) + k] = k / i) >= 0
                            && (nz[i * i + o[0].length + i * (i - 1) + k] = i) > 0))
                && (cur[0] = new int[][]{nx, ny, nz}) != null)
            && new int[n * n * n] instanceof int[] lab
            && IntStream.range(0, n * n * n).allMatch(t ->
                (lab[cur[0][2][t] * n * n + cur[0][1][t] * n + cur[0][0][t]] = t + 1) > 0)
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, n * n * n).allMatch(t ->
                sb.append(lab[t]).append((t + 1) % n == 0 ? '\n' : ' ') != null)
            ? sb : "");
    }
}
