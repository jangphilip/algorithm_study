import java.util.Arrays;

public class InterceptionSystem {
    public int solution(int[][] target){
        int answer = 0;

        Arrays.sort(target, (t1, t2) -> {return t1[1] - t2[1];});

        int last = -1;

        for(int i = 0; i< target.length; i++){
            if(last == -1){
                answer++;

                last = target[i][1] - 1;
                continue;
            }

            if(last >= target[i][0] && last <= target[i][1]){
                continue;
            }

            answer++;
            last = target[i][1] - 1;
        }
        return answer;
    }
}