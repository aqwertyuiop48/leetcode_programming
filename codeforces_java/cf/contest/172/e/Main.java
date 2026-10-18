import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.nextLine() instanceof String doc
            && Pattern.compile("<(/?)([a-z]+)(/?)>").matcher(doc).results().map(r -> new String[]{r.group(1).isEmpty() ? r.group(3).isEmpty() ? "o" : "s" : "c", r.group(2)}).toList() instanceof List<String[]> ev
            && Integer.valueOf(Integer.parseInt(sc.nextLine().trim())) instanceof Integer m
            ? Stream.generate(sc::nextLine).limit(m).map(line -> line.trim().split("\\s+") instanceof String[] q
                && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> stack
                ? String.valueOf(ev.stream().filter(e -> e[0].equals("c") ? stack.pop() < 0 : Integer.valueOf(stack.peek()) instanceof Integer c
                        && (!e[0].equals("o") || stack.offerFirst(c + (c < q.length && e[1].equals(q[c]) ? 1 : 0)))
                        && e[1].equals(q[q.length - 1]) && c >= q.length - 1).count())
                : "").collect(Collectors.joining("\n"))
            : "");
    }
}
