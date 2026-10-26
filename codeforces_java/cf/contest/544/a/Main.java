import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer k && sc.next() instanceof String s
            && IntStream.range(0, s.length()).filter(i -> s.indexOf(s.charAt(i)) == i).limit(k).toArray() instanceof int[] st
            ? st.length < k ? "NO" : "YES\n" + IntStream.range(0, k).mapToObj(i -> s.substring(st[i], i + 1 < k ? st[i + 1] : s.length())).collect(Collectors.joining("\n")) : "");
    }
}
