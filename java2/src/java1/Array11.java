package java1;

import java.util.Arrays;

public class Array11 {
	//2차배열 응용편
	public static void main(String[] args) {
		/*
		  응용문제7.
		  Adata와 Bdata 두가지 배열값을 더한 후 
		  해당 배열값을 기준으로 짝수, 홀수인지를 나열하는
		  배열 결과 출력 코드를 작성하시오.
		  
		  Adata[0] = 5 17 19 22 33
		  Adata[1] = 1 2 3 4 5
		  Result = ["짝수","홀수","짝수","짝수","짝수]
		 */
		 int adata[][] = {
				 {5,17,19,22,33},
				 {1,2,3,4,5}
		 };
		 int ea = adata[0].length;	//배열 그룹에 있는 데이터 객체 수(5)
		 int w=0;
		 String result[] = new String[ea];
		 while(w < ea) {
			 int total = adata[0][w] + adata[1][w]; 
			 if(total % 2 == 0) {
				 result[w] = "짝수";
			 }
			 else {
				 result[w] = "홀수";
			 }						 
			 w++;
		}
		 System.out.println(Arrays.toString(result));
	}

}
