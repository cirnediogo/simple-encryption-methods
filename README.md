Encryptions – Functions for simple message encryption and decryption.
============================================================

### Usage

```
cae-encrypt <input-file> <output-file> <key>
cae-decrypt <input-file> <output-file> <key>
cae-getkey <plain-text-file> <encrypted-text-file>
vig-encrypt <input-file> <output-file> <key>
vig-decrypt <input-file> <output-file> <key>
vig-getkey <plain-text-file> <encrypted-text-file>
```

### Commands

```
cae-encrypt <input-file> <output-file> <key>
```

`<input-file>` is a full path to a plain text file. `<output-file>` is a full path to the encrypted output file using Caesar cipher. `<key>` must be a number between 0 and 25. This command writes an encrypted message using Caesar cipher in the output file.

```
cae-decrypt <input-file> <output-file> <key>
```

`<input-file>` is a full path to an encrypted text file. `<output-file>` is a full path to the decrypted output file using Caesar cipher. `<key>` must be a number between 0 and 25. This command writes a decrypted message using Caesar cipher in the output file.

```
cae-getkey <plain-text-file> <encrypted-file>
```

This command prints a key on the screen. The key is derived from the given plain text file and the encrypted text file by Caesar cipher technique.

```
vig-encrypt <input-file> <output-file> <key>
```

`<input-file>` is a full path to a plain text file. `<output-file>` is a full path to an encrypted text file. `<key>` must be a string of letters between A to Z. This command writes an encrypted message using Vigenére cipher in the output file.

```
vig-decrypt <input-file> <output-file> <key>
```

`<input-file>` is a full path to an encrypted text file. `<output-file>` is a full path to a decrypted text file. `<key>` must be a string of letters between A to Z. This command writes an encrypted message using Vigenére cipher in the output file.

```
vig-key <encrypted_message> <decrypted_message>
```

This command prints a key which is a string of letters between A to Z on the screen. The key is derived from the given plain text file and the encrypted text file by Vigenére cipher technique.