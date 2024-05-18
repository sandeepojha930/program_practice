public class ZigZagConversion {

    public static void main(String[] args) {
        ZigZagConversion zagConversion = new ZigZagConversion();
        String str = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(zagConversion.convert(str, numRows));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int direction = 1;
        int currentRow = 0;
        for (char ch : s.toCharArray()) {
            rows[currentRow].append(ch);
            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }
            currentRow += direction;
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder row : rows) {
            sb.append(row);
        }
        return sb.toString();
    }
}
