package java_chapter3;

//変数を使う
public class Main {
//	public static void main(String[] args) {
//		String str = "Hello world";  //Javaの変数の定義 [変数型(String)] [変数名] ※Javaでの=は代入演算子
//		System.out.println(str);
//	}
	
	//int型の変数を定義
//	public static void main(String[] args) {
//		int num = 5;
//		System.out.println(num);
//	}
	
	//double型の変数を定義
//	public static void main(String[] args) {
//		double num = 5.0;
//		System.out.println(num);
//	}
	
	//boolean型の変数を定義
//	public static void main(String[] args) {
//		boolean b = true;
//		System.out.println(b);
//	}
	
	//String型の配列変数を定義
	public static void main(String[] args) {
		
		String[] strs = {"Apple", "Banana", "Chocolate"}; //データ型の後ろに[]をつけることで配列型を定義できる　値を代入する場合は{}で括る
		System.out.println(strs);
		System.out.println(strs[0]);
		System.out.println(strs[1]);
	}
}