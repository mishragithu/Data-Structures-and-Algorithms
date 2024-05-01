class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int index = 0;
        int step = 1;

        for (char c : s.toCharArray()) {
            rows[index] += c;
            if (index == 0) {
                step = 1;
            } else if (index == numRows - 1) {
                step = -1;
            }
            index += step;
        }

        StringBuilder result = new StringBuilder();
        for (String row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
