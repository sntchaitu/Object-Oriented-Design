package vending_machine;

public class InsertCoinState implements VendingMachineState{

	Context vm;
	
	InsertCoinState(Context vm)
	{
		this.vm = vm;
	}
	
	@Override
	public void insertCoin(double cash) {
		// TODO Auto-generated method stub
		vm.setMachineCash(vm.getMachineCash()+cash);
		
		System.out.println("Inserted cash"+vm.getMachineCash());
		
		vm.setVendingMachineState(vm.getselectItemState());
		
	}

	@Override
	public void selectProduct(int itemCode) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("You have not inserted any cash.");
	}

	@Override
	public void dispenseProduct(int productNo) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("You have not inserted any cash.");
	}

	@Override
	public void returnCash(double cash) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("You have not inserted any cash.");
	}

	//@Override
//	public boolean exit(double cash) {
//		// TODO Auto-generated method stub
//		//vm.setVendingMachineState(vm.getexitState());
//		//vm.getVendingMachineState().exit(cash);
//		return false;
//	}

}
