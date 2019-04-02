package shuzu;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	int i;
	String []a = {"~","@","#","$","%","^","&","*","A","B"};
	String []b = new String[100];
	for (i=0;i<100;i++) {
		b[i] = a[(int)(Math.random()*10)];
		if (i%9 == 0)
			b[i] = "*";
	}
	for (int x=0;x<100;x++) {
		System.out.print(x+" "+b[x]+"\t");
		if ((x+1)%10 == 0)
			System.out.println();
	}
	System.out.println("心中所想一个数字，用这个（数字-（各位+十位））结果对应的符号！例如：77-（7+7）=63");
	System.out.println("灵不灵呢，请稍候……");
	System.out.print("是否显示结果（yes/no）:");
	Scanner sc  = new Scanner(System.in);
	String result = sc.next();
	if (result.equals("yes"));
	System.out.println("哈哈，你想的是不是'*'啊！");
	}
}
