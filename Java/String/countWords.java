package Java.String;

class countWords {

    public static void main(String[] args) {
        System.out.println(cwords("what is your name?"));
    }

    static int cwords(String s) {
        
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(((i == 0) && (s.charAt(i) != ' ')) || ((i > 0) && (s.charAt(i) != ' ') && (s.charAt(i - 1) == ' '))){
                count++;
            }
        }

        return count;
    }

}