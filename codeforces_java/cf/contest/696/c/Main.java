import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && new long[] {1, 0} instanceof long[] km
            && IntStream.range(0, n).filter(i -> Long.valueOf(tk.nextToken()) instanceof Long a && ((km[0] = km[0] * (a % 1000000006L) % 1000000006L) < 0 || (km[1] |= (a.longValue() & 1) ^ 1) < 0)).count() >= 0
            && Long.valueOf(((km[0] - 1) % 1000000006L + 1000000006L) % 1000000006L) instanceof Long e
            && new long[] {1, 2} instanceof long[] pw
            && IntStream.range(0, 31).filter(bit -> ((e >> bit) & 1) == 1 ? (pw[0] = pw[0] * pw[1] % 1000000007L) < 0 || (pw[1] = pw[1] * pw[1] % 1000000007L) < 0 : (pw[1] = pw[1] * pw[1] % 1000000007L) < 0).count() >= 0
            ? ((pw[0] + (km[1] == 1 ? 1 : 1000000006L)) % 1000000007L * 333333336L % 1000000007L) + "/" + pw[0] : "");
    }
}
