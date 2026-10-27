import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] z
                && ((IntBinaryOperator) (i, j) -> i * z[1] + j < z[2] ? 1 : i * z[1] + j < z[2] + z[1] ? 2 : i * z[1] + j < z[2] + z[1] + z[3] ? 0 : 2) instanceof IntBinaryOperator typ
                && IntStream.range(0, z[0]).map(i -> IntStream.range(0, z[1]).filter(j -> typ.applyAsInt(i, j) != 2).boxed().findFirst()
                    .map(q -> typ.applyAsInt(i, q) ^ (q & 1)).orElse(1 - i % 2)).toArray() instanceof int[] rowBase
                && IntStream.range(0, z[1]).map(j -> IntStream.range(0, z[0]).filter(i -> typ.applyAsInt(i, j) != 2).boxed().findFirst()
                    .map(q -> typ.applyAsInt(q, j) ^ (q & 1)).orElse(0)).toArray() instanceof int[] colBase
                && new String[]{"#/", "\\#", "\\.", "./"} instanceof String[] tp
                && new String[]{"/.", ".\\", "#\\", "/#"} instanceof String[] bt
                ? IntStream.range(0, z[0]).mapToObj(i -> IntStream.range(0, 2).mapToObj(r -> IntStream.range(0, z[1]).mapToObj(j ->
                        typ.applyAsInt(i, j) == 1 ? "##" : typ.applyAsInt(i, j) == 0 ? ".."
                        : (r == 0 ? tp : bt)[(1 - (colBase[j] ^ ((int) IntStream.range(0, i).filter(k -> typ.applyAsInt(k, j) == 2).count() & 1))) * 2
                            + (1 - (rowBase[i] ^ ((int) IntStream.range(0, j).filter(k -> typ.applyAsInt(i, k) == 2).count() & 1)))])
                    .collect(Collectors.joining())).collect(Collectors.joining("\n"))).collect(Collectors.joining("\n"))
                : ""));
    }
}





