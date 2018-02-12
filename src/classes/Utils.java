package classes;
/**
 * <code>Utils</code>
 *
 * @author Diogo Cirne
 *
 * @since 
 * @version %I%, %G%
 */
public class Utils {
    
    public static int UPPER_CASE_MIN = 65;
    public static int UPPER_CASE_MAX = 90;
    public static int LOWER_CASE_MIN = 97;
    public static int LOWER_CASE_MAX = 122;

    public static void checkArguments(int entered, int desired) throws Exception {
        if (entered < desired) {
            System.out.println("Not enough arguments. Try again.");
            throw new Exception();
        } else if (entered > desired) {
            System.out.println("Too many arguments. Try again.");
            throw new Exception();
        }
    }
    
    public static int convertKey(String text, int min, int max) throws Exception {
        int key = 0;
        try {
            key = Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            System.out.println("Key argument should be an integer number. Try again.");
            throw new Exception();
        }
        if (key < min || key > max) {
            System.out.print("Key argument is out of the range (");
            System.out.print(min);
            System.out.print(" to ");
            System.out.print(max);
            System.out.println("). Try again.");
            throw new Exception();
        }
        return key;
    }
    
    public static int[] convertKey(String text) throws Exception {
        text = text.toUpperCase();
        int[] keys = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            keys[i] = text.codePointAt(i) - Utils.UPPER_CASE_MIN;
            if (keys[i] < 0 || keys[i] > (Utils.UPPER_CASE_MAX - Utils.UPPER_CASE_MIN)) {
                System.out.println("Key argument should be a string of letters between A to Z. Try again.");
                throw new Exception();
            }
        }
        return keys;
    }
    
    public static boolean isLetter(int c) {
    	if (c >= LOWER_CASE_MIN && c <= LOWER_CASE_MAX) {
    		return true;
    	}
    	if (c >= UPPER_CASE_MIN && c <= UPPER_CASE_MAX) {
    		return true;
    	}
    	return false;
    }
    
}
