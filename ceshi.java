package shuzu;

import java.util.Scanner;

public class ceshi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = {1,2,3,4,5,6,0,0,0,0,0};
		System.out.print("--ÊäÈëÒªÉ¾³ıµÄ±àºÅ£º");
		int dnu = sc.nextInt();
		int i = 0;
		while (num[i] != dnu) {
			i++;
		}
		for(int j = i;j<num.length-2;j++) {
			num[j] = num[j+1];
			if(num[j] == 0)
				break;
		}
		for(int a:num)
			System.out.print(a+"\t");
		
	}

}
