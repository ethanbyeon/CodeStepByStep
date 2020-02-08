import jdk.internal.agent.resources.agent_de;

class Collapse {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        collapse(a);

    }

    static int[] collapse(int[] list) {

        String sum = "";

        if(list.length == 0) return list;

        for(int i = 0; i < list.length - 1; i+=2) {
            sum += list[i] + list[i + 1] + " ";
        }

        if(list.length % 2 != 0) sum += list[list.length - 1];

        String[] split = sum.split(" ");

        int[] col = new int[split.length];
        for(int i = 0; i < split.length; i++) {
            col[i] = Integer.parseInt(split[i]);
        }

        return col;
    }

}