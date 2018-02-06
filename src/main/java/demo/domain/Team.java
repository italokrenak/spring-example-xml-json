package demo.domain;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Team {

	private String name;
	private String locattion;
	private String mascotte;
	private Set<Player> players;

	public Team() {
		super();
	}

	public Team(String name, String locattion, Set<Player> players) {
		this();
		this.name = name;
		this.locattion = locattion;
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocattion() {
		return locattion;
	}

	public void setLocattion(String locattion) {
		this.locattion = locattion;
	}

	public String getMascotte() {
		return mascotte;
	}

	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

}
