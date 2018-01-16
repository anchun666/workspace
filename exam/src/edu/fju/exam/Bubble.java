package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		int number[]={42,55,67,21};
		int m,n;
		for(m=0;m<number.length-1;m++){
		for(n=0;n<number.length-1;n++){
			if(number[n]<number[n+1]){
				int tmp = number[n];
				number[n]=number[n+1];
				number[n+1]=tmp;
			}
		}
				}
		for (m=0;m<number.length;m++){
			System.out.print(number[m]+" ");
		}
			}
}
		
		
	


