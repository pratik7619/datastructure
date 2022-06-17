package ztm.strings;

public class EditDistance {
    //?Pratik Sherdiwala (Codelytics)

    static int editDistance(String a, String b) {

        int m = a.length();
        int n = b.length();

        int[][] distance = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            distance[i][0] = i;
        }

        for (int i = 1; i <= n; i++) {
            distance[0][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    distance[i][j] = distance[i - 1][j - 1];
                } else {
                    distance[i][j] = 1 + Math.min(
                            Math.min(
                                    distance[i][j - 1],
                                    distance[i - 1][j]
                            ),
                            distance[i - 1][j - 1]
                    );
                }
            }
        }

        return distance[m][n];
    }

    public static void main(String[] args) {

        System.out.println(
                editDistance(
                        "CAT",
                        "CREATES"
                )
        );
    }
}
