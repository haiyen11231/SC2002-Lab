
public class PlaneSeat {
	private int seatId;
	private boolean assigned;
	private int customerId;
	
	public PlaneSeat(int seat_id) {
		this.seatId = seat_id;
		this.assigned = false;
		this.customerId = -1;
	}
	
	public int getSeatId() {
		return seatId + 1;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public boolean isOccupied() {
		return assigned;
	}
	
	public void assign(int cust_id) {
		this.assigned = true;
		this.customerId = cust_id;
	}
	
	public void unAssign() {
		this.assigned = false;
		this.customerId = -1;
	}

}
