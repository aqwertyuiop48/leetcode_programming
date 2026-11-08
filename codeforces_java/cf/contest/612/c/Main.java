import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length + 1] instanceof int[] stk && new int[2] instanceof int[] st
            && IntStream.range(0, raw.length).allMatch(i -> Integer.valueOf(raw[i]) instanceof Integer c
                && (c <= 32 || (c == 40 || c == 60 || c == 91 || c == 123
                    ? (stk[st[0]++] = c) > 0
                    : st[0] > 0 && (stk[--st[0]] == (c == 41 ? 40 : c - 2) || ++st[1] > 0))))
            && st[0] == 0 ? st[1] : "Impossible");
    }
}
