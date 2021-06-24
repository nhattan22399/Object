package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap thong tin: ");
		Object ten =sc.next();
		Object tuoi =sc.nextInt();
		Object diem =sc.nextDouble();
		System.out.println("Ten "+ten+" Tuoi "+tuoi+" diem "+diem);
	}

}
