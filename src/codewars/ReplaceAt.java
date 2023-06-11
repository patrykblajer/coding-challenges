package codewars;

class ReplaceAt {
    public static void main(String[] args) {
        String word = "hello";

        StringBuilder sb = new StringBuilder();
        sb.append(word);
        for (int i = 2; i < sb.length(); i += 3) {
            sb.setCharAt(i, 'x');
        }
        sb.append("test");

        String modifiedWord = sb.toString();
        System.out.println(modifiedWord);
    }
}