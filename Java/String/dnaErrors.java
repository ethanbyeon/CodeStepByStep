package Java.String;

class dnaErrors {

    public static void main(String[] args) {
        System.out.println(dna("GGGA-GAATCTCTGGACT","CTCTACTTA-AGACCGGTACAGG"));
    }

    static int dna(String s, String x) {

        int count = 0;
        int point = 0;
        int nucleo = 0;

        int len = 0;
        if(s.length() <= x.length()){
            len = s.length();
            nucleo += x.length() - s.length();
        }
        if(s.length() >= x.length()){
            len = x.length();
            nucleo += s.length() - x.length();
        }

        for(int i = 0; i < len; i++) {
            if((s.charAt(i) == '-' && x.charAt(i) != '-') || (s.charAt(i) != '-' && x.charAt(i) == '-')){
                nucleo++;
                continue;
            }
            
            if((s.substring(i, i + 1).equalsIgnoreCase("A") && !(x.substring(i, i + 1).equalsIgnoreCase("T"))) || 
                (s.substring(i, i + 1).equalsIgnoreCase("T") && !(x.substring(i, i + 1).equalsIgnoreCase("A")))) point++;

            else if((s.substring(i, i + 1).equalsIgnoreCase("C") && !(x.substring(i, i + 1).equalsIgnoreCase("G"))) || 
                (s.substring(i, i + 1).equalsIgnoreCase("G") && !(x.substring(i, i + 1).equalsIgnoreCase("C")))) point++;
        }

        count = nucleo + (point * 2);

        return count;
    }

}