import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print((Object) (Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).collect(Collectors.toList()) instanceof List<String> parts && parts.get(0) instanceof String str && new long[]{Long.parseLong(parts.get(1))} instanceof long[] rest && new int[][]{IntStream.range(0, str.length()).toArray()} instanceof int[][] live && new StringBuilder() instanceof StringBuilder out && rest[0] <= str.length() * (str.length() + 1L) / 2 && IntStream.rangeClosed(0, str.length()).anyMatch(depth -> new long[26] instanceof long[] tot && Arrays.stream(live[0]).allMatch(p -> (tot[str.charAt(p + depth) - 'a'] += str.length() - p - depth) > 0) && (Integer) IntStream.range(0, 26).filter(x -> rest[0] <= tot[x] || (rest[0] -= tot[x]) < 0).findFirst().getAsInt() instanceof Integer ch && out.append((char) ('a' + ch)) != null && (Long) Arrays.stream(live[0]).filter(p -> str.charAt(p + depth) - 'a' == ch).count() instanceof Long stop && Arrays.stream(live[0]).filter(p -> str.charAt(p + depth) - 'a' == ch && p + depth + 1 < str.length()).toArray() instanceof int[] next && (rest[0] <= stop || (rest[0] -= stop) < 0 || (live[0] = next) == null)) ? out : "No such line."));
    }


}
