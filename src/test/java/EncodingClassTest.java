import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingClassTest {
    @Test
    public void newEncode_instantiatesCorrectly() {

        Encoding_Class testEncode = new Encoding_Class("Hello", 4);
        assertEquals(true, testEncode instanceof Encoding_Class);
    }

    @Test
    public void newEncode_getsplaintext() {
        Encoding_Class testEncode = new Encoding_Class("Hello", 4);
        assertEquals("Hello", testEncode.getText());
    }

    @Test
    public void getshift_getsEncodeshift() {
        Encoding_Class testEncode = new Encoding_Class("Hello", 4);
        assertEquals(4, testEncode.getShift());
    }
    @Test
    public void testencryption() {

        int offset = 1;
        String text = "george";
        String expected = "hfpshf";
        assertEquals(expected, Encoding_Class.encrypting( text,offset));
    }

}