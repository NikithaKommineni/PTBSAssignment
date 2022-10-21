import java.io.*;
import java.util.*;
public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;
	
	public Facade(){
		System.out.println("Facade is implemented");
		System.out.println("Welcome to PTBS System...");
		System.out.println("Enter 0 to login as Buyer");
		System.out.println("Enter 1 to login as Seller");
		Scanner sc=new Scanner(System.in);
		UserType=sc.nextInt();
		System.out.println("Enter Login Credentials");
		String username,password;
		System.out.println("Enter Username");
		username=sc.next();
		System.out.println("Enter password");
		password=sc.next();
		boolean isvalidUser=login(username,password,UserType);
		if(isvalidUser)
		{
			
			System.out.println("Logged In Successfully..");
			
			ArrayList<Product> buyerlist=new ArrayList<Product>();
			ArrayList<Product> sellerlist=new ArrayList<Product>();
			if(UserType==0){//Buyer
			System.out.println("Enter 1 to view Meat Products ");
				System.out.println("Enter 2 to view Produce Products ");
				int producttype=sc.nextInt();
			
			while(producttype==1||producttype==2){
				
				
				 if(producttype==1) {
					MeatProductMenu productmenu=new MeatProductMenu();
					productmenu.showMenu();
					System.out.println("Enter name of product u want to buy");
					String item=sc.next();
					Product p=new Product("meat",item);
					buyerlist.add(p);
				}
				else {
					ProduceProductMenu productmenu=new ProduceProductMenu();
					productmenu.showMenu();
					System.out.println("Enter name of product u want to buy");
					String item=sc.next();
					Product p=new Product("produce",item);
					buyerlist.add(p);
				}
				System.out.println("Enter 1 to view Meat Products ");
				System.out.println("Enter 2 to view Produce Products ");
				 producttype=sc.nextInt();
			}
			System.out.println("Visitor pattern");
			Reminder rem=new Reminder(buyerlist);
				
				//Factory design pattern is implemented
				//ProductMenuFactory menufactory=new ProductMenuFactory();
				//ProductMenu menu=menufactory.createProductMenu(producttype);
				//menu.showMenu();
				
			}
			else if(UserType==1){//Seller
				System.out.println("Enter the type of product to be added \n 1. Meat\t 2.Produce");
				int addproducttype=sc.nextInt();
				while(addproducttype==1||addproducttype==2){
				String producttype;
				if(addproducttype==1)
					producttype="Meat";
				else
					producttype="Product";
				System.out.println("Enter the product name:");
				String productname=sc.next();
				Product product=new Product(producttype,productname);
				sellerlist.add(product);
				product.addProduct(producttype,productname);
				System.out.println("Enter the type of product to be added \n 1. Meat\t 2.Produce");
				 addproducttype=sc.nextInt();
				}
				
				Reminder rem=new Reminder(sellerlist);
				//Reminder.display(sellerlist);
			}
			
		}
		else{
			System.out.println("Invalid Credentials");
		}
		
	}
	public boolean login(String username,String password,int usertype) {
		String filepath="";
		if(usertype==0)
			filepath="A:/SER 515/assignptbs/BuyerInfo.txt";
		else
			filepath="A:/SER 515/assignptbs/SellerInfo.txt";
		try{
					File file=new File(filepath);//Reading credetials from the file
					Scanner sc=new Scanner(file);
					while(sc.hasNextLine())
					{
						String credentials[]= sc.next().split(":");	
						if(credentials[0].equals(username)&&credentials[1].equals(password)) 
								return true;
					}
					}
					catch (FileNotFoundException e) 
					{
						e.printStackTrace();
					}
					return false;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
