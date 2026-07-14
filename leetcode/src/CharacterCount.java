public class CharacterCount {
    public static void main(String[] args) {
        String string = "abcdabceabcfabch";
        String str = "abc";
        String remString = string.replaceAll("abc","");
        System.out.println((string.length()-remString.length())/str.length());
    }
}
