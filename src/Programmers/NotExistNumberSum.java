public class NotExistNumberSum {
    public int solution(int[] inputNumbers){
        int sum = 0;
        for(int i=0; i<inputNumbers.length; i++){
            sum += inputNumbers[i];
        }
        return 45 - sum;
    }
}

//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
