
public class WordsReverser {

    public String reverseWord(String word) {
        char[] sourceWord = word.toCharArray();
        int lastIndex = sourceWord.length - 1, firstIndex = 0;

        while (firstIndex < lastIndex) {
            if (!Character.isLetter(sourceWord[firstIndex]))
                firstIndex++;
            else if (!Character.isLetter(sourceWord[lastIndex]))
                lastIndex--;
            else {
                char tmp = sourceWord[firstIndex];
                sourceWord[firstIndex] = sourceWord[lastIndex];
                sourceWord[lastIndex] = tmp;
                firstIndex++;
                lastIndex--;
            }
        }
        return new String(sourceWord);
    }

    public String reverseText(String word) {
        String[] words = word.split(" ");

        for (int i = 0; i <words.length ; i++) {
            String resultWord = reverseWord(words[i]);
            words[i] = resultWord;
        }
        return String.join(" ",words);
    }
}
