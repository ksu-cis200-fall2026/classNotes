public class Cipher {
    private int key;

    public Cipher(int k) {
        key = k;
    }

    public String encrypt(String message) {
        //YOU DO THIS
        //return ciphertext for message

        //make a StringBuilder
        //loop through message
            //get current character (use charAt) from message
            //(call it letter)

            //is letter uppercase?
                //letter += key
                //if letter > 'Z'
                    //letter -= 26
            //same idea for lowercase

            //append letter onto StringBuilder

        //return your result 
        
        //delete line below when done
        return "";
    }

    public String decrypt(String ciphertext) {
        //YOU DO THIS
        //return decrypted message

        //delete line below when done
        return "";
    }
}
