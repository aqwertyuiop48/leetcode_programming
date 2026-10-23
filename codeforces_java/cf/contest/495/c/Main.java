import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim() instanceof String s
            && Integer.valueOf(s.lastIndexOf('#')) instanceof Integer last
            && Integer.valueOf((int) (s.chars().filter(c -> c == '(').count() - s.chars().filter(c -> c != '(').count())) instanceof Integer diff
            && Integer.valueOf(diff + 1) instanceof Integer extra
            && new int[1] instanceof int[] bal
            && extra >= 1
            && IntStream.range(0, s.length()).allMatch(i ->
                (bal[0] += s.charAt(i) == '(' ? 1 : s.charAt(i) == ')' ? -1 : -(i == last ? extra : 1)) >= 0)
            ? IntStream.range(0, s.length()).filter(i -> s.charAt(i) == '#')
                .mapToObj(i -> String.valueOf(i == last ? extra : 1)).collect(Collectors.joining("\n"))
            : "-1");
    }
}
