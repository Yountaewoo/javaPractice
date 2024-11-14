package Practice;

import java.util.Random;
import java.util.Scanner;

public class 반복문X조건연습 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
       /*  while (true) {
            System.out.println("반복 중입니다.");
            System.out.print("종료하시겠습니까?(y/n): ");
            char input = scanner.nextLine().charAt(0);
            // 아래에 코드 추가
            if (input == 'y') {
                break;
            }
        }
        System.out.println("반복이 종료되었습니다."); */

       /* for (int i = 1; i < 51; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        } */

        /* System.out.print("정수 n 을 입력하시오:");

        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n ; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum); */

        System.out.println("< 1 ~ 50 사이 숫자 맞추기 업 앤 다운 게임 >");
        Random random = new Random();
        final int ANSWER = random.nextInt(50) + 1; // 1 ~ 50 사이의 임의의 정수

        Scanner scanner = new Scanner(System.in);

        System.out.println("ANSWER = " + ANSWER);

        int guess = scanner.nextInt();

        /*
         * guess의 값이 ANSWER에 저장된 값과 같아질 때까지 반복합니다. (다시 말해, 다르면 반복)
         * guess 값이 answer 값보다 크면 "다운!" 출력
         * guess 값이 answer 값보다 작으면 "업!" 출력
         * guess 값이 answer 값과 같으면 "정답!" 출력 후 반복 종료
         * */
        // 아래에 코드 입력

        while (guess != ANSWER) {
            if (guess > ANSWER) {
                System.out.println("다운!");
                guess = scanner.nextInt();
            } else {
                System.out.println("업!");
                guess = scanner.nextInt();
            }
        }
        System.out.println("정답!");
    }
}
