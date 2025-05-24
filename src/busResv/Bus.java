package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no, boolean ac, int cap){ //bus no. , ac or not, capacity
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public int getCapacity() { //accessor
		return capacity;
	}
	
	public void setBusNo(int no) {
		busNo = no;
	}
	
	public void setIsAc(boolean ac) {
		ac = ac;
	}
	
	public void setCapacity(int cap) { //mutator
		capacity = cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No:" + busNo + " AC:" + ac + " Total Capacity:" + capacity );
	}
}
