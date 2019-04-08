package jankenTest;

import java.util.Scanner;

public class Jankengeme {

	public static void main(String[] args) {

		int playerHand;
	    int cpuHand;
	    Scanner sc = new Scanner(System.in);
	    String rpfHands[] = {"グー","チョキ","パー"};
	    int replay;
	    int replay2=1;

	 try {
	    do{


	    //プレイヤー側の処理

	    System.out.println("数字を入力してください。0：グー、1：チョキ、2：パー");
	    playerHand = sc.nextInt(); //標準入力で数字を入力させる
	    System.out.println("あなたの出した手は" + rpfHands[playerHand]); //プレイヤーの手出力

	    //コンピュータ側の処理

	     cpuHand = (int)(Math.random()*3); //ランダムメソッドでコンピュータの出す手を決める
	     System.out.println("コンピュータの出した手は" + rpfHands[cpuHand]); //コンピュータの手出力

	     //判定

	     Result result1 = new Result();
	     result1.result(cpuHand,playerHand);

	     System.out.println("もう一度やりますか？ 0：はい 1：いいえ");

	     replay = sc.nextInt();



	    }while(replay!=replay2);

	 		} catch( java.lang.ArrayIndexOutOfBoundsException e) {

	 			System.err.println("エラー" + e.getMessage());

	 			} finally {

	 					System.out.println("終了します");
	 				}

	 					sc.close();


	}

}
