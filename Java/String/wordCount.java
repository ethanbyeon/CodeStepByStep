package Java.String;

class wordCount {
    public static void main(String[] args) {
        System.out.println(count("hello, how are you?"));
    }

    static int count(String s) {

        int n = 0;

        if(s == null || s.equals(" ")) return n;
        s = s.trim();

        for(int i = 0; i < s.length(); i++){
            if(((i == 0) && (s.charAt(i) != ' ')) || ((i > 0) && (s.charAt(i) != ' ') && (s.charAt(i - 1) == ' '))){
                n++;
            }
        }

        return n;
    }
}