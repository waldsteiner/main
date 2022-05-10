import java.util.Scanner;

public class SimpleCalculatorTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //외부 입력을 받을 수 있는 스캐너

        System.out.println("첫 번째 숫자를 입력하세요.");
        String str1 = scan.nextLine();
        //첫 번째 숫자 입력

        System.out.println("연산자를 입력하세요.");
        String op = scan.nextLine();
        //사칙연산자 입력

        System.out.println("두 번째 숫자를 입력하세요.");
        String str2 = scan.nextLine();
        //두 번째 숫자 입력

        int num1 = Integer.parseInt(str1);
        //입력받은 첫 번째 문자를 숫자형으로 변환
        int num2 = Integer.parseInt(str2);
        //입력받은 두 번째 문자를 숫자형으로 변환
        int result = 0;

        if(op.equals("+")) {
            result = num1 + num2;
            //덧셈연산
        } else if (op.equals("-")) {
            result = num1 - num2;
            //뺄셈연산
        } else if (op.equals("*")) {
            result = num1 * num2;
            //곱셈연산
        } else if (op.equals("/")) {
            result = num1 / num2;
            //나눗셈연산
        }

        System.out.println(str1 + " + " + str2 + " = " + result);


    }

}
