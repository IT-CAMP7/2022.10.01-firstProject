public class App4 {
    public static void main(String[] args) {
        /*int a = 9;
        boolean b = true;
        if(a > 5) {
            System.out.println("to jest piatka !!");
        } else if(a > 4 && a < 7 && a % 2 == 0) {
            System.out.println("to jest 6 !!");
        } else if(a == 7) {
            System.out.println("to jest 7 !!");
        } else if(a == 8) {
            System.out.println("to jest 8 !!");
        } else {
            System.out.println("to jest cos innego !!");
        }*/

        String cos = "1";
        switch(cos) {
            case "1":
                System.out.println("to jest 1");
            case "2":
                System.out.println("to jest 2");
            case "3":
                System.out.println("to jest 3");
            case "4":
                System.out.println("to jest 4");
                int g = 6;
                int wynik = g * 7;
            default:
                System.out.println("nie wiadomo co to jest");
        }

        /*if(cos == "1") {
            System.out.println("to jest 1");
        } else if(cos == "2") {
            System.out.println("to jest 2");
        } else if(cos == "3") {
            System.out.println("to jest 3");
        } else {
            System.out.println("nie wiadomo co to jest");
        }*/

        System.out.println("ostatnia linia programu !!");
    }
}
