import java.util.*;

public class Main {
    static int matchEnd(String s, String pat, int from) {
        return from < 0 ? -1 : pat.isEmpty() ? from : (from < s.length() ? (s.charAt(from) == pat.charAt(0) ? matchEnd(s, pat.substring(1), from + 1) : matchEnd(s, pat, from + 1)) : -1);
    }

    static boolean canSeq(String s, String p1, String p2) {
        return matchEnd(s, p2, matchEnd(s, p1, 0)) >= 0;
    }

    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new String[]{sc.next(), sc.next(), sc.next()}).ifPresent(arr ->
            System.out.println(
                (canSeq(arr[0], arr[1], arr[2]) && canSeq(new StringBuilder(arr[0]).reverse().toString(), arr[1], arr[2])) ? "both"
                : canSeq(arr[0], arr[1], arr[2]) ? "forward"
                : canSeq(new StringBuilder(arr[0]).reverse().toString(), arr[1], arr[2]) ? "backward"
                : "fantasy")));
    }
}

