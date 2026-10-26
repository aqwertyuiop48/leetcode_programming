import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().reduce(new ArrayList<StringBuilder>(), (acc, l) ->
                (l.stripLeading().startsWith("#") ? acc.add(new StringBuilder("A").append(l))
                    : !acc.isEmpty() && acc.getLast().charAt(0) == 'C' ? acc.getLast().append(l.replace(" ", "")) != null
                    : acc.add(new StringBuilder("C").append(l.replace(" ", "")))) | true ? acc : acc,
                (x, y) -> x) instanceof ArrayList<StringBuilder> grp
            ? grp.stream().filter(g -> g.length() > 1 || g.charAt(0) == 'A' || grp.get(0).charAt(0) == 'A' || grp.size() > 1).map(g -> g.substring(1)).collect(Collectors.joining("\n"))
            : "");
    }
}
