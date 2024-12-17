package one_to_many.unidirectional;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Cricket_Teams")
public class CricketTeam {
	@Id
	@Column(name = "team_id", length = 3)
	private String teamId;
	@Column(name = "team_name", length = 20)
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "team_code")
	private Collection<CricketPlayer> cricketPlayers;
	public CricketTeam() {
		//Initializing the Collection: cricketPlayers
		cricketPlayers = new ArrayList<CricketPlayer>();
	}
	public CricketTeam(String teamId, String name, Collection<CricketPlayer> cricketPlayers) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.cricketPlayers = cricketPlayers;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<CricketPlayer> getCricketPlayers() {
		return cricketPlayers;
	}
	public void setCricketPlayers(Collection<CricketPlayer> cricketPlayers) {
		this.cricketPlayers = cricketPlayers;
	}
	@Override
	public String toString() {
		return "CricketTeam [teamId=" + teamId + ", name=" + name + ", cricketPlayers=" + cricketPlayers + "]";
	}
	//This is a convenient method that adds one player into the existing collection
	public void addCricketPlayer(CricketPlayer cricketPlayerObject) {
		cricketPlayers.add(cricketPlayerObject);
	//Collection.add(CricketPlayer)
	}

}







