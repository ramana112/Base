package simple;

import java.io.*;

public class inputpgm {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter no 1");
		int n1 = Integer.parseInt(br.readLine());

		System.out.println("enter no 2");
		int n2 = Integer.parseInt(br.readLine());

		int n = n1 + n2;
		System.out.println("n1+n2 = " + n);
		System.out.println("n1*n2 = " + n1 * n2);
		System.out.println("n1-n2 = " + (n1 - n2));
		System.out.println("n1/n2 = " + n1 / n2);
		System.out.println("n1%n2 = " + n1 % n2);

	}

}
