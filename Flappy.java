public class Flappy {
    private int colour; //hex
	private String name; //you can name your flappie omfg 
	private boolean status; //true = vivo, false = muerto
	
	public Flappy(){ //constructor
		this.colour = 0;
		this.name = "lol";
		this.status = true;
	}
	//metodos: setters y getters
	public void setColour(int col){
		this.colour = col;
	}
	public void setName(String neim){
		this.name = neim;
	}
	public int getColour(){
		return this.colour;
	}
	public String getName(){
		return this.name;
	}
	//metodos
	public void volar(){
		System.out.println("Estoy volando!!");
	}
	public void hablar(){
		System.out.println("Mi nombre es " + this.name);
	}
	public void checkStatus(){
		if (this.status){
			System.out.println("Vivo!");
		}else{
			System.out.println("Muerto :(");
		}
	}

}
