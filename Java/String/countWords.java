package Java.String;

class countWords {

    public static void main(String[] args) {
        System.out.println(cwords("what is your name?"));
    }

    static int cwords(String s) {
        
        int count = 0;

        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            c[i] = s.charAt(i);
            if((i > 0) && (c[i] != ' ') && (c[i - 1] == ' ') || ((c[0] != ' ') && (i == 0))) {
                count++;
            }
        }

        return count;
    }

}