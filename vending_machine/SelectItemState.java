package vending_machine;

public class SelectItemState implements VendingMachineState {

	Context vm;
	
	SelectItemState(Context vm)
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
		if(vm.getItems().get(itemCode)>0)
		{
			System.out.println();
			vm.updateItemCount(itemCode);
			vm.getVendingMachineState().returnCash(vm.getMachineCash()-1.0);
			//System.out.println("remaining balance is: "+(vm.getMachineCash()-1.0));
			//set state to dispensingstate
			vm.setVendingMachineState(vm.getdispenseState());
			vm.getVendingMachineState().dispenseProduct(itemCode);
		}
		else
		{
			System.out.println("Current Item Out Of Stock");
			vm.setVendingMachineState(vm.getselectItemState());
		}
	}

	@Override
	public void dispenseProduct(int productNo) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void returnCash(double cash) {
		// TODO Auto-generated method stub
		System.out.println();
		
		System.out.printf("Amount returned: $%.2f\n", cash);
		
		vm.setMachineCash(0.0);
		System.out.println();
		
		vm.setVendingMachineState(vm.getinsertCoinState());
	}

	


}
