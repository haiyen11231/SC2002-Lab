package part1;

import java.util.Objects;

public class SalePerson implements Comparable<SalePerson> {
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getTotalSales() {
		return totalSales;
	}
	
	public int compareTo(SalePerson p) {
		if (totalSales < p.totalSales) return -1;
		else if (totalSales > p.totalSales) return 1;
		else {
			if (lastName.compareTo(p.lastName) < 0) return 1;
			else return -1;

		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		SalePerson other = (SalePerson) o;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return lastName + ", " + firstName + ": " + totalSales;
	}
}
