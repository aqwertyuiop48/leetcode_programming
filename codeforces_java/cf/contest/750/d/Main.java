public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new java.util.Scanner(System.in) instanceof java.util.Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && new int[]{0, 1, 1, 1, 0, -1, -1, -1} instanceof int[] dx && new int[]{1, 1, 0, -1, -1, -1, 0, 1} instanceof int[] dy
            && new boolean[320 * 320] instanceof boolean[] grid && new boolean[320 * 320 * 8][] instanceof boolean[][] cur && Integer.valueOf(320 * 320 * 8) instanceof Integer S
            && (cur[0] = new boolean[S]) != null && (cur[0][(160 * 320 + 160) * 8] = true)
            && java.util.stream.IntStream.range(0, n).allMatch(i -> Integer.valueOf(sc.nextInt()) instanceof Integer t && new boolean[S] instanceof boolean[] nx
                && java.util.stream.IntStream.range(0, S).filter(s -> cur[0][s]).allMatch(s -> Integer.valueOf(s % 8) instanceof Integer d && Integer.valueOf(s / 8 / 320) instanceof Integer x && Integer.valueOf(s / 8 % 320) instanceof Integer y
                    && java.util.stream.IntStream.rangeClosed(1, t).allMatch(k -> (grid[(x + dx[d] * k) * 320 + y + dy[d] * k] = true))
                    && ((nx[((x + dx[d] * t) * 320 + y + dy[d] * t) * 8 + (d + 1) % 8] = true) & (nx[((x + dx[d] * t) * 320 + y + dy[d] * t) * 8 + (d + 7) % 8] = true)))
                && (cur[0] = nx) != null)
            ? java.util.stream.IntStream.range(0, grid.length).filter(j -> grid[j]).count() : "");
    }
}
