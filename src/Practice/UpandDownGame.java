package Practice;

import java.util.Random;
import java.util.Scanner;

public class UpandDownGame {
    public static void main(String[] args) {

        System.out.println("< 1 ~ 50 사이 숫자 맞추기 업 앤 다운 게임 >");
        Random random = new Random();
        final int ANSWER = random.nextInt(50) + 1; // 1 ~ 50 사이의 임의의 정수

        Scanner scanner = new Scanner(System.in);

        System.out.println("ANSWER = " + ANSWER);

        System.out.print("숫자를 입력하시오:");

        int guess = scanner.nextInt();


        while (guess > 50 || guess < 1) {
            System.out.print("1 ~ 50 사이의 숫자를 다시 입력하시오:");
            guess = scanner.nextInt();
        }
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
