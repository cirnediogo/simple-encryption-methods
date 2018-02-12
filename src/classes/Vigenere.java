package classes;

import java.io.IOException;

/**
 * <code>caesar</code>
 *
 * @author Diogo Cirne
 *
 * @since 
 * @version %I%, %G%
 */
public class Vigenere {
    
    public static void encrypt(String[] args) throws IOException {
        File input = new File();
        File output = new File();
        try {
            Utils.checkArguments(args.length, 4);
            int[] keys = Utils.convertKey(args[3]);
            int keyIndex = 0;
            input.openInput(args[1]);
            output.openOutput(args[2]);
            int c = input.read();
            while (c != -1) {
                if (c >= Utils.LOWER_CASE_MIN && c <= Utils.LOWER_CASE_MAX) {
                    c += keys[keyIndex];
                    if (c > Utils.LOWER_CASE_MAX) {
                        c -= (Utils.LOWER_CASE_MAX - (Utils.LOWER_CASE_MIN-1));
                    }
                    keyIndex = (keyIndex + 1) % keys.length;
                }
                if (c >= Utils.UPPER_CASE_MIN && c <= Utils.UPPER_CASE_MAX) {
                    c += keys[keyIndex];
                    if (c > Utils.UPPER_CASE_MAX) {
                        c -= (Utils.UPPER_CASE_MAX - (Utils.UPPER_CASE_MIN-1));
                    }
                    keyIndex = (keyIndex + 1) % keys.length;
                }
                output.write(c);
                c = input.read();
            }
        } catch (Exception ex) {
        }
        input.close();
        output.close();
    }
    
    public static void decrypt(String[] args) throws IOException {
        File input = new File();
        File output = new File();
        try {
            Utils.checkArguments(args.length, 4);
            int[] keys = Utils.convertKey(args[3]);
            int keyIndex = 0;
            input.openInput(args[1]);
            output.openOutput(args[2]);
            int c = input.read();
            while (c != -1) {
                if (c >= Utils.LOWER_CASE_MIN && c <= Utils.LOWER_CASE_MAX) {
                    c -= keys[keyIndex];
                    if (c < Utils.LOWER_CASE_MIN) {
                        c += (Utils.LOWER_CASE_MAX - (Utils.LOWER_CASE_MIN-1));
                    }
                    keyIndex = (keyIndex + 1) % keys.length;
                }
                if (c >= Utils.UPPER_CASE_MIN && c <= Utils.UPPER_CASE_MAX) {
                    c -= keys[keyIndex];
                    if (c < Utils.UPPER_CASE_MIN) {
                        c += (Utils.UPPER_CASE_MAX - (Utils.UPPER_CASE_MIN-1));
                    }
                    keyIndex = (keyIndex + 1) % keys.length;
                }
                output.write(c);
                c = input.read();
            }
        } catch (Exception ex) {
        }
        input.close();
        output.close();
    }
    
    public static void getKey(String[] args) throws IOException {
        File decrypted = new File();
        File encrypted = new File();
        try {
            Utils.checkArguments(args.length, 3);
            decrypted.openInput(args[1]);
            encrypted.openInput(args[2]);
            int cd = decrypted.read();
            int ce = encrypted.read();
            StringBuffer key = new StringBuffer();
            int diff;
            while (cd != -1 && ce != -1) {
                diff = ce - cd;
                if (diff < 0) {
                    diff += (Utils.UPPER_CASE_MAX - (Utils.UPPER_CASE_MIN-1));
                }
                if (Utils.isLetter(cd) && Utils.isLetter(ce)) {
                    diff += Utils.UPPER_CASE_MIN;
                    key.append((char) diff);
                }
                cd = decrypted.read();
                ce = encrypted.read();
            }
            if (cd == -1 && ce == -1) {
                System.out.println("The file was encrypted using the key: ");
                System.out.println(key);
            } else {
            	System.out.println(
            		"The file doesn't appear to be encrypted by Vigenere cipher."
            	);
            }
        } catch (Exception ex) {
        }
        decrypted.close();
        encrypted.close();
    }
    
}
