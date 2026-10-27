import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextLine().trim())).ifPresent(t ->
            System.out.println(
                new HashMap<String, Integer>() instanceof HashMap<String, Integer> macros
                && new String[1][] instanceof String[][] cur
                && new int[1] instanceof int[] pos
                && ((Function<String, String[]>) e -> Pattern.compile("[A-Za-z0-9_]+|[-+*/()]").matcher(e).results().map(MatchResult::group).toArray(String[]::new)) instanceof Function<String, String[]> tok
                && ((IntBinaryOperator) (o, l) -> l) instanceof IntBinaryOperator unused
                && new AtomicReference<IntSupplier>() instanceof AtomicReference<IntSupplier> exprRef
                && new AtomicReference<IntSupplier>() instanceof AtomicReference<IntSupplier> termRef
                && new AtomicReference<IntSupplier>() instanceof AtomicReference<IntSupplier> factorRef
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> exprRest
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> termRest
                && factorRef.getAndSet(() -> cur[0][pos[0]++] instanceof String tk
                    ? tk.equals("(")
                        ? (Integer) exprRef.get().getAsInt() instanceof Integer inner && ++pos[0] > 0 ? (inner == 4 ? 4 : 1) : 4
                        : macros.getOrDefault(tk, 1)
                    : 4) == null
                && termRest.getAndSet(l -> pos[0] < cur[0].length && (cur[0][pos[0]].equals("*") || cur[0][pos[0]].equals("/"))
                    ? (Boolean) cur[0][pos[0]++].equals("*") instanceof Boolean mul && (Integer) factorRef.get().getAsInt() instanceof Integer r
                        ? termRest.get().applyAsInt(l == 4 || r == 4 || l == 2 || r == 2 || (!mul && r == 3) ? 4 : 3)
                        : 4
                    : l) == null
                && termRef.getAndSet(() -> termRest.get().applyAsInt(factorRef.get().getAsInt())) == null
                && exprRest.getAndSet(l -> pos[0] < cur[0].length && (cur[0][pos[0]].equals("+") || cur[0][pos[0]].equals("-"))
                    ? (Boolean) cur[0][pos[0]++].equals("+") instanceof Boolean plus && (Integer) termRef.get().getAsInt() instanceof Integer r
                        ? exprRest.get().applyAsInt(l == 4 || r == 4 || (!plus && r == 2) ? 4 : 2)
                        : 4
                    : l) == null
                && exprRef.getAndSet(() -> exprRest.get().applyAsInt(termRef.get().getAsInt())) == null
                && ((ToIntFunction<String>) e -> (cur[0] = tok.apply(e)) != null && (pos[0] = 0) == 0 ? exprRef.get().getAsInt() : 4) instanceof ToIntFunction<String> parse
                && IntStream.range(0, t).allMatch(i ->
                    sc.nextLine().replace("#", " ").trim().split(" +", 3) instanceof String[] parts
                    && macros.put(parts[1], parse.applyAsInt(parts[2].replace(" ", ""))) == null || true)
                ? (parse.applyAsInt(sc.nextLine().trim().replace(" ", "")) == 4 ? "Suspicious" : "OK")
                : "")));
    }
}





