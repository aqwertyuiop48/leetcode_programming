import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer t
            && new int[1 << 18] instanceof int[] cnt
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, t).allMatch(q -> st.nextToken() instanceof String op
                && Integer.valueOf(st.nextToken().chars().reduce(0, (x, c) -> x * 2 + (c & 1))) instanceof Integer mk
                && (op.equals("?") ? sb.append(cnt[mk]).append((char) 10) != null : (cnt[mk] += op.equals("+") ? 1 : -1) > -1))
            ? sb : "");
    }
}
