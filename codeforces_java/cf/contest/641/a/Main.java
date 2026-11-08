import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && tk.nextToken() instanceof String s
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] d && new int[]{0} instanceof int[] pos
            ? (IntStream.range(0, n + 1).allMatch(step -> pos[0] >= 0 && pos[0] < n && (pos[0] += s.charAt(pos[0]) == '>' ? d[pos[0]] : -d[pos[0]]) > Integer.MIN_VALUE) ? "INFINITE" : "FINITE") : "");
    }
}
