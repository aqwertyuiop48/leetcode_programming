import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && tk.nextToken() instanceof String s && tk.nextToken() instanceof String t
            && new int[26] instanceof int[] rem && s.chars().allMatch(ch -> ++rem[ch - 'a'] > 0) && (Integer) Math.min(s.length(), t.length()) instanceof Integer L
            && (Integer) (int) IntStream.range(0, L).takeWhile(i -> --rem[t.charAt(i) - 'a'] >= 0).count() instanceof Integer P && (P == L || ++rem[t.charAt(P) - 'a'] >= 0)
            ? IntStream.iterate(P, i -> i >= 0, i -> i - 1).filter(i -> (i == t.length() ? s.length() > t.length() : IntStream.range(t.charAt(i) - 'a' + 1, 26).anyMatch(c -> rem[c] > 0)) || (i > 0 && ++rem[t.charAt(i - 1) - 'a'] < 0)).boxed().findFirst()
                .map(i -> i == t.length() ? t + IntStream.range(0, 26).mapToObj(x -> String.valueOf((char) ('a' + x)).repeat(rem[x])).collect(Collectors.joining())
                    : (Integer) IntStream.range(t.charAt(i) - 'a' + 1, 26).filter(c -> rem[c] > 0).findFirst().getAsInt() instanceof Integer c
                        ? t.substring(0, i) + (char) ('a' + c) + IntStream.range(0, 26).mapToObj(x -> String.valueOf((char) ('a' + x)).repeat(rem[x] - (x == c ? 1 : 0))).collect(Collectors.joining()) : "").orElse("-1")
            : "");
    }
}


