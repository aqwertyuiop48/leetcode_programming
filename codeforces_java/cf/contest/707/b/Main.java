import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer m && Integer.valueOf(st.nextToken()) instanceof Integer k
            && new int[m] instanceof int[] us && new int[m] instanceof int[] vs && new int[m] instanceof int[] ls && new boolean[n + 1] instanceof boolean[] stg
            && IntStream.range(0, m).map(i -> (us[i] = Integer.parseInt(st.nextToken())) * 0 + (vs[i] = Integer.parseInt(st.nextToken())) * 0 + (ls[i] = Integer.parseInt(st.nextToken())) * 0).sum() == 0
            && IntStream.range(0, k).filter(i -> (stg[Integer.parseInt(st.nextToken())] = true)).count() >= 0
            ? IntStream.range(0, m).filter(i -> stg[us[i]] != stg[vs[i]]).map(i -> ls[i]).min().orElse(-1) : "");
    }
}
