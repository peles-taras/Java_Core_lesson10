package ua.lviv.lgs;

public class minimum {
	public static void main(String[] args) {

		String s = "�����";

		if (s.length() == 5 && s.toLowerCase().startsWith("�") && s.toLowerCase().endsWith("�")) {
			System.out.println("����� - ��������");
		} else {
			System.out.println("�������");
		}

		String s2 = "�������";

		System.out.println(s2.replace("�", "-").replace("�", "-"));
	}
}
