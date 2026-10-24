import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> in
            && in.next() instanceof String doc
            && Pattern.compile("<(/?)([a-z]+)(/?)>").matcher(doc).results().toList() instanceof List<MatchResult> ms
            && ms.stream().mapToInt(r -> r.group(1).isEmpty() ? r.group(3).isEmpty() ? 0 : 2 : 1).toArray() instanceof int[] typ
            && new HashMap<String, Integer>() instanceof HashMap<String, Integer> ids
            && ms.stream().mapToInt(r -> ids.computeIfAbsent(r.group(2), x -> ids.size())).toArray() instanceof int[] nm
            && new int[typ.length + 2] instanceof int[] st && new int[2] instanceof int[] sp
            && Integer.valueOf(Integer.parseInt(in.next().trim())) instanceof Integer m
            ? Stream.generate(in::next).limit(m).map(line -> Arrays.stream(line.trim().split("\s+")).mapToInt(x -> ids.getOrDefault(x, -1)).toArray() instanceof int[] q
                && (Integer) q.length instanceof Integer len && (Integer) q[len - 1] instanceof Integer ql && (sp[0] = 0) == 0 && (sp[1] = 0) == 0
                && IntStream.range(0, typ.length).map(i -> typ[i] == 1 ? (--sp[0] >= -1 ? 0 : 1)
                    : ((nm[i] != ql || st[sp[0]] < len - 1 || ++sp[1] > 0) && (typ[i] != 0 || ((st[sp[0] + 1] = st[sp[0]] + (st[sp[0]] < len && nm[i] == q[st[sp[0]]] ? 1 : 0)) >= 0 && ++sp[0] > 0)) ? 0 : 1)).sum() == 0
                ? String.valueOf(sp[1]) : "").collect(Collectors.joining("\n"))
            : "");
    }
}
