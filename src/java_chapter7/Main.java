package java_chapter7;

public class Main {
	//繰り返し処理を行う
	
	//for文を使った繰り返し
	//for文を使って0から9までの10個の数字を出力する
//	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//	}
	//for ([初期化式]; [条件式]; [変化式]) {
		//処理内容
	//}
	
	//for文を使った繰り返し(2)
	//先のプログラムを改良して、0,2,4,8と偶数のみが出力されるようにする
//	public static void main(String[] args) {
//		for(int i = 0; i < 10; i += 2) {
//			System.out.println(i);
//		}
//	}
	//変化式をi += 2 として、iが2ずつ加算されるようにしている
	
	//while文を使った繰り返し
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i += 2;
		}
	}
	//while文は条件式がtrueの間だけ処理を繰り返す文
	//while (条件式) {
		//処理内容
	//}
	
	//※forとwhileの使い分けの目安
	//for文：一定回数の繰り返し
	//while文：条件式が複数の条件の組み合わせで複雑になる場合
}