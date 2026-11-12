import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")[1].split("W+")).filter(x -> !x.isEmpty()).map(x -> "" + x.length()).collect(Collectors.toList()) instanceof List<String> l
            ? l.size() + (l.isEmpty() ? "" : "\n" + String.join(" ", l)) : "");
    }
}
