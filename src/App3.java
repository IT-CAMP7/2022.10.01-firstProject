public class App3 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        String[] strings = new String[20];

        tab[15] = 5;
        tab[10] = 7;

        strings[1] = "ABCD";
        strings[0] = "pierwszy element";
        strings[19] = "ostatni element tablicy";

        System.out.println(strings[1]);
        System.out.println(tab[10]);
        System.out.println(tab[0]);

        char x = 'R';

        char[] chars = new char[5];
        System.out.println(chars[0]);

        tab[7] = tab[15] - tab[10];

        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[4] = 5;

        int[] ints2 = {1,2,3,4,5};

        System.out.println(ints2[3]);

        int kk[] = new int[543];


    }
}
