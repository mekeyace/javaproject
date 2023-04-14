package java1;

public class Array12 {

	public static void main(String[] args) {
		 /*
		 응용문제8.
		 데이터 배열에 있는 모든 짝수값에 합산 결과를 출력하시오.
		 단, 해당 배열은 2차 배열 형태 입니다. 
		  
		 1번 데이터 : 11 42 22 16
		 2번 데이터 : 7 33 10 29
		 최종결과값 : 90
		 */
		int data[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int ea = data.length;	//배열 그룹(2)
		int ea2 = data[0].length;	//배열 데이터 갯수(4)
		int w = 0;
		int sum = 0;
		do {
			int ww = 0;
			do {
				if(data[w][ww] % 2 == 0) {
					sum += data[w][ww];
				}
				ww++;
			}while(ww < ea2);
			
			w++;
		}while(w < ea);
		System.out.println("최종합계:"+sum);
		

	}

}
