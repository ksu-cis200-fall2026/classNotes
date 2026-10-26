public class Cipher {
    private int key;

    public Cipher(int k) {
        key = k;
    }

    public String encrypt(String message) {
        //YOU DO THIS
        //return ciphertext for message

        //create a StringBuilder for the result

        //loop through characters in message
            //get the current character out of message
            //maybe "letter" is my character
            //is letter uppercase?
                //letter += key;
                //check to see if you went past the end of the alphabet
                //if (letter > 'Z') 
                    //letter -= 26;
            //same idea if it is lowercase
            //append that letter onto my StringBuilder

        //return my StringBuilder as a string
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
