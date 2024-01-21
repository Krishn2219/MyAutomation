package Company;



public class test5 {

    public static void main(String[] args) {
        String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(maxWordsInSingleSentence(sentences1)); // Output: 6

        String[] sentences2 = {"please wait", "continue to fight", "continue to win"};
        System.out.println(maxWordsInSingleSentence(sentences2)); // Output: 3
    }

    public static int maxWordsInSingleSentence(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            int wordsCount = countWords(sentence);
            maxWords = Math.max(maxWords, wordsCount);
        }

        return maxWords;
    }

    private static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}