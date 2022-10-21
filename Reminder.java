import java.io.*;
import java.util.*;
public class Reminder {
	public Reminder(ArrayList list){
		display(list);
	}
	ReminderVisitor revisitor=new ReminderVisitor();
	public void display(ArrayList list) {
		revisitor.visitProduct(list);
		}
}
