import java.util.*;

public class Desafio {

    static void counter(String sentence){
        String[] words = sentence.split("\\s+");
        Map<String,Integer> wordsAndCount = new HashMap<String,Integer>();

        for (String word : words ) {
            if ( wordsAndCount.containsKey(word) ) {
                wordsAndCount.put(word,wordsAndCount.get(word)+1);
            } else {
                wordsAndCount.put(word,1);
            }
        }

        System.out.println(wordsAndCount);
    }

    public static void main(String[] args) {
        String sentence = "André João Pedro André João João Pedro";
        counter(sentence);
    }
}
