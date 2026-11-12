import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && new int[2] instanceof int[] s
            && IntStream.range(0, Integer.parseInt(t[1])).filter(i -> (s[1] = Math.max(s[1], s[0] = t[2 + i].indexOf('0') >= 0 ? s[0] + 1 : 0)) < 0).count() == 0
            ? s[1] : "");
    }
}
