package Main;

public class Player implements iPlayer{
	public String name;

	public String hits() {
		String hits = String.format("%s hit the ball", name);
		System.out.println(hits);
		return hits;	
	}

	public String catches() {
		String catches = String.format("%s catches the ball", name);
		System.out.println(catches);
		return catches;	
	}

	public String throwing() {
		String throwing = String.format("%s throws the ball", name);
		System.out.println(throwing);
		return throwing;			
	}
	
	
}
