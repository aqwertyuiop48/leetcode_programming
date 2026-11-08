import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s*\\n\\s*")).map(l -> l.trim().split("\\s+")).toArray(String[][]::new) instanceof String[][] g
            ? IntStream.range(0, g[0].length).mapToObj(i -> IntStream.range(0, g.length).mapToObj(j -> g[g.length - 1 - j][i]).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
