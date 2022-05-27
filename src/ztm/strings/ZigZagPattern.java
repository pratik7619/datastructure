package ztm.strings;

import java.util.ArrayList;
import java.util.List;

public class ZigZagPattern {
    //?Pratik Sherdiwala (Codelytics)
    static String toZigZag(String string, int rowCount) {

        if (rowCount == 1) return string;

        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < Math.min(rowCount, string.length()); i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char character : string.toCharArray()) {
            rows.get(currentRow).append(character);

            if (currentRow == 0 || currentRow == rowCount - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder toBeReturnedString = new StringBuilder();
        for (StringBuilder row : rows) {
            toBeReturnedString.append(row);
        }

        return toBeReturnedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(
                toZigZag("PRATIK", 3)
        );
    }
}
