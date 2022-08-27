package Portforio;

import java.util.Date;

public class Main {

	static Date now = new Date();

	public static void main(String[]args) {
		//名前とパスワードが一致するまで無限ループ
		while(true) {
			System.out.println("名前とパスワードを入力してください");
			System.out.println("名前>");
			String name = new java.util.Scanner(System.in).nextLine();
			System.out.println("パスワード>");
			String password = new java.util.Scanner(System.in).nextLine();
			if(name.equals("world") && password.equals("123456")) {
				break;
			}
			System.out.println("名前もしくはパスワード、あるいは両方が間違っています。");
		}
		System.out.println("ログインしました。");
		//入出金の入力が不正だった時再入力
		while(true) {
			System.out.println("入金は1、出金は2を入力(半角数字で入力)>");
			int number = new java.util.Scanner(System.in).nextInt();
			//入出金額を入力したら日付とともに告知
			if(number ==1) {
				System.out.println("入金額を入力してください");
				int payment = new java.util.Scanner(System.in).nextInt();
				System.out.println(now+"に"+payment+"円入金しました");
			}else if(number == 2) {
				System.out.println("出金額を入力してください");
				int withdrawal = new java.util.Scanner(System.in).nextInt();
				System.out.println(now+"に"+withdrawal+"円出金しました");
			}else{
				System.out.println("入力が不正です");
			}


		}
	}
}