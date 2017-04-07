public class Flappy {
    public int colour; //hex
	
	public Flappy(){ //constructor
		this.colour = 0;
	}
	//metodos: setters y getters
	public void setColour(int col){
		this.colour = col;
	}
	public int getColour(){
		return this.colour;
	}
	//metodos
	public void volar(){
		System.out.println("Estoy volando!!");
	}

}
