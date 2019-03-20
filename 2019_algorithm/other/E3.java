
/*
청개구리 문제
풀이 과정 : 처음은 A-Z까지 배열과 Z-A까지 배열이 있다. 해당 문자가 A-Z배열에서 찾으면 Z-A배열에서 해당 인덱스의 값을 문자열에 더해준다.
            다시풀때는, 아스키코드를 이용했는데(예지님께 감사합니다.), A가 65다. Z는 90이다. A와 Z를 더하면 155다. 이것을 이용한다.
 */
public class E3 {
    public static String solution(String word) {
        String result = "";
        String[] num = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] str = {"Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A"};
        String s = word;
        for (int i = 0; i < s.length(); ++i) {

            for (int j = 0; j < 26; ++j) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {//소문자면 대문자로 바꿔서 작업한다.
                    String upp = s.toUpperCase();

                    if (num[j].equals(String.valueOf(upp.charAt(i)))) {
                        int index = j;
                        result += str[index].toLowerCase();
                        break;
                    }
                } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {//대문자면 그대로
                    if (num[j].equals(String.valueOf(s.charAt(i)))) {
                        int index = j;
                        result += str[index];
                        break;
                    }
                } else if (" ".equals(String.valueOf(s.charAt(i)))) { //공백이면
                    result += " ";
                    break;
                }
            }
        }
        return result;
    }

    // version2
    public static String solution2(String word) {
        String result = "";

        for (int i = 0; i < word.length(); ++i) {

            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') { //소문자면 a=97, z=122이다.
                result += (char) (219 - word.charAt(i));
            } else if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {//대문자면 A=65, Z=90이다.
                result += (char) (155 - word.charAt(i));
            } else if (" ".equals(String.valueOf(word.charAt(i)))) { //공백이면
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("I love you"));
       // solution2("I am Ruby");
        System.out.println(solution2("I love you"));
    }
}
