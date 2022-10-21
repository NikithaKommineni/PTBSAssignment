import java.io.*;
public class Product {
	String producttype;
	String item;
	public Product(){}
	public Product(String pt,String item){
		this.producttype=pt;
		this.item=item;
	}
	public void addProduct(String producttype,String productname)  {
		try{
             File file = new File("A:/SER 515/assignptbs/ProductInfo.txt");
             if(!file.exists()) {
                 file.createNewFile();
             }

             FileWriter filewriter = new FileWriter(file.getName(),true);
             BufferedWriter output = new BufferedWriter(filewriter);
             output.write(producttype+":"+productname);
             output.close();
		} 
		catch(IOException e){
			e.printStackTrace();
		}
         }
}
