package java1;

public class Class4 {

	//응용문제4
	/*
	  static이 없는 외부 class 이며, 해당 class에 두개의 숫자를
	  인자값으로 보냅니다. 
	  해당 두개의 숫자 범위 안에 모든 값을 더하여 결과값을 받아서 출력하는
	  코드를 작성하시오(return method 필수)
	 */
	public static void main(String[] args) {
		Box2 bx = new Box2();	//외부 클래스 객체 생성
		int sum = bx.result(1, 5);	//해당 클래스에 두 인자값 전달 및 return으로 확인
		if(sum==0) {	//결과값이 0일 경우
			System.out.println("두 숫자 중 첫번째 숫자는 낮음 값으로 설정");
		}
		else {	//그 외에 값일 경우
			System.out.println(sum);
		}
	}
}
class Box2{	//같은 package안에 동일한 class는 사용하지 못합니다.
	public int result(int a, int b) {//문자 사용안됨
		int total = 0;
		if(a==0 || b==0 || a > b) {
			total = 0;
		}
		else {
			while(a <= b) {	//반복문으로 해당 범위 만큼 모두 합산
				total += a;
				a++;
			}
		}
		return total;	//최종결과값 return
	}
}