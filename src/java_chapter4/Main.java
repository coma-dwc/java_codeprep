package java_chapter4;

//変数と数値を使って計算
public class Main {
//	public static void main(String[] args) {
//		int a = 8;
//		int b = a + 5;
//		System.out.println(b);
//	}
	
//	public static void main(String[] args) {
//		int a = 8;
//		int b = 3;
//		int c = a * b;
//		System.out.println(c);
//	}
	
	//変数に再代入する
//	public static void main(String[] args) {
//		int a = 8;
//		int b = 3;
//		a = a - b;
//		System.out.println(a);
//	}
	
	//計算と代入を同時に行う
//	public static void main(String[] args) {
//		int a = 5;
//		int b = 5;
//		int c = 5;
//		int d = 5;
//		int e = 5;
//		
//		a += 2;  //四則演算と代入を同時に行うには後ろに=を付ける
//		b -= 2;
//		c *= 2;
//		d /= 2;
//		e %= 2;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		
//	}
	
	//インクリメント演算子(++)を使う
//	public static void main(String[] args) {
//		int a = 5;
//		System.out.println(a);
//		System.out.println(++a);  //++[変数] 前置記法 変数に1を足し、返り値は加算を行った結果の値になる
//		System.out.println(a++);  //[変数]++ 後置記法 変数に1を足すが、返り値は加算を行う前の値になる
//		System.out.println(a);
//	}
	
	//デクリメント演算子(--)を使う
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);
		System.out.println(--a);  //--[変数] 前置記法 変数から1を引くが、返り値は減算を行う前の値になる
		System.out.println(a--);  //[変数]-- 後置記法 変数から1を引き、返り値は減算を行った結果の値になる
		System.out.println(a);
	}
}