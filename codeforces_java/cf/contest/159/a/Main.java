import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer d
            && Stream.generate(() -> new String[]{s.next(), s.next(), s.next()}).limit(n).toList() instanceof List<String[]> msg
            && new LinkedHashMap<String, String>() instanceof LinkedHashMap<String, String> friends
            && IntStream.range(0, n).allMatch(j -> IntStream.range(0, j).anyMatch(i -> msg.get(i)[0].equals(msg.get(j)[1]) && msg.get(i)[1].equals(msg.get(j)[0])
                    && Integer.parseInt(msg.get(j)[2]) - Integer.parseInt(msg.get(i)[2]) > 0 && Integer.parseInt(msg.get(j)[2]) - Integer.parseInt(msg.get(i)[2]) <= d)
                ? friends.putIfAbsent(Stream.of(msg.get(j)[0], msg.get(j)[1]).sorted().collect(Collectors.joining(" ")), msg.get(j)[0] + " " + msg.get(j)[1]) == null || true
                : true)
            ? friends.size() + (friends.isEmpty() ? "" : "\n" + String.join("\n", friends.values()))
            : "");
    }
}
