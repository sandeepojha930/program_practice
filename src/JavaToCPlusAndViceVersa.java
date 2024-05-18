public class JavaToCPlusAndViceVersa {

    public static String getVariableName(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(input.length());
        char[] charArr = input.toCharArray();
        if (input.contains("_")) {
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '_') {
                    i++;
                    stringBuilder.append(Character.toUpperCase(charArr[i]));
                } else {
                    stringBuilder.append(charArr[i]);
                }
            }
        } else {
            for (int i = 0; i < charArr.length; i++) {
                if (Character.isUpperCase(charArr[i])) {
                    stringBuilder.append("_").append(Character.toLowerCase(charArr[i]));
                } else {
                    stringBuilder.append(charArr[i]);
                }
            }
        }

        return stringBuilder.toString();
    }
}
