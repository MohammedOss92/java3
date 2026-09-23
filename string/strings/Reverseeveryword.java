package string.strings;

import string.charAt1;

public class Reverseeveryword {
    public static void main(String[] args) {
        String s = "hello world java";
        String[] a = s.split(" ");
      //  ونريد عكس الكلمة الحالية، وليس الكلمات نفسها.
        for(String word : a){
             for(int i =word.length()-1;i >=0;i--){
                  System.out.print(word.charAt(i)  );
    }
        System.out.print(" "  );
    }
    }

    
    
}
