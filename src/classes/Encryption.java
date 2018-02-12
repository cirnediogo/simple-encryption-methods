package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <code>Encryption</code>
 *
 * @author Diogo Cirne
 *
 * @since 
 * @version %I%, %G%
 */
public class Encryption {

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        readInput();
    }
    
    private static void readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        System.out.println("Type desired command.");
        input = reader.readLine();
        String[] args = input.split(" ");
        if (args.length < 1) {
            readInput();
        }
        switch (args[0]) {
            case "cae-encrypt":
                Caesar.encrypt(args);
                break;
            case "cae-decrypt":
                Caesar.decrypt(args);
                break;
            case "cae-getkey":
                Caesar.getKey(args);
                break;
            case "vig-encrypt":
                Vigenere.encrypt(args);
                break;
            case "vig-decrypt":
                Vigenere.decrypt(args);
                break;
            case "vig-getkey":
                Vigenere.getKey(args);
                break;
            case "exit":
                return;
            default:
                System.out.println("Command not recognized. Try again.");
                break;
        }
        System.out.println("");
        readInput();
    }

}
