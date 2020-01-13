package Java.String;

class isAllVowels {

    public static void main(String[] args) {
        System.out.println(allVowels("eiEIo"));
    }

    static boolean allVowels(String s) {
        
        boolean bool = true;

        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'a':
                    bool = true;
                    break;
                case 'e':
                    bool = true;
                    break;
                case 'i':
                    bool = true;
                    break;
                case 'o':
                    bool = true;
                    break;
                case 'u':
                    bool = true;
                    break;
                default:
                    continue;
            }
        }
        return bool;
    }

}