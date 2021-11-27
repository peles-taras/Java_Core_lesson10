package ua.lviv.lgs;

public class minimum {
	public static void main(String[] args) {

		String s = "Пилип";

		if (s.length() == 5 && s.toLowerCase().startsWith("п") && s.toLowerCase().endsWith("п")) {
			System.out.println("Слово - паліндром");
		} else {
			System.out.println("Помилка");
		}

		String s2 = "Голосна";

		System.out.println(s2.replace("о", "-").replace("а", "-"));
	}
}
