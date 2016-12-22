package vending_machine;

public class DispenseState implements VendingMachineState{

	Context vm;
	
	
	public DispenseState(Context vm) {
		// TODO Auto-generated constructor stub
		this.vm = vm;
	}

	@Override
	public void insertCoin(double cash) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectProduct(int itemCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispenseProduct(int productNo) {
		// TODO Auto-generated method stub
		System.out.println("PLease collect "+productNo+" at the dispenser");
		vm.setVendingMachineState(vm.getinsertCoinState());
	}

	@Override
	public void returnCash(double cash) {
		// TODO Auto-generated method stub
		
	}

	
}
