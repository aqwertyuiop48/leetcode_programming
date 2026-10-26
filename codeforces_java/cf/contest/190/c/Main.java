import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[tk.countTokens() + 2] instanceof int[] st && new int[]{0, 0, 0} instanceof int[] z && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, tk.countTokens() + 1).anyMatch(q -> !tk.hasMoreTokens() || (tk.nextToken() instanceof String t && z[1] == 0
                && (t.equals("pair") ? sb.append("pair<") != null && (st[z[0]++] = 0) == 0
                    : t.equals("int") && sb.append("int") != null && IntStream.range(0, z[0] + 2).anyMatch(w -> z[0] == 0 || (st[z[0] - 1] == 0 ? sb.append(',') != null && (st[z[0] - 1] = 1) == 1 : sb.append('>') != null && --z[0] < 0)) && (z[0] > 0 || (z[1] = 1) == 1)) ? false : (z[2] = 1) == 1))
            ? z[1] == 1 && z[2] == 0 ? sb.toString() : "Error occurred" : "");
    }
}
