public class App5 {
    public static void main(String[] args) {
        int[] tab = new int[10000];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = (i + 1) * 2;
        }

        for(int zmienna : tab) {
            System.out.println(zmienna);
        }


        /*for(int element : tab) {
            element = 5;
        }

        for(int element : tab) {
            System.out.println(element);
        }

        if(true) {
            int a = 5;
        }
        int a = 8;*/

        /*for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }*/

        System.out.println("koniec programu !!");
    }
}
