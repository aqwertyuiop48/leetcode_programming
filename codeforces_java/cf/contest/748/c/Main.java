import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sc && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer n && sc.nextToken() instanceof String s && new int[1] instanceof int[] st
            ? 1 + IntStream.range(0, s.length()).map(i -> 1 << "LRUD".indexOf(s.charAt(i))).filter(b -> (st[0] & (b < 4 ? b ^ 3 : b ^ 12)) != 0 ? (st[0] = b) > 0 : (st[0] |= b) < 0).count() : "");
    }
}
