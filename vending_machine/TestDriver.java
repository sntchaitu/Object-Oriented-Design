package vending_machine;

import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context vm = new Context();
		Scanner s1 = new Scanner(System.in);
		while(true)
		{
			System.out.println("Menu \n 1 Insert Coint \n 2 Get Money\n 3 Select Product");
			int input = s1.nextInt();
			switch (input) {
			case 1:
				System.out.println("Insert Amount");
				double cash = s1.nextDouble();
				vm.insertCoin(cash);
				break;
			case 2:
				System.out.println("Return  Amount");
				double c = vm.getMachineCash();
				vm.returnCash(c);
				break;
			case 3:
				System.out.println("Enter Item Code");
				int pNo = s1.nextInt();
				vm.selectProduct(pNo);
				break;
			default:
				System.out.println("Invalid command. Please try again.");
				break;
			}
		}
		//s1.close();
	}

}
