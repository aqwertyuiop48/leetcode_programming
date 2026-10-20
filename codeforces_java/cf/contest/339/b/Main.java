import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Long.valueOf(it.next()) instanceof Long n && Integer.valueOf(it.next()) instanceof Integer m && new long[]{1, 0} instanceof long[] st
            && LongStream.generate(() -> Long.parseLong(it.next())).limit(m).allMatch(a -> (st[1] += (a - st[0] + n) % n) >= 0 && (st[0] = a) > 0) ? st[1] : "");
    }
}
