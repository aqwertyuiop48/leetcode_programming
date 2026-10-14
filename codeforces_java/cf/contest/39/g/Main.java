import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer target
            && Pattern.compile("\\d+|[A-Za-z_]+|==|[^\\s\\w\\x3B]").matcher(s.tokens().collect(Collectors.joining(" "))).results().map(MatchResult::group).skip(7).toList() instanceof List<String> tk
            && new int[]{0} instanceof int[] pos
            && new int[32768] instanceof int[] tab
            && new AtomicReference<Supplier<IntUnaryOperator>>() instanceof AtomicReference<Supplier<IntUnaryOperator>> sum
            && ((BiFunction<Supplier<IntUnaryOperator>, List<String>, Supplier<IntUnaryOperator>>) (sub, ops) -> () ->
                Stream.iterate(sub.get(), e -> tk.get(pos[0]++) instanceof String op && sub.get() instanceof IntUnaryOperator r
                    ? (IntUnaryOperator) n -> op.equals("+") ? (e.applyAsInt(n) + r.applyAsInt(n)) & 32767
                        : op.equals("-") ? (e.applyAsInt(n) - r.applyAsInt(n)) & 32767
                        : op.equals("*") ? (e.applyAsInt(n) * r.applyAsInt(n)) & 32767
                        : e.applyAsInt(n) / r.applyAsInt(n)
                    : e)
                .dropWhile(e -> ops.contains(tk.get(pos[0]))).findFirst().get()) instanceof BiFunction<Supplier<IntUnaryOperator>, List<String>, Supplier<IntUnaryOperator>> la
            && ((Supplier<IntUnaryOperator>) () -> tk.get(pos[0]++) instanceof String t
                ? (t.equals("n") ? (IntUnaryOperator) n -> n
                    : t.equals("f")
                        ? (pos[0]++ >= 0 && sum.get().get() instanceof IntUnaryOperator arg && pos[0]++ >= 0 ? (IntUnaryOperator) n -> tab[arg.applyAsInt(n)] : null)
                        : (IntUnaryOperator) n -> Integer.parseInt(t))
                : null) instanceof Supplier<IntUnaryOperator> mult
            && sum.compareAndSet(null, la.apply(la.apply(mult, List.of("*", "/")), List.of("+", "-")))
            && ((Supplier<IntUnaryOperator>) () -> tk.get(pos[0]++).equals("return")
                ? sum.get().get()
                : (pos[0]++ >= 0 && sum.get().get() instanceof IntUnaryOperator l && tk.get(pos[0]++) instanceof String op && sum.get().get() instanceof IntUnaryOperator r
                    && (pos[0] += 2) > 0 && sum.get().get() instanceof IntUnaryOperator v
                    ? (IntUnaryOperator) n -> (op.equals("<") ? l.applyAsInt(n) < r.applyAsInt(n) : op.equals(">") ? l.applyAsInt(n) > r.applyAsInt(n) : l.applyAsInt(n) == r.applyAsInt(n)) ? v.applyAsInt(n) : -1
                    : null)) instanceof Supplier<IntUnaryOperator> st
            && Stream.iterate(0, i -> i + 1).takeWhile(i -> !tk.get(pos[0]).equals("}")).map(i -> st.get()).toList() instanceof List<IntUnaryOperator> sts
            && IntStream.range(0, 32768).allMatch(n -> (tab[n] = sts.stream().mapToInt(x -> x.applyAsInt(n)).filter(x -> x >= 0).findFirst().orElse(0)) >= 0)
            ? IntStream.range(0, 32768).filter(n -> tab[n] == target).max().orElse(-1) : -2));
    }
}

