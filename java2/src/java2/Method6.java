package java2;

public class Method6 {
	//배열 데이터를 이용하여 홀수 값에 대한 총 갯수 받기(응용)
	public static void main(String[] args) {
		mysql m = new mysql();
		String number = m.check("홀수");
		System.out.printf("총 갯수는 %s 입니다.",number);
	}

}
// data내용 15 22 17 14 32 35 19 33
class mysql{
	/* 
	 응용문제3. 협업 프로그래머가 해당 DB(Database)에 값 중
	 홀수값에 대한 총 갯수를 받고자 합니다.
	 해당 갯수를 출력 될 수 있도록 코드를 작성하시오.  
	*/
	private int data[];//배열값이 변경되지 않도록 사용
	
	public String check(String order) {
		int numbers[] = {15,22,17,14,32,35,19,33};
		int count = 0;
		this.data = numbers;
		if(order.equals("홀수")) {
			for(int f : this.data) {
				if(f % 2 != 0) {
					count++;
				}
			}
		}
		return String.valueOf(count);
	}
	
}