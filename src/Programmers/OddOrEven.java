import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OddOrEven {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
            // 이후 코드 처리
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 오류 메시지 출력
        }
        
        if(n % 2 == 0){
            System.out.println(n+" is even");
        } else {
            System.out.println(n+" is odd");
        }
    }
}

//자연수 n이 입력으로 주어졌을 때
// 만약 n이 짝수이면 "n is even"을,
// 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.