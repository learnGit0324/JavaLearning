package com.adam.Set;

import java.util.HashSet;
import java.util.Scanner;

public class SetTest {
	public static void main(String[] args) {
		// Console console = System.console();
		// String input = console.readLine();

		Scanner scan = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		int i = 1;
		while (i != 20) {
			String input = scan.nextLine();
			hs.add(input);
			i++;
		}
		System.out.println(hs);
	}
}
