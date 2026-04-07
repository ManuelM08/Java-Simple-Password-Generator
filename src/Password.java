import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Password {
    private ArrayList<Character> admittedChars;

    public Password() {
        admittedChars = new ArrayList<>(Arrays.asList(
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@',
                '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', ']', '{', '}', ';', ':', ',', '.', '<', '>', '/', '?', '|', '~', '`'
        ));
    }

    public ArrayList<Character> getAdmittedChars() {
        return new ArrayList<>(admittedChars);
    }

    public String generaPassword(int size) {
        Random r = new Random();
        int randomI = 0;
        String password = "";

        for (int i = 0; i < size; i++) {
            randomI = r.nextInt(0,admittedChars.size());
            password += admittedChars.get(randomI).charValue();
        }

        return password;

    }
}
