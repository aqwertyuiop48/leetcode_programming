import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && new int[26] instanceof int[] nx && new boolean[26] instanceof boolean[] hp && new boolean[26] instanceof boolean[] done
            && Arrays.stream(t, 1, n + 1).mapToInt(s -> (int) IntStream.range(0, s.length() - 1)
                .filter(k -> (nx[s.charAt(k) - 97] = s.charAt(k + 1) - 96) < 0 || (hp[s.charAt(k + 1) - 97] = true) && false).count()).sum() == 0
            ? Arrays.stream(t, 1, n + 1).mapToInt(s -> s.charAt(0) - 97).filter(f -> !hp[f] && !done[f] && (done[f] = true))
                .mapToObj(f -> IntStream.iterate(f + 1, c -> c > 0, c -> nx[c - 1]).mapToObj(c -> String.valueOf((char) (96 + c))).collect(Collectors.joining()))
                .collect(Collectors.joining())
            : "");
    }
}
