package rnatranscription;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RnaTranscriptionTest {

    @Test
    public void testDnaToRnaConversion() {
        String dnaSequence = "GCTA";
        String expectedRnaSequence = "CGAU";
        String result = RnaTranscription.dnaToRna(dnaSequence);

        assertEquals(expectedRnaSequence, result);
    }

    @Test
    public void testEmptyDnaSequence() {
        String dnaSequence = "";
        String expectedRnaSequence = "";
        String result = RnaTranscription.dnaToRna(dnaSequence);

        assertEquals(expectedRnaSequence, result);
    }

}
