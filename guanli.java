package shuzu;

import java.util.Scanner;

public class guanli {

	public static void main(String[] args) {
		int [] num = new int[100];
		String [] name = new String[100];
		int [] score = new int[100];
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t学员成绩管理");
		System.out.println("--------------------------------------------");
		System.out.println("1.添加； 2.修改； 3.删除； 4.查询； 5.不及格人数统计； 6.退出");
		System.out.println("--------------------------------------------");
		do {
			System.out.print("--输入选择：");
			x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.print("--录入编号：");
				int nu = sc.nextInt();
				System.out.print("--录入名字：");
				String na = sc.next();
				System.out.print("--录入成绩：");
				int sco = sc.nextInt();
				int i = 0;
				while (num[i] != 0)
					i++;
				num[i] = nu;
				name[i] = na;
				score[i] = sco;
				break;
			case 2:
				System.out.print("输入要修改的编号：");
				int rnu = sc.nextInt();
				i = 0;
				while (num[i] != rnu) {
					i++;
				}
				System.out.print("--录入新的成绩：");
				int rsc = sc.nextInt();
				score[i] = rsc;
				break;
			case 3:
				System.out.print("--输入要删除的编号：");
				int dnu = sc.nextInt();
				i = 0;
				while (num[i] != dnu) {
					i++;
				}
				for(int j = i;j<num.length-2;j++) {
					num[j] = num[j+1];
					name[j] = name[j+1];
					score[j] = score[j+1];
					if(num[j] == 0)
						break;
				}
				break;
			case 4:
				int n = 0;
				if(num[0] ==0)
					System.out.println("无学员信息！");
				else {
					System.out.println("学员编号\t学员姓名\t学员成绩");
					while (num[n] !=0) {
					System.out.println(num[n]+"\t"+name[n]+"\t"+score[n]);
					n++;
					}
				}
				break;
			case 5:
				i = 0;
				int sum = 0;
				System.out.println("******不及格学员名单*****");
				System.out.println("学员编号\t学员姓名\t学员成绩");
				while (num[i] != 0)
					i++;
				for(int j=0;j<i;j++) {
					if(score[j]<60) {
						System.out.println(num[j]+"\t"+name[j]+"\t"+score[j]);
						sum+=1;
					}
				}
				System.out.println("不及格人数为"+sum+"人");	
				break;
			case 6:
				sc.close();
			}
		}
		while(x != 6);
	}
}