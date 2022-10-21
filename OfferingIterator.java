public class OfferingIterator {
	private Offering[] offering;
	private OfferingList offeringList;
	int idx=0;
	public boolean hasNext() {
		return idx<offering.length;
	}

if(this.hasNext())
	
	public Offering Next() {
		if(this.hasNext())
			return offering[idx+1];
		return null;
	}

	public void MoveToHead() {
		idx=0;

	}

	public void Remove() {

	}


}
