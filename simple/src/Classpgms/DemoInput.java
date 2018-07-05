package simple;

import java.io.*;

public class DemoInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj);

		System.out.println("please enter the emp id");
		int n = Integer.parseInt(br.readLine());

		System.out.println("please enter the name");
		String str = br.readLine();

		System.out.println("employee M/F");
		int ch = br.read();
		br.skip(2);
		// String mf=br.readLine();

		System.out.println("Employee or not");
		boolean x = Boolean.parseBoolean(br.readLine());

		System.out.println("emp id " + n);
		System.out.println("emp name is " + str);
		System.out.println("male or female " + ch);
		System.out.println("employee or not " + x);
	}

}
