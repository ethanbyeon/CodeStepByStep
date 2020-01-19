package Java.String;

class isAllVowels {

    public static void main(String[] args) {
        System.out.println(allVowels("obama"));
    }

    static boolean allVowels(String s) {

        int check = 0;
        for(int i = 0; i < s.length(); i++){
            String c = "" + s.charAt(i);
            if(c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") 
                || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u")) check++;
            else check = 0;
        }
        return check == s.length();
    }

}