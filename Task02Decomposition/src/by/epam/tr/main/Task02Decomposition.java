package by.epam.tr.main;

public class Task02Decomposition {

	public static void main(String[] args) {
		task30();
		task15();
	}

	public static void task30() {
		// 30. Дана строка. Вставить после каждого символа пробел.

		String s1 = "Hello,world!";

		method(s1);
	}

	public static void method(String s1) {
		String s2 = s1.replace("", " ");

		method1(s2);
	}

	public static void method1(String s2) {
		System.out.println("\"" + s2 + "\"");
	}

	public static void task15() {
		// 15. Удалить в строке все цифры.

		String str = "12ab3c9d456ef5g";
		char[] mas = str.toCharArray();

		method2(str, mas);

	}

	public static void method2(String str, char[] mas) {
		String s = "";
		for (int i = 0; i < mas.length; i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				mas[i] = 0;
			}
			s += mas[i];
		}
		method4(s);
	}

	public static void method4(String s) {
		System.out.println("\"" + s + "\"");
	}
}
