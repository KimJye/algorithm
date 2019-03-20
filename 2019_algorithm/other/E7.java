/*
풀이 과정 : 처음에는 중복인 것을 지우는 것을 생각했다. 그다음에는 앞문자와 비교했을 때 다르면 넣는 것을 생각했다.
            처음에 중복인 것을 지우는 것은 replace를 생각했었는데, 값이 정확하게 나오지 않았다.
            앞문자와 비교했을 때 다르면 넣는 것은 검사를 하여 집어넣은 문자에대해서는 추후 검사를 해야하기 때문에 이중 반복문을 써야했다..
            다시 생각했을 때는, 앞문자와 비교했을 때 다르면 넣는 것보다는.. 예제 과정처럼 앞문자와 비교했을때 다르면 지우는 것을 생각했다.
 */
public class E7 {

    public static String solution(String cryptogram) {

        StringBuilder sb = new StringBuilder(cryptogram);

        int len = cryptogram.length();

        for (int i = 0; i < len; ++i) {
            if (i + 1 == len) break;

            if (String.valueOf(sb.charAt(i)).equals(String.valueOf(sb.charAt(i + 1)))) {//앞문자랑 비교했을 때 같으면 지우기

                sb.deleteCharAt(i); //지우면 한칸씩 당겨짐.
                sb.deleteCharAt(i); //지우면 한칸씩 당겨짐.

                len -= 2; // 두번 지우니까 길이 2개 줄어든다.
                i = -1; // 기존에 검사를 해서 넣은 문자에 대해서도 검사를해야함.

            }
        }
        return sb.toString();
      /*
        for(int i = 0; i < cryptogram.length(); i++) {
            if(!answer.contains(String.valueOf(cryptogram.charAt(i)))) {
                answer += String.valueOf(cryptogram.charAt(i));
            }else if(answer.contains(String.valueOf(cryptogram.charAt(i)))){
                System.out.println("중복 : "+String.valueOf(cryptogram.charAt(i)));
                String remove = String.valueOf(cryptogram.charAt(i));
                answer.replace(remove,"");
                System.out.println("지우고난뒤 : "+ answer);
            }
        }
        */
    }

    public static void main(String[] args) {
        System.out.println("browoanoommnaon 해독 : "+ solution("browoanoommnaon"));

        System.out.println("zyelleyz 해독 : "+ solution("zyelleyz"));


    }
}
