import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer m && new boolean[m] instanceof boolean[] r
            ? (n >= m || IntStream.range(0, n).filter(i -> (boolean[]) r.clone() instanceof boolean[] old && (Integer) (Integer.parseInt(st.nextToken()) % m) instanceof Integer a
                && IntStream.range(0, m).filter(j -> old[j] && (r[(j + a) % m] = true)).count() >= 0 && (r[a] = true)).count() >= 0 && r[0] ? "YES" : "NO") : "NO");
    }
}
