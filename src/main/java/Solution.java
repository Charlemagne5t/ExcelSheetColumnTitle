public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 26) {
            int rightDigit = columnNumber % 26;
            if(rightDigit != 0){
                stringBuilder.insert(0, (char) (rightDigit + 64));
                columnNumber = (columnNumber - rightDigit) / 26;
            }else {
                stringBuilder.insert(0, "Z");
                columnNumber = (columnNumber - rightDigit) / 26 - 1;
            }

        }
        if (columnNumber != 0) {
            stringBuilder.insert(0, (char) (columnNumber + 64));
        }
        return stringBuilder.toString();
    }
}