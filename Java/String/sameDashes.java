package Java.String;

class sameDashes {

    public static void main(String[] args) {
        System.out.println(dash("hi--there-you.", "12--(134)-7539"));
    }

    static boolean dash(String s, String x) {

        int index = s.indexOf("-", 0);
        while(index > 0) {
            if((x.length() <= index) || (x.charAt(index) != '-')) return false;
            index = s.indexOf("-", (index + 1));
        }

        return !(x.indexOf("-", s.lastIndexOf("-") + 1) > 0);
    }

}