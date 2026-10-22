import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4], b = new int[4];
        for (int i = 0; i < 4; i++) { a[i] = sc.nextInt(); b[i] = sc.nextInt(); }
        // team1 options: [def, att]
        int[][] t1 = {{a[0], b[1]}, {a[1], b[0]}};
        int[][] t2 = {{a[2], b[3]}, {a[3], b[2]}};
        boolean team1 = false;
        for (int[] x : t1) {
            boolean all = true;
            for (int[] y : t2) if (!(x[0] > y[1] && x[1] > y[0])) all = false;
            if (all) team1 = true;
        }
        boolean team2 = true;
        for (int[] x : t1) {
            boolean ex = false;
            for (int[] y : t2) if (y[0] > x[1] && y[1] > x[0]) ex = true;
            if (!ex) team2 = false;
        }
        System.out.println(team1 ? "Team 1" : team2 ? "Team 2" : "Draw");
    }
}
