public class OfferingList {
	private Offering[] offeringlist;
	public OfferingList() {	
	}
	
	public ListIterator listIterator() {
		return new OfferingIterator();
	}
}
