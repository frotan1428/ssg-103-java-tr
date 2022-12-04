package ssgmapHashtableHashmap1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMap04 {

    public static void main(String[] args) {
          /*
            How to count the number of occurrences of the words in a sentence
            For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                          Java=3, is=1, easy=1, Type=1, ... , learn=2, ...

                          get read of punctuation
                          split the word
         */
        String sentence = "Java is easy. Type codes to learn Java. To earn money learn Java.";
        sentence=sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);
        String word[]=sentence.split(" ");
        System.out.println(Arrays.toString(word));//[Java, is, easy, Type, codes, to, learn, Java, To, earn, money, learn, Java]

        Map<String,Integer> result=new HashMap<>();

        for (String w:word){
            Integer numOfOccurrences=result.get(w);
            if (numOfOccurrences==null){
                result.put(w,1);
            }else{
                result.put(w,numOfOccurrences+1);
            }

        }
        System.out.println(result);

    }

}
