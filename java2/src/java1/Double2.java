package java1;

public class Double2 {

	public static void main(String[] args) {
		/*
		 응용문제6.
		 구구단 9단 중 9*64까지 숫자 중 결과값이 홀수에 
		 대한 평균값 결과를 출력 하시오.
		*/
		int a = 1;
		int sum = 0;
		int total = 0;
		int count = 0;
		do {			
			sum = 9 * a;
			if(sum % 2 != 0) {
				count++;
				total += sum;
			}
			a++;
		}while(a <= 64);
		
		System.out.println(total/count);

	}

}
