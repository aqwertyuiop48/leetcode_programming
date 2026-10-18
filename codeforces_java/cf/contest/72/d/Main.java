import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                s.nextLine().strip() instanceof String src
                && new int[]{0} instanceof int[] pos
                && new AtomicReference<Supplier<Object>>() instanceof AtomicReference<Supplier<Object>> ref
                && ref.getAndSet(() ->
                    src.charAt(pos[0]) == '"'
                        ? (Integer.valueOf(pos[0]) instanceof Integer st
                            && Integer.valueOf(src.indexOf('"', st + 1)) instanceof Integer en
                            && (pos[0] = en + 1) > 0
                            ? (Object) src.substring(st + 1, en)
                            : null)
                        : Character.isDigit(src.charAt(pos[0])) || src.charAt(pos[0]) == '-'
                            ? (Integer.valueOf(pos[0]) instanceof Integer st
                                && Integer.valueOf(st + (src.charAt(st) == '-' ? 1 : 0) + (int) IntStream.iterate(st + (src.charAt(st) == '-' ? 1 : 0), i -> i < src.length() && Character.isDigit(src.charAt(i)), i -> i + 1).count()) instanceof Integer en
                                && (pos[0] = en) > 0
                                ? (Object) Integer.valueOf(src.substring(st, en))
                                : null)
                            : (Integer.valueOf(pos[0]) instanceof Integer st
                                && Integer.valueOf(st + (int) IntStream.iterate(st, i -> Character.isLetter(src.charAt(i)), i -> i + 1).count()) instanceof Integer en
                                && src.substring(st, en).toLowerCase() instanceof String name
                                && (pos[0] = en + 1) > 0
                                && new ArrayList<Object>() instanceof ArrayList<Object> ag
                                && ag.add(ref.get().get())
                                && (Stream.generate(() -> src.charAt(pos[0]) == ',' && pos[0]++ >= 0 && ag.add(ref.get().get())).allMatch(b -> b) || true)
                                && pos[0]++ >= 0
                                ? (Object) (name.equals("concat")
                                    ? "" + ag.get(0) + ag.get(1)
                                    : name.equals("reverse")
                                        ? new StringBuilder((String) ag.get(0)).reverse().toString()
                                        : IntStream.iterate((int) ag.get(1) - 1, i -> i <= (int) ag.get(2) - 1, i -> i + (ag.size() > 3 ? (int) ag.get(3) : 1))
                                            .mapToObj(i -> String.valueOf(((String) ag.get(0)).charAt(i)))
                                            .collect(Collectors.joining()))
                                : null)) == null
                ? "\"" + ref.get().get() + "\""
                : ""));
    }
}




