package string.split;

public class split {
    public static void main(String[] args) {
        String text = "I love Java programming";

String[] words = text.split(" ");

for (String word : words) {
    System.out.println(word);
}
 System.out.println(words.length);



  // أطول كلمة
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
