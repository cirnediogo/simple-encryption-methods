package tests;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

import classes.Caesar;
import classes.Encryption;
import classes.File;
import classes.Utils;
import classes.Vigenere;

public class WhiteBoxTesting {

	@Test
	public void testcase01() throws IOException {
		String input = " ";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase02() throws IOException {
		String input = "vig-getkey files/non-existent-file.txt";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase03() throws IOException {
		String input = "vig-decrypt files/non-existent-file.txt files/tc3-output.txt ABC 3";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase04() throws IOException {
		String input = "cae-encrypt files/non-existent-file.txt files/tc4-output.txt ABC";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase05() throws IOException {
		String input = "cae-decrypt files/non-existent-file.txt files/tc5-output.txt 30";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase06() throws IOException {
		String input = "cae-encrypt files/alphabet-input.txt files/tc6-output.txt 3";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase07() throws IOException {
		String input = "cae-decrypt files/alphabet-input.txt files/tc7-output.txt 3";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase08() throws IOException {
		String input = "cae-getkey files/alphabet-input.txt files/alphabet-cae-encrypted-key3.txt";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase09() throws IOException {
		String input = "vig-encrypt files/non-existent-file.txt files/tc9-output.txt 3";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase10() throws IOException {
		String input = "vig-encrypt files/alphabet-input.txt files/tc10-output.txt ABC";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase11() throws IOException {
		String input = "vig-decrypt files/alphabet-input.txt files/tc11-output.txt ABC";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase12() throws IOException {
		String input = "vig-getkey files/alphabet-input.txt files/alphabet-vig-encrypted-key-abc.txt";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase13() throws IOException {
		String input = "non-existing-command";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}

	@Test
	public void testcase14() throws IOException {
		new Encryption();
		String input = "exit\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase15() throws IOException {
		String input = "cae-encrypt files/special-characters-input.txt files/tc15-output.txt 3";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase16() throws IOException {
		String input = "cae-decrypt files/special-characters-input.txt files/tc16-output.txt 3";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase17() throws IOException {
		String input = "cae-getkey files/alphabet-input.txt files/alphabet-vig-encrypted-key-abc.txt";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase18() throws IOException {
		new Caesar();
		String input = "cae-getkey files/alphabet-input.txt files/empty-file.txt";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase19() throws IOException {
		String input = "vig-encrypt files/special-characters-input.txt files/tc19-output.txt ABC";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase20() throws IOException {
		String input = "vig-decrypt files/special-characters-input.txt files/tc20-output.txt ABC";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase21() throws IOException {
		String input = "vig-decrypt files/alphabet-input.txt files/tc21-output.txt XYZ";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase22() throws IOException {
		new Vigenere();
		String input = "vig-getkey files/alphabet-input.txt files/empty-file.txt";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase23() throws IOException {
		String input = "cae-encrypt files/non-existent-file.txt files/tc23-output.txt -10";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase24() throws IOException {
		new Utils();
		String input = "vig-encrypt files/non-existent-file.txt files/tc24-output.txt ABC{}";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase25() throws IOException {
		String input = "cae-encrypt files/non-existent-file.txt files/tc25-output.txt 3";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}
	
	@Test
	public void testcase26() throws IOException {
		String input = "cae-encrypt files/alphabet-input.txt files/read-only-file.txt 3";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		Encryption.main(new String[] {});
	}

}
