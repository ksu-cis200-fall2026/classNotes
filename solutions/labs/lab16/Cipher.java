public class Cipher {
    private int key;

    public Cipher(int k) {
        key = k;
    }

    public String encrypt(String msg) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);

            //lower-case check
            if (c >= 'a' && c <= 'z') {
                c = (char)(c + key);
                if (c > 'z') {
                    c -= 26;
                }
            }
            //upper-case check
            else if (c >= 'A' && c <= 'Z') {
                c = (char)(c + key);
                if (c > 'Z') {
                    c -= 26;
                }
            }

            result.append(c);
        }

        return result.toString();
    }

    public String decrypt(String msg) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);

            //lower-case check
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - key);
                if (c < 'a') {
                    c += 26;
                }
            }
            //upper-case check
            else if (c >= 'A' && c <= 'Z') {
                c = (char)(c - key);
                if (c < 'A') {
                    c += 26;
                }
            }

            result.append(c);
        }

        return result.toString();
    }
}