import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new ArrayList<String>() instanceof ArrayList<String> st
            ? Stream.generate(s::next).limit(n).map(cmd -> cmd.equals("pwd")
                    ? "/" + st.stream().map(c -> c + "/").collect(Collectors.joining())
                    : s.next() instanceof String path
                        && (!path.startsWith("/") || st.removeIf(x -> true) || true)
                        && Arrays.stream(path.split("/")).filter(c -> !c.isEmpty()).allMatch(c -> c.equals("..") ? st.remove(st.size() - 1) != null : st.add(c))
                    ? null : null)
                .filter(Objects::nonNull).collect(Collectors.joining("\n"))
            : "");
    }
}

