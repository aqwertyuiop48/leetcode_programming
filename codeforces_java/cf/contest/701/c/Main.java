import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] h
            && h[1].toCharArray() instanceof char[] s
            && IntStream.range(0, s.length).map(i -> s[i]).distinct().toArray() instanceof int[] d
            && new int[128] instanceof int[] last && Arrays.stream(new int[0]).count() == 0
            && IntStream.range(0, 128).filter(i -> (last[i] = -1) > 0).count() == 0
            ? IntStream.range(0, s.length)
                .map(r -> (last[s[r]] = r) >= 0 && Integer.valueOf(Arrays.stream(d).map(c -> last[c]).min().getAsInt()) instanceof Integer m ? (m < 0 ? s.length : r + 1 - m) : 0)
                .min().getAsInt() : 0);
    }
}
