package Main;

public class PlayerProxy implements iPlayer {
	Player player;
	
	public void setPlayer(String name) {
		this.player = new Player();
		this.player.name = name;
	}

	public String hits() {
		if(player != null) {
			return player.hits();	
		}
		return "There is no one to hit!";
	}

	public String catches() {
		if(player != null) {
			return this.player.catches();
		}
		return "There is no one to hit!";
	}

	public String throwing() {
		if(player != null) {
			return this.player.throwing();
		}
		return "There is no one to throw!";
	}	
}
