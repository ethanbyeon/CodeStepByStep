package Java.String;

class isVowel {

    public static void main(String[] args) {
        System.out.println(vowel("a"));
    }

    static boolean vowel(String s) {
        return s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") || 
            s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o") || s.equalsIgnoreCase("u");
    }

}