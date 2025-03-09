package rnatranscription;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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

      @Test
    public void testInvalidNucleotideThrowsException() {
        String invalidDna = "GXTA"; 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RnaTranscription.dnaToRna(invalidDna);
        });

        assertEquals("Invalid DNA nucleotide: X", exception.getMessage());
    }

    @Test
public void testLongDnaSequence() {
    String dnaSequence = "GCTAGCTAGCTAGCTAGCTA"; 
    String expectedRnaSequence = "CGAUCGAUCGAUCGAUCGAU"; 

    String result = RnaTranscription.dnaToRna(dnaSequence);

    assertEquals(expectedRnaSequence, result);
}

}
