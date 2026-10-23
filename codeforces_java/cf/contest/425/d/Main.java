import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}).toArray(int[][]::new) instanceof int[][] p
            && new int[100002][] instanceof int[][] col && new int[100002][] instanceof int[][] row
            && IntStream.range(0, 100002).allMatch(i -> (col[i] = new int[0]) != null && (row[i] = new int[0]) != null)
            && Arrays.stream(p).collect(Collectors.groupingBy(q -> q[0], Collectors.mapping(q -> q[1], Collectors.toList()))).entrySet().stream().allMatch(e -> (col[e.getKey()] = e.getValue().stream().mapToInt(v -> v).sorted().toArray()) != null)
            && Arrays.stream(p).collect(Collectors.groupingBy(q -> q[1], Collectors.mapping(q -> q[0], Collectors.toList()))).entrySet().stream().allMatch(e -> (row[e.getKey()] = e.getValue().stream().mapToInt(v -> v).sorted().toArray()) != null)
            ? Arrays.stream(p).mapToLong(q -> (Integer) q[0] instanceof Integer x && (Integer) q[1] instanceof Integer y
                ? col[x].length <= row[y].length
                    ? IntStream.range(Arrays.binarySearch(col[x], y) + 1, col[x].length).filter(t -> x + col[x][t] - y <= 100000 && Arrays.binarySearch(col[x + col[x][t] - y], y) >= 0 && Arrays.binarySearch(col[x + col[x][t] - y], col[x][t]) >= 0).count()
                    : IntStream.range(Arrays.binarySearch(row[y], x) + 1, row[y].length).filter(t -> y + row[y][t] - x <= 100000 && Arrays.binarySearch(row[y + row[y][t] - x], x) >= 0 && Arrays.binarySearch(row[y + row[y][t] - x], row[y][t]) >= 0).count() : 0).sum() : 0);
    }
}
