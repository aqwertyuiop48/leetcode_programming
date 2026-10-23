import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && (Integer) Arrays.stream(g, 1, g[0] + 1).min().getAsInt() instanceof Integer lo
            && (Integer) Arrays.stream(g, 1, g[0] + 1).max().getAsInt() instanceof Integer hi
            && (Long) Arrays.stream(g, 1, g[0] + 1).filter(x -> x == lo).count() instanceof Long cl
            && (Long) Arrays.stream(g, 1, g[0] + 1).filter(x -> x == hi).count() instanceof Long ch
            ? (hi - lo) + " " + (hi.equals(lo) ? cl * (cl - 1) / 2 : cl * ch)
            : "");
    }
}
