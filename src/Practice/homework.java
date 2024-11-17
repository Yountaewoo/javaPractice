package Practice;

public class homework {
    public static void main(String[] args) {

        int price = 10000;

        int totalprice = price;

        System.out.println("price = " + price); // 10000
        System.out.println("totalprice = " + totalprice); // 10000

        System.out.println("------------------------");

        // price의 값 바꾸기
        price = 20000;

        System.out.println("price = " + price); // 20000

        System.out.println("totalprice = " + totalprice); // 10000

    }
}
