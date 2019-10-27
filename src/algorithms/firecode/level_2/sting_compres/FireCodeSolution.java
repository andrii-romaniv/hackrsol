package algorithms.firecode.level_2.sting_compres;

public class FireCodeSolution {
    public static String compressString(String text) {
        int length = text.length();
        /*
         * Compression makes sense at length of larger than or equal to 2.
         */
        if (length > 2) {
            StringBuilder compressedText = new StringBuilder();
            char lastChar = text.charAt(0);
            int charCount = 1;
            for (int i = 1; i < length; i++) {
                if (text.charAt(i) == lastChar)
                    charCount++;
                else {
                    compressedText.append(lastChar);
                    if(charCount > 1)
                        compressedText.append(charCount);
                    lastChar = text.charAt(i);
                    charCount = 1;
                }
            }
            compressedText.append(lastChar);
            if(charCount > 1)
                compressedText.append(charCount);
            if (compressedText.length() < length)
                return compressedText.toString();
        }
        return text;
    }
}
