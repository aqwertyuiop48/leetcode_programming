import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer h && Integer.valueOf(t[2]) instanceof Integer w
            && t[3] instanceof String s
            && new int[]{0, 0} instanceof int[] pos && new int[4] instanceof int[] ext
            && new int[]{w, h} instanceof int[] dims && new long[]{0} instanceof long[] ans
            && new int[n] instanceof int[] ev && new int[n] instanceof int[] evk && new int[]{0} instanceof int[] ec
            && ((LongToIntFunction) time -> Character.valueOf(s.charAt((int) ((time - 1) % n))) instanceof Character ch
                && Integer.valueOf("RLUD".indexOf(ch)) instanceof Integer id
                && Integer.valueOf(1 - 2 * (id & 1)) instanceof Integer d
                && Integer.valueOf((id < 2 ? (pos[0] += d) : (pos[1] += d)) * d) instanceof Integer mag
                && mag > ext[id] && (ext[id] = mag) > 0
                && ((dims[0] > 0 && dims[1] > 0 && (ans[0] = (ans[0] + time % 1000000007L * dims[id < 2 ? 1 : 0]) % 1000000007L) >= 0 && --dims[id < 2 ? 0 : 1] >= 0) || true)
                ? (id < 2 ? 1 : 2) : 0) instanceof LongToIntFunction proc
            && IntStream.range(0, 2 * n).filter(i -> Integer.valueOf(proc.applyAsInt(i + 1L)) instanceof Integer kd
                && (i < n || kd == 0 || ((ev[ec[0]] = i - n) >= 0 && (evk[ec[0]++] = kd) > 0))).count() >= 0
            && IntStream.range(2, h + w + 3).takeWhile(kk -> dims[0] > 0 && dims[1] > 0 && ec[0] > 0)
                .filter(kk -> IntStream.range(0, ec[0]).takeWhile(e -> dims[0] > 0 && dims[1] > 0)
                    .filter(e -> (ans[0] = (ans[0] + ((long) kk * n + ev[e] + 1) % 1000000007L * dims[evk[e] == 1 ? 1 : 0]) % 1000000007L) >= 0 && --dims[evk[e] == 1 ? 0 : 1] >= 0).count() >= 0).count() >= 0
            ? (dims[0] > 0 && dims[1] > 0 ? -1 : ans[0]) : "");
    }
}
