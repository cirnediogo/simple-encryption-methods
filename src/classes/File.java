package classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <code>File</code>
 *
 * @author Diogo Cirne
 *
 * @since
 * @version %I%, %G%
 */
public class File {

    private FileReader input = null;
    private FileWriter output = null;

    public void openInput(String path) throws FileNotFoundException {
        try {
            input = new FileReader(path);
        } catch (FileNotFoundException ex) {
            System.out.println("Can't open input file. Try again.");
            throw (ex);
        }
    }

    public void openOutput(String path) throws IOException {
        try {
            output = new FileWriter(path);
        } catch (IOException ex) {
            System.out.println("Can't open/create output file. Try again.");
            throw (ex);
        }
    }

    public int read() throws IOException {
        return input.read();
    }

    public void write(int c) throws IOException {
    	output.write(c);
    }

    public void close() throws IOException {
        if (input != null) {
            input.close();
        }
        if (output != null) {
            output.close();
        }
    }

}
