import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer s
            ? Math.max(s, IntStream.range(0, n).map(i -> Integer.parseInt(t.nextToken()) + Integer.parseInt(t.nextToken())).max().getAsInt()) : "");
    }
}
