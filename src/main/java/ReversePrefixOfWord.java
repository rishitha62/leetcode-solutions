public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int charIndex = word.indexOf(ch);

        if(charIndex == -1)
            return word;

        sb.append(word.substring(0, charIndex + 1)).reverse();
        sb.append(word.substring(charIndex + 1));
        return sb.toString();
    }
}
