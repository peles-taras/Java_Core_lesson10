package ua.lviv.lgs;

import java.util.Arrays;

public class maximum {
	public static void main(String[] args) {

		// TASK 1
		String s2 = "������ ������� ���";

		System.out.println("ʳ������ ���: " + s2.split(" ").length);
		System.out.println("");

		// TASK 2
		String[] m = "word1 word2 word3 word2".split(" ");
		Arrays.sort(m);

		String maxWord = "", word = "";
		int maxCount = 0, count = 1;

		for (String s : m) {
			if (s.equals(word)) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					maxWord = word;
				}
				word = s;
				count = 1;
			}
		}

		if (count > maxCount) {
			maxCount = count;
			maxWord = word;
		}

		System.out.println("�������� ������������ �����: " + maxWord + " (����������� " + maxCount + " ����)");

	}
}
