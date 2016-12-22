package vending_machine;

public interface VendingMachineState {

	public void insertCoin(double cash);
	public void selectProduct(int itemCode);
	public void dispenseProduct(int productNo);
	public void returnCash(double cash);
	//public boolean exit(double cash);
}
