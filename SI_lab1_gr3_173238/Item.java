class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char karakter;

	//TODO constructor
	Item(int id, String name, double price, char karakter){
		this.id = id;
		this.name = name;
		this.price = price;
		this.karakter = karakter;
	}

	//TODO setters and getters
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public char getKarakter(){
		return this.karakter;
	}
	public void setId(int id){
		this.id = id;;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setKarakter(char c){
		this.karakter = c;
	}
		
	double getTaxReturn(){
		return this.price * 0.15;
	}
	
	double taxReturn () {
		//TODO
	}
}