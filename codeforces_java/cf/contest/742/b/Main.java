import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer x && new int[1 << 20] instanceof int[] cnt && new long[1] instanceof long[] res && IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).filter(a -> (res[0] += cnt[a ^ x]) >= 0 | true && ++cnt[a] > 0).count() >= 0 ? res[0] : 0);
    }
}
