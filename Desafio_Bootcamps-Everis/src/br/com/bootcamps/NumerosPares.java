package br.com.bootcamps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosPares {

	public static void main(String[] args) throws IOException {
		String open;
		BufferedReader ref = new BufferedReader(new InputStreamReader(System.in));
		open = ref.readLine();
		for (int i = 2; i <= Integer.parseInt(open); i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
