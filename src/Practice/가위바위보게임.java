package Practice;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {
    public static void main(String[] args) {

        while (true) {

            Random random = new Random();

            int randomInt = random.nextInt(3);

           // System.out.println("randomInt = " + randomInt);

            //0,1,2를 가위,바위,보로 변환
            String computer;
            if (randomInt == 0) {
                computer = "가위";
            } else if (randomInt == 1) {
                computer = "바위";
            } else {
                computer = "보";
            }
            //System.out.println("computer = " + computer);

            // 사용자가 입력
            Scanner scanner = new Scanner(System.in);

            System.out.print("가위,바위,보 중 하나를 입력하시오:");

            String player = scanner.nextLine();

            //잘못 입력 했을 때 다시 입력
            while (!player.equals("가위") && !player.equals("바위") && !player.equals("보")) {
                System.out.print("다시 입력하시오:");
                player = scanner.nextLine();
            }

            System.out.println("player = " + player);

            System.out.println("computer = " + computer);

            //승리,패배 나누기
            if (computer.equals(player)) {
                System.out.println("무승부");
            } else if (computer.equals("가위") && player.equals("보") || computer.equals("바위") && player.equals("가위") || computer.equals("보") && player.equals("바위")) {
                System.out.println("패배");
            } else {
                System.out.println("승리");
            }

            //다음 게임 여부
            System.out.println("한 판 더? : (yes/no)");

            String Answer = scanner.nextLine();

            // 잘못 입력을 했을 때 다시 입력
            while (!Answer.equals("yes") && !Answer.equals("no")) {
                System.out.print("다시 입력하시오:");
                Answer = scanner.nextLine();
            }
            if (Answer.equals("no")) {
                break;
            }
        }
        System.out.println("종료");
    }
}