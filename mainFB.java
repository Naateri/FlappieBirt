import java.util.Scanner; //user input

public class mainFB extends Flappy {
	public static String namingFlappie(){
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Ingrese el nombre de su flappy: ");
		name = scan.next();
		return name;
	}
	public static void main(String[] args) {
		int color;
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero (color):");
		color = scan.nextInt();
		System.out.println("Si desea, usted puede nombrar a su Flappie.\nDesea nombrarlo? (s/n) ");
		name = scan.next();
		if (name != "s"){
			name = namingFlappie();
		} else {
			name = "lol";
		}
		Flappy myFlappy = new Flappy();
		myFlappy.setColour(color);
		myFlappy.setName(name);
		myFlappy.volar();
		myFlappy.hablar();
	}

}
