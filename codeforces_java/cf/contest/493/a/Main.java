import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(t[2]) instanceof Integer n
            && new int[200] instanceof int[] status
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, n).allMatch(e ->
                Integer.valueOf((t[4 + 4 * e].equals("h") ? 0 : 100) + Integer.parseInt(t[5 + 4 * e])) instanceof Integer key
                && (status[key] == 2
                    || (t[6 + 4 * e].equals("r") || status[key] == 1
                        ? (status[key] = 2) > 0 && sb.append(t[t[4 + 4 * e].equals("h") ? 0 : 1]).append(' ').append(t[5 + 4 * e]).append(' ').append(t[3 + 4 * e]).append('\n') != null
                        : (status[key] = 1) > 0)))
            ? sb.toString()
            : "");
    }
}
