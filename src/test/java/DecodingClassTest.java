import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingClassTest {
    @Test
    public void newEncode_instantiatesCorrectly() {

        Decoding_Class testDecoding = new Decoding_Class("Hello", 4);
        assertEquals(true, testDecoding instanceof Decoding_Class);
    }

    @Test
    public void newDecode_getsciphertext() {
        Decoding_Class testDecode = new Decoding_Class("Hello", 4);
        assertEquals("Hello", testDecode.getCiphertext());
    }

    @Test
    public void getshift_getsDecodeshift() {
        Decoding_Class testDecode = new Decoding_Class("Hello", 4);
        assertEquals(4, testDecode.getShift());
    }
    @Test
    public void testdecryption() {

        int shift = 1;
        String ciphertext = "hfpshf";
        String expected = "george";
        assertEquals(expected, Decoding_Class.decrypting( ciphertext,shift));
    }

}