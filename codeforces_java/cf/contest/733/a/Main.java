import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && new int[]{0, 0} instanceof int[] st
            && IntStream.rangeClosed(1, s.length() + 1).allMatch(i -> (i > s.length() || "AEIOUY".indexOf(s.charAt(i - 1)) >= 0 ? (st[1] = Math.max(st[1], i - st[0])) + (st[0] = i) : 0) >= 0)
            ? st[1] : "");
    }
}
