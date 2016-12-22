package vending_machine;

import java.util.*;

//here context  is the vending Machine
public class Context {
	
	private VendingMachineState insertCoinState;
	private VendingMachineState selectItemState;
	private VendingMachineState dispenseState;
	private VendingMachineState exitState;
	
	
	private VendingMachineState currentState;
	private double machineCash;
	private ArrayList<Integer> items = new ArrayList<Integer>();
	
	public ArrayList<Integer> getItems() {
		return items;
	}
	public void updateItemCount(int index)
	{
		int value = this.items.get(index) -1;
		this.items.set(index, value);
	}
//	public void setItems(ArrayList<Integer> items) {
//		this.items = items;
//	}

	public Context()
	{
		insertCoinState  = new InsertCoinState(this);
		selectItemState  = new SelectItemState(this);
		dispenseState 	 = new DispenseState(this);
		
		
		//set the vending machine to statrting state
		//items index are codes for selecting items and its values is the stock quantiy of that item
		for(int i=0;i<10;i++)
		{
			items.add(10);
		}
		
		currentState = insertCoinState;
		
	}
	
	public void setVendingMachineState(VendingMachineState newState){
		currentState = newState;
	}
	public VendingMachineState getVendingMachineState(){
		return currentState;
	}
	
	public void setMachineCash(double newAmount){
		machineCash = newAmount;
	}
	
	public double getMachineCash(){
		 return this.machineCash;
	}
	
	public VendingMachineState getinsertCoinState(){
		return insertCoinState;
	}
	
	
	public VendingMachineState getselectItemState(){
		return selectItemState;
	}
	
	
	public VendingMachineState getdispenseState(){
		return dispenseState;
	}
	
	
	public VendingMachineState getexitState(){
		return exitState;
	}
	
//	public void insertCoin(double cash);
//	public void selectProduct(int itemCode);
//	public void dispenseProduct();
//	public void returnCash();
//	public void exit();
	
	public void insertCoin(double cash)
	{
		currentState.insertCoin(cash);
	}
	
	public void selectProduct(int productNo)
	{
		currentState.selectProduct(productNo);
	}
	public void dispenseProduct(int productNo)
	{
		currentState.dispenseProduct(productNo);
	}
	public void returnCash(double cash)
	{
		currentState.returnCash(cash);
	}
	
}
