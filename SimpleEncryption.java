public class Kata {

  public static String encrypt(final String text, final int n) {
    if (n < 1) {
                return text;
            }
            String odd = "";
            String even = "";
            int x = n;
            while (x > 0) {

                for (int i = 0; i <= text.length() - 1; i++) {
                    if (i % 2 == 0) {
                        even += text.charAt(i);
                    } else {
                        odd += text.charAt(i);
                    }

                }
                return encrypt(odd + even, x - 1);
            }

            return odd + even;
  }
  
  public static String decrypt(final String encryptedText, final int n) {
    if (n < 1) {
                return encryptedText;
            }
            String result = "";
            String odd = encryptedText.substring(0, middleIndex);
            String even = encryptedText.substring(middleIndex);
            int x = n;
            while (x > 0) {
                if (odd.length() > even.length()) {
                    for (int i = 0; i < even.length(); i++) {
                        result += String.valueOf(even.charAt(i)) + String.valueOf(odd.charAt(i));

                    }
                    result += String.valueOf(odd.charAt(odd.length() - 1));
                } else if (odd.length() < even.length()) {
                    for (int i = 0; i < odd.length(); i++) {
                        result += String.valueOf(even.charAt(i)) + String.valueOf(odd.charAt(i));
                    }
                    result += String.valueOf(even.charAt(even.length() - 1));
                } else if (odd.length() == even.length()) {
                    for (int i = 0; i < even.length(); i++) {
                        result += String.valueOf(even.charAt(i)) + String.valueOf(odd.charAt(i));
                    }
                }
                return decrypt(result, x - 1);
            }return result;
        }
  
}
