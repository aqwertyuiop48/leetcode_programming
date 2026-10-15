import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                new ArrayList<long[]>() instanceof ArrayList<long[]> blocks
                && new int[]{0} instanceof int[] nextId
                ? IntStream.range(0, nm[0]).mapToObj(opIdx -> s.next() instanceof String cmd
                    ? (cmd.equals("alloc")
                        ? (new int[]{s.nextInt()} instanceof int[] xArr
                            ? IntStream.rangeClosed(0, blocks.size())
                                .mapToObj(gi -> new long[]{
                                    gi == 0 ? 1 : (blocks.get(gi - 1)[0] + blocks.get(gi - 1)[1]),
                                    (gi == blocks.size() ? nm[1] + 1 : blocks.get(gi)[0]) - (gi == 0 ? 1 : (blocks.get(gi - 1)[0] + blocks.get(gi - 1)[1])),
                                    gi
                                })
                                .filter(g -> g[1] >= xArr[0])
                                .findFirst()
                                .map(g -> (blocks.subList((int) g[2], (int) g[2]).add(new long[]{g[0], xArr[0], nextId[0] + 1}) && (nextId[0] += 1) >= 0)
                                    ? String.valueOf(nextId[0])
                                    : "")
                                .orElse("NULL")
                            : "")
                        : cmd.equals("erase")
                            ? (new int[]{s.nextInt()} instanceof int[] yArr
                                ? (IntStream.range(0, blocks.size()).filter(bi -> blocks.get(bi)[2] == yArr[0]).findFirst() instanceof OptionalInt found
                                    ? (found.isPresent()
                                        ? (blocks.remove(found.getAsInt()) instanceof long[] removed ? "" : "")
                                        : "ILLEGAL_ERASE_ARGUMENT")
                                    : "")
                                : "")
                            : (new long[]{1} instanceof long[] cursor
                                && IntStream.range(0, blocks.size()).allMatch(bi -> (blocks.get(bi)[0] = cursor[0]) >= 0 & (cursor[0] += blocks.get(bi)[1]) >= 0)
                                ? ""
                                : ""))
                    : "")
                    .filter(out -> !out.isEmpty())
                    .collect(Collectors.joining("\n"))
                : ""
            )));
    }
}


