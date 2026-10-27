import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Integer) BigInteger.valueOf(h).gcd(BigInteger.valueOf(m)).intValue() instanceof Integer g && (Integer) (h / g) instanceof Integer len
            && new int[h] instanceof int[] classId && new int[h] instanceof int[] idxIn && new int[h] instanceof int[] pos
            && IntStream.range(0, h).allMatch(t -> (Integer) (t / len) instanceof Integer r && (Integer) (t % len) instanceof Integer i && (Integer) (int) ((r + (long) i * m) % h) instanceof Integer cell
                && (classId[cell] = r) >= 0 && (idxIn[cell] = i) >= 0 && (pos[t] = cell) >= 0)
            && IntStream.range(0, g).mapToObj(r -> new TreeSet<Integer>(IntStream.range(0, len).boxed().toList())).toList() instanceof List<TreeSet<Integer>> sets
            && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> where && new long[]{0} instanceof long[] ans
            ? IntStream.range(0, n).allMatch(i -> tk.nextToken().equals("+")
                ? (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer id && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer hash
                    && (Integer) classId[hash] instanceof Integer r && (Integer) idxIn[hash] instanceof Integer idx && sets.get(r) instanceof TreeSet<Integer> st
                    && (Integer) (st.ceiling(idx) == null ? st.first() : st.ceiling(idx)) instanceof Integer fIdx
                    && (ans[0] += st.ceiling(idx) == null ? len - idx + fIdx : fIdx - idx) >= 0 && st.remove(fIdx) && where.put(id, pos[r * len + fIdx]) == null || true
                : (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer id2 && (Integer) where.get(id2) instanceof Integer cell
                    && sets.get(classId[cell]).add(idxIn[cell]) || true) ? ans[0] : -1
            : -1);
    }
}

