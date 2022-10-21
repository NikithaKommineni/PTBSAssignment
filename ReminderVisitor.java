import java.util.*;
public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	public void visitProduct(ArrayList<Product>  al) {
		System.out.println("Iterator Design Pattern");
		//Iterator it=al.Iterator();
		int idx=0;
		while (idx<al.size()) {
			//Product p=li.next();
			System.out.println((idx+1)+al.get(0).producttype+":"+al.get(1).item);
			idx++;
		}
	}

	public void visitTrading(Trading trading) {

	}

	public void visitFacade(Facade facade) {

	}

}
