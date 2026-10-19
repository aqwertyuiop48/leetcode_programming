import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer q && sc.next() instanceof String s
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(sc.nextInt()) instanceof Integer l && Integer.valueOf(sc.nextInt()) instanceof Integer r
                && s.substring(l - 1, r).chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Character> prog
                && new int[]{0, 1} instanceof int[] st && new int[10] instanceof int[] cnt
                && IntStream.iterate(0, x -> st[0] >= 0 && st[0] < prog.size(), x -> x + 1).allMatch(x -> Character.valueOf(prog.get(st[0])) instanceof Character c
                    && (Character.isDigit(c)
                        ? ++cnt[c - '0'] > 0 && (c == '0' ? prog.remove(st[0]) != null && (st[1] == 1 || --st[0] >= -1) : prog.set(st[0], (char) (c - 1)) != null && (st[0] += st[1]) > Integer.MIN_VALUE)
                        : (st[1] = c == '<' ? -1 : 1) != 0 && (st[0] + st[1] >= 0 && st[0] + st[1] < prog.size() && (prog.get(st[0] + st[1]) == '<' || prog.get(st[0] + st[1]) == '>')
                            ? prog.remove(st[0]) != null && (st[1] == 1 || --st[0] >= -1) : (st[0] += st[1]) > Integer.MIN_VALUE)))
                ? Arrays.stream(cnt).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "").collect(Collectors.joining("\n")) : "");
    }
}
