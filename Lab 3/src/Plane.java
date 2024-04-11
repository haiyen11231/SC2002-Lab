import java.util.Arrays;
import java.util.Comparator;

public class Plane {
	private PlaneSeat[] seat = new PlaneSeat[12];
	private int numEmptySeat = 12;
	public Plane() {
		for (int i = 0; i < 12; i++) {
			this.seat[i] = new PlaneSeat(i);
		}
	}
	
	private PlaneSeat[] sortSeats() {
		PlaneSeat[] sortedSeats = Arrays.copyOf(this.seat, this.seat.length);
		Arrays.sort(sortedSeats, Comparator.comparingInt(PlaneSeat::getCustomerId));
	    return sortedSeats;
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are " + numEmptySeat + " empty seats.");
		System.out.println();
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty: ");
		for (PlaneSeat s : seat) {
			if (!s.isOccupied()) {
				System.out.println("SeatID " + s.getSeatId());
			}
		}
		System.out.println();
	}
	
	public void showAssignedSeats(boolean bySeatId) {
//		PlaneSeat[] seats = this.seat;
//		if (!bySeatId) {
//			seats = this.sortSeats();
//		} 
//		
//		PlaneSeat[] assignedSeats = (PlaneSeat[]) Arrays.stream(seats).filter(s -> s.isOccupied()).toArray();
//		System.out.println("The seat assignments are as follow: ");
//		for (PlaneSeat seat : seats) {
//			System.out.println("SeatID " + seat.getSeatId() + " assigned to CustomerID " + seat.getCustomerId());
//		}
//		System.out.println();
		
		if (bySeatId) {
            System.out.println("The list of assigned seats: ");
            for (PlaneSeat s : seat) {
                if (s.isOccupied()) {
                	System.out.println("SeatId: " + s.getSeatId() + ", CustomerID: " + s.getCustomerId());
                }
            }
        } else {
            System.out.println("The list of assigned seats: ");
            PlaneSeat[] sortedSeats = sortSeats();
            for (PlaneSeat s : sortedSeats) {
            	if (s.isOccupied()) {
                	System.out.println("SeatId: " + s.getSeatId() + ", CustomerID: " + s.getCustomerId());
                }
            }
        }
		System.out.println();
	}
	
	public void assignSeat(int seatId, int cust_id) {
		if (seat[seatId - 1].isOccupied()) {
			System.out.println("Seat already assigned to a customer.");
		} else {
			seat[seatId - 1].assign(cust_id);
			numEmptySeat--;
			System.out.println("Seat Assigned!");
		}
		System.out.println();
	}
	
	public void unAssignSeat(int seatId) {
		if (!seat[seatId - 1].isOccupied()) {
			System.out.println("This seat is empty.");
		} else {
			seat[seatId - 1].unAssign();
			numEmptySeat++;
			System.out.println("Seat Unassigned!");
		}
		System.out.println();
	}
}
