import java.io.*;
public class ProduceProductMenu implements ProductMenu {

	public ProduceProductMenu(){
	}
	public void showMenu()  {
		try{
		File file = new File("A:/SER 515/assignptbs/ProductInfo.txt");
		BufferedReader input = new BufferedReader(new FileReader(file));
		String value;
		
		while ((value = input.readLine()) != null){
			String[] item = value.split(":");
			String producttype= item[0];
			String product=item[1];
			if(producttype.equals("Produce"))
				System.out.println("Produce:" + product);
		}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
