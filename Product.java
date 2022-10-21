public class Product {
	public void addProduct(String producttype,String productname) throws IOException {
             File file = new File("A:/SER 515/assignptbs/ProductInfo.txt");
             if(!file.exists()) {
                 file.createNewFile();
             }

             FileWriter filewriter = new FileWriter(file.getName(),true);
             BufferedWriter output = new BufferedWriter(filewriter);
             output.write(producttype+":"+productname);
             output.close();
             
         }
}
