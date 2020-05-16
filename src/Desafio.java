import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        String myfile = "myfile.txt";
        Map<String,Integer> wordsAndCount = new HashMap<String,Integer>();
        try {
            counter(myfile, wordsAndCount);
        }catch( FileNotFoundException f) {
            System.out.println("File not found");
        }
        System.out.println(wordsAndCount);
    }

    static void counter( String myfile, Map<String,Integer> wordsAndCount ) throws FileNotFoundException {
        Scanner file = new Scanner ( new File(myfile) );
        while (file.hasNext()){
            String word = file.next();
            Integer count = wordsAndCount.get(word);
            if ( count != null )
                count++;
            else
                count = 1;
            wordsAndCount.put(word,count);
        }
        file.close();
    }
}