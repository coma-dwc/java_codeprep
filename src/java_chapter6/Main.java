package java_chapter6;

//条件分岐を使う

//if文を使う
public class Main {
//	public static void main(String[] args) throws Exception {
//		int num = 25;
//		if(num % 5 == 0) {
//			System.out.println("numは5で割り切れます");
//		}
//	}
	
	//if文でelseを使う
//	public static void main(String[] args) {
//		int num = 22;
//		if(num % 5 == 0) {
//			System.out.println("numは5で割り切れます");
//		} else {
//			System.out.println("numは5で割り切れません");
//		}
//	}
	
	//if文でelse ifを使う
//	public static void main(String[] args) {
//		int num = 21;
//		if(num % 5 == 0) {
//			System.out.println("numは5で割り切れます");
//		} else if (num % 3 == 0) {
//			System.out.println("numは3で割り切れます");
//		} else {
//			System.out.println("numは5でも3でも割り切れません");
//		}
//	}
	
	//三項演算子を使う
	public static void main(String[] args) {
		int num = 21;
		String msg = num % 5 == 0 ? "numは5で割り切れます" : "numは5では割り切れません";
		System.out.println(msg);
	}
	//[条件式] ? [trueの場合の返り値] : [falseの場合の返り値]
	
	//上の処理をif文で書き換えた場合
//	int num = 21;
//	String msg;
//	if(num % 5 == 0) {
//		msg = "numは5で割り切れます";
//	} else {
//		msg = "numは5で割り切れません";
//	}
//	System.out.println(msg);
//	
//	}
}