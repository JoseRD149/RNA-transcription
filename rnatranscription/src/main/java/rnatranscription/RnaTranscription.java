package rnatranscription;

public class RnaTranscription {

    public static String dnaToRna(String dnaSequence) {
        StringBuilder rnaSequence = new StringBuilder();
        for (int i = 0; i < dnaSequence.length(); i++) {
            char nucleotide = dnaSequence.charAt(i);
            switch (nucleotide) {
                case 'G':
                    rnaSequence.append('C');
                    break;
                case 'C':
                    rnaSequence.append('G');
                    break;
                case 'T':
                    rnaSequence.append('A');
                    break;
                case 'A':
                    rnaSequence.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
            }
        }
        return rnaSequence.toString();
    }
}
