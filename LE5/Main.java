abstract class Beverage{
	private void pour(int qty){
		System.out.println("Add" + qty + "ml of beverages");
	}
	protected abstract void addCondiment();
	void stir(){}
	private void serve(){
		System.out.println("Serve through waiter");
	}
	public final void templateMethod(int qty){
		pour(qty);
		addCondiment();
		stir();
		serve();
	}
}

class Whiskey extends Beverage{
	protected void addCondiment(){
		System.out.println("Add Ice");
	}
	protected void stir(){
		System.out.println("Stir for 27 seconds");
	}
}

class Rum extends Beverage{
	protected void addCondiment(){
		System.out.println("Add one-thirds of water");
	}
	protected void stir(){
		System.out.println("Stir for 5 seconds");
	}
}

class Beer extends Beverage{
	protected void addCondiment(){
		System.out.println("Add nothing");
	}
}

class Main{
	public static void main(String [] args){
		Beverage b = new Whiskey();
		b.templateMethod(30);
		b = new Beer();
		b.templateMethod(300);
	}
}