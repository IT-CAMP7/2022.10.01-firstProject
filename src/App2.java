public class App2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int result;
        result = a / b;
        System.out.println(result);

        double c = 5.5;
        double d = 6.6;
        double result2 = c / d;
        System.out.println(result2);

        int e = 5;
        int f = 2;
        int result3 = e % f;
        System.out.println(result3);

        int g = 5;
        System.out.println(g % 2);

        String s1 = "ABC";
        String s2 = "DEF";
        System.out.println(s1 + " " + s2);

        System.out.println(a > b);

        boolean wynik = a != b;
        System.out.println(wynik);

        boolean logiczna1 = false;
        boolean logiczna2 = false;
        boolean wynik2 = logiczna1 && logiczna2;
        System.out.println(wynik2);

        boolean wynik3 = !logiczna1;
        System.out.println(wynik3);

        boolean wynik4 = logiczna1 ^ logiczna2;
        System.out.println(wynik4);

        int i = 5;
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);
        System.out.println("------------------------------------------");
        int j = 0;
        System.out.println(j++);
        System.out.println(++j);
        System.out.println(j--);
        System.out.println(--j);
        System.out.println(j);
    }
}
