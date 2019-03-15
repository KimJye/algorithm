/*
 * Date: 2019. 03. 15
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하라.
 * description : 단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다.
 * solution : (x1,y1),(x2,y2),(x3,y3)가 있을때 직사각형을 이루기위해 나머지 좌표(x4,y4)를 구하는 문제이다.
              직사각형은 x좌표끼리 같고 y좌표끼리 같다는 것을 이용할 때
              x1과 x2가 같다면 x4는 x3일것이고,
              x1과 x3가 같다면 x4는 x2일것이고,
              x2와 x3이 같다면 x4는 x1일 것이다.
              y도 마찬가지다.
              XOR은 둘이 같으면 같은 값을 반환하고, 다르면 다른 값을 반환한다.
              따라서 위 규칙을 XOR로 생각했을 때, 주어진 x1,x2,x3를 XOR했을 때 다른 하나의 x값만 반환을 할 것이고 그것은 곳 구하고자하는 x값이 된다.
*/
public class RectangularCoordinates {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        answer[0] = v[0][0]^v[1][0]^v[2][0];
        answer[1] = v[0][1]^v[1][1]^v[2][1];

        return answer;
    }
}
