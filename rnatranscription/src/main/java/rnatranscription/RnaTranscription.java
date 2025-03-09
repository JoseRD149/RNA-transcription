package rnatranscription;
import java.util.Map;
public class RnaTranscription {

    private static final Map<Character, Character> TRANSCRIPTION_MAP = Map.of(
        'G', 'C',
        'C', 'G',
        'T', 'A',
        'A', 'U'
    );

    public static String dnaToRna(String dnaSequence) {
        if (dnaSequence == null || dnaSequence.isEmpty()) {
            throw new IllegalArgumentException("Error: DNA sequence cannot be null or empty.");
        }

        StringBuilder rnaSequence = new StringBuilder();

        for (char nucleotide : dnaSequence.toCharArray()) {
            if (!TRANSCRIPTION_MAP.containsKey(nucleotide)) {
                throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
            }
            rnaSequence.append(TRANSCRIPTION_MAP.get(nucleotide));
        }

        return rnaSequence.toString();
    }
}
