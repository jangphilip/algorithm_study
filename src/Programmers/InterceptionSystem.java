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

//백발백중을 자랑하는 요격 시스템이 있지만 운용 비용이 상당하기 때문에 미사일을 최소로 사용해서 모든 폭격 미사일을 요격하려 합니다.
//A 나라와 B 나라가 싸우고 있는 이 세계는 2 차원 공간으로 이루어져 있습니다. A 나라가 발사한 폭격 미사일은 x 축에 평행한 직선 형태의 모양이며 개구간을 나타내는 정수 쌍 (s, e) 형태로 표현됩니다.
// B 나라는 특정 x 좌표에서 y 축에 수평이 되도록 미사일을 발사하며, 발사된 미사일은 해당 x 좌표에 걸쳐있는 모든 폭격 미사일을 관통하여 한 번에 요격할 수 있습니다.
// 단, 개구간 (s, e)로 표현되는 폭격 미사일은 s와 e에서 발사하는 요격 미사일로는 요격할 수 없습니다. 요격 미사일은 실수인 x 좌표에서도 발사할 수 있습니다.
//각 폭격 미사일의 x 좌표 범위 목록 targets이 매개변수로 주어질 때, 모든 폭격 미사일을 요격하기 위해 필요한 요격 미사일 수의 최솟값을 return 하도록 solution 함수를 완성해 주세요.