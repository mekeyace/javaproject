package java1;

public class index4 {

	public static void main(String[] args) {
		//반복문 사용(for문)
		int f;
		for(f=1; f<=10; f++) {
			//System.out.println(f);
		}
		
		//더블for문
		int a,b;
		for(a=2;a<10;a++) {
			for(b=1;b<10;b++) {
				//System.out.printf("%d*%d=%d\n",a,b,(a*b));				
			}
		}
		
		/*
		 응용문제2.
		 숫자 45 ~ 60까지 총 합산한 결과값을 출력하시오.
		 */
		int aa;
		int sum = 0;
		for(aa=45; aa<=60; aa++) {
			sum += aa;
		}
		//System.out.println(sum);
		
		/*
		  응용문제3
		  1~200까지 숫자 중 홀수값만 모두 더한 결과값을
		  출력하시오.
		*/
		/*
		 응용문제4
		 20~60까지 숫자 중 3의 배수 값만 모두 더한 후 짝수 인지
		 홀수 인지를 출력하시오
		*/
		int ff;
		int sum2 = 0;
		
		for(ff=20;ff<=60;ff++) {
			if(ff % 3 == 0) {
				sum2 += ff;
			}
		}
		
		if(sum2 % 2 == 0) {
			//System.out.println("짝수 입니다.");
		}
		else {
			//System.out.println("홀수 입니다.");
		}
		
		/* 
		 응용문제5
		 구구단 7단 ~ 3단까지 역순으로 출력되도록 하시오.
		 단, 그 중 결과값이 홀수인 값만 출력 됩니다.		  
		*/
		
		
	}

}
