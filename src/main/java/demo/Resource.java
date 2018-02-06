package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.Player;
import demo.domain.Team;

@RestController
public class Resource {

	private Team team;

	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Italo", "attack"));
		players.add(new Player("Jack", "view"));

		this.team = new Team("Mahakali", "Galadoland", players);
	}

	@RequestMapping("/file")
	public String file() {
		return "Rest OK";
	}

	@RequestMapping("/team")
	public Team team() {
		return this.team;
	}
}
