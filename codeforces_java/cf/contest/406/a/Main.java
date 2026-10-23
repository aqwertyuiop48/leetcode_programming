import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[]{0, 0} instanceof int[] p
            && IntStream.range(0, n * n).allMatch(i -> (p[1] ^= tk.nextToken().equals("1") && i / n == i % n ? 1 : 0) >= 0)
            ? IntStream.range(0, Integer.parseInt(tk.nextToken())).mapToObj(q -> tk.nextToken() instanceof String ty && ty.equals("3") ? "" + p[1] : tk.nextToken() != null && (p[1] ^= 1) >= 0 ? "" : "").collect(Collectors.joining()) : "");
    }
}
