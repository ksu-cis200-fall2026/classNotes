public class Lab16 {
    public static void main(String[] args) {
        EncryptionView v = new EncryptionView();
        
        int count = 0;
        boolean done = false;
        int k = 0;
        while (count < 3 && !done) {
            try {
                k = v.getKey();
                done = true;
            }
            catch (NumberFormatException e) {
                v.printError();
            }
            count++;
        }
        if (count == 3 && !done) {
            return;
        }

        Cipher c = new Cipher(k);
        String msg = v.getMessage();
        String enc = c.encrypt(msg);

        v.printResult(enc, "encrypt");

        String dec = c.decrypt(enc);

        v.printResult(dec, "decrypt");
    }
}