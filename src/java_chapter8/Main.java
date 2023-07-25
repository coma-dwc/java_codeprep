package java_chapter8;

//メソッドを定義する

//FizzBuzz!
//1から20までの数字に対して以下のルールで結果を出力するプログラムを作成
//・数値が3で割り切れる場合はFizzを出力
//・数値が5で割り切れる場合はBuzzを出力
//・数値が3でも5でも割り切れる場合はFizzBuzzを出力する
public class Main {
//	public static void main(String[] args) {
//		for(int i = 1; i <= 20; i++) {
//			if(i % 3 == 0 && i % 5 == 0) {
//				System.out.println("FizzBuzz");
//			} else if(i % 5== 0) {
//				System.out.println("Buzz");
//			} else if(i % 3 == 0) {
//				System.out.println("Fizz");
//			} else {
//				System.out.println(i);
//			}
//		}
//	}
	
	
	//fizzbuzzメソッドを定義する
//	private static void fizzbuzz(int num) {
//		if(num % 3 == 0 && num % 5 == 0) {
//			System.out.println("FizzBuzz");
//		} else if (num % 5 == 0) {
//			System.out.println("Buzz");
//		} else if (num % 3 == 0) {
//			System.out.println("Fizz");
//		} else {
//			System.out.println(num);
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		for (int i = 1; i <= 20; i++) {
//		}
//	}
	
	//メソッド定義の形式
	//[修飾子] [返り値の型] メソッド名([引数])
	//・private：メソッドが含まれるクラスからのみアクセス可能
	//・protected：メソッドが含まれるクラス、あるいはそのサブクラス または同一パッケージ内のクラスからのみアクセス可能
	//・public：全ての場所からアクセス可能
	//・アクセス修飾子なし：同一パッケージ内のクラスからのみアクセス可能
	
	//返り値がないメソッドを定義する場合の返り値の型はvoidになる
	//private static void fizzbuzz(int num) {
	
	
	
	//fizzbuzzメソッドを実行する
	//forループの中からfizzbuzzメソッドを実行する
//	private static void fizzbuzz(int num) {
//		if(num % 3 == 0 && num % 5 == 0) {
//			System.out.println("FizzBuzz");
//		} else if (num % 5 == 0) {
//			System.out.println("Buzz");
//		} else if (num % 3 == 0) {
//			System.out.println("Fizz");
//		} else {
//			System.out.println(num);
//		}
//	}
//	
//	public static void main(String[] args) {
//		for(int i = 1; i <= 20; i++) {
//			fizzbuzz(i);
//		}
//	}
	//メソッドの実行
	//メソッド名([引数])
	
	
	//fizzbuzzメソッドを改良する
	private static String fizzbuzz(int num) {
		if(num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else if (num % 5 == 0) {
			return "Buzz";
		} else if (num % 3 == 0) {
			return "Fizz";
		} else {
			return Integer.toString(num);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			System.out.println(fizzbuzz(i));
		}
	}
	
	//値を返すメソッドではreturnを使って値を返す
	//returnが実行されるとその時点でメソッドを抜けるのでそれ以降の処理は実行されない
	//Integer.toStringはint型の変数をString型に変換するためのメソッド
}