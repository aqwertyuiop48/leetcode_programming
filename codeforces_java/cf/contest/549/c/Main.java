import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && (Integer) (int) IntStream.range(0, n).filter(i -> Integer.parseInt(tk.nextToken()) % 2 == 1).count() instanceof Integer o
            && (Integer) (n - o) instanceof Integer e && (Integer) (n - k) instanceof Integer m && (Integer) (m / 2) instanceof Integer dd
            ? (m == 0 ? o % 2 == 1 : m % 2 == 0 ? k % 2 == 1 && e <= dd : k % 2 == 0 ? e > dd && o > dd : o > dd) ? "Stannis" : "Daenerys" : "");
    }
}
