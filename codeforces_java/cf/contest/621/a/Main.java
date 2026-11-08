import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && LongStream.generate(() -> Long.parseLong(st.nextToken())).limit(n).toArray() instanceof long[] a
            && Long.valueOf(Arrays.stream(a).sum()) instanceof Long s
            ? s - (s % 2 == 0 ? 0 : Arrays.stream(a).filter(v -> v % 2 == 1).min().getAsLong()) : "");
    }
}
