package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//��ǰ : minus = new StringTokenizer(str.substring(i+1).replaceAll("[+]"," ")); �̹��忡�� +�� �������� replace�� �ȵ�.
/*
 *
 * ��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ����� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٿ� ���� �־�����. ���� ��0��~��9��, ��+��, �׸��� ��-�������� �̷���� �ְ�, ���� ó���� ������ ���ڴ� �����̴�. 
�׸��� �����ؼ� �� �� �̻��� �����ڰ� ��Ÿ���� �ʰ�, 5�ڸ� �̻� ���ӵǴ� ���ڴ� ����. 
���� 0���� ������ �� �ִ�.
Tip : -������ ���� - ���ö����� ��� ���� �� ��� ������ ���ָ� �ȴ�.
 */
/*
 * ����,���ƿ��� �ڵ� ����..
 */
public class �Ҿ������ȣ_p1541 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		
		int a=0,b=0;//a�� +�κ� ������ -�� ó�� �����ϱ� �� ���鸸 ���� , b�� -�κ� ������ ���� -�� ���� ���� �� ���� 
		String tmp = "";
		
		StringTokenizer plus, minus;
		
		
		for(int i=0; i<str.length(); ++i) {
			//-�� �۾�.
			//- �ڿ��� ���� ��������
			if(str.charAt(i)=='-') {
				minus = new StringTokenizer(str.substring(i+1).replaceAll("\\+|\\-"," "));
				System.out.println(str.toString());
				while(minus.hasMoreTokens()) {
					b+=Integer.parseInt(minus.nextToken()); 
					//System.out.println(b);
					break;
				}
			}else {
				tmp +=str.charAt(i); //���ڿ� +�� ����.
				//System.out.println(tmp);
			}
		}
		//+�� �۾�.
		plus = new StringTokenizer(tmp,"+");//+���� ���ڸ� ��´�.
		
		while(plus.hasMoreTokens()) {
			a+=Integer.parseInt(plus.nextToken());
		}
		System.out.println(a-b);
		
	}

}
