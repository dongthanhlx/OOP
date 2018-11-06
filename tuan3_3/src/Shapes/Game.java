package Shapes;
public class Game {
	private int numberOfPlayers;
	private int ageGame;
	private String type;
	private String name;
	private String company;
	public Game(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCompany(String company){
		this.company = company;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setAgeGame(int ageGame){
		this.ageGame = ageGame;
	}
	public void setNumberOfPlayers(int numberOfPlayers){
		this.numberOfPlayers = numberOfPlayers;
	}
	public String getName(){
			return name ;
		}
	public String getCompany(){
			return company;
		}
	public String getType(){
			return type;
		}
	public int getAgeGame(){
			return ageGame;
		}
	public int getNumberOfPlays(){
			return numberOfPlayers;
		}
				
}