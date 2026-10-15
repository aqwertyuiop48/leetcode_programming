import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines()).ifPresent(ls -> System.out.println(
            new HashMap<String, Integer>(Map.of("void", 0, "errtype", -1)) instanceof HashMap<String, Integer> m
            ? ls.skip(1).map(l -> l.split(" ") instanceof String[] t
                ? ((Integer) m.getOrDefault(t[1].replaceAll("[*&]", ""), -1) instanceof Integer base
                    && (Integer) (base < 0 ? -1 : base + (int) t[1].chars().filter(c -> c == '*').count() - (int) t[1].chars().filter(c -> c == '&').count()) instanceof Integer lv
                    && (Integer) (lv < 0 ? -1 : lv) instanceof Integer lvl
                    ? (t[0].equals("typeof") ? (lvl < 0 ? "errtype" : "void" + "*".repeat(lvl)) : (m.merge(t[2], lvl, (x, y) -> y) < -5 ? "" : ""))
                    : "")
                : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n"))
            : ""));
    }
}


