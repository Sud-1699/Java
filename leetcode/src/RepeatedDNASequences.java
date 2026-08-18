import java.util.List;
import java.util.ArrayList;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

        List<String> dnaSequences = new ArrayList<>();

        int l = 0, r = 0;
        StringBuilder dna = new StringBuilder();
        while(r < s.length()) {
            if(s.charAt(r) == 'A' || s.charAt(r) == 'C' || s.charAt(r) == 'G' || s.charAt(r) == 'T')
                dna.append(s.charAt(r));

            if(dna.length() == 10) {
                dnaSequences.add(dna.toString());
                l += dna.length();

                dna = new StringBuilder();
            }

            r++;
        }

        System.out.println(dnaSequences);
    }
}
