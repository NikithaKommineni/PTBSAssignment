public class ProductMenuFactory{
	public ProductMenu createProductMenu(int producttype)
	{
		if(producttype==1){
			MeatProductMenu meatmenu=new MeatProductMenu();
			return meatmenu;
		}
		else{
			ProduceProductMenu producemenu=new ProduceProductMenu();
			return producemenu;
	}
}