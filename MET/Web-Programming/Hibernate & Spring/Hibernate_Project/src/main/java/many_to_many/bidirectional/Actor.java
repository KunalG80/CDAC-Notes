package many_to_many.bidirectional;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Actor_Master")
public class Actor {
	@Id
	@Column(name = "actor_id", length = 3)
	private String actorId;
	@Column(name = "actor_name", length = 30)
	private String name;
	//Specifying that the Actor is the INVERSE side
	@ManyToMany(mappedBy = "actors")
	private Collection<WebSeries> webSerieses;
	public Actor() {
		webSerieses = new ArrayList<WebSeries>();
	}
	public Actor(String actorId, String name, Collection<WebSeries> webSerieses) {
		super();
		this.actorId = actorId;
		this.name = name;
		this.webSerieses = webSerieses;
	}
	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<WebSeries> getWebSerieses() {
		return webSerieses;
	}
	public void setWebSerieses(Collection<WebSeries> webSerieses) {
		this.webSerieses = webSerieses;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", name=" + name + ", webSerieses=" + webSerieses + "]";
	}
	public void addWebSeries(WebSeries webSeriesObject) {
		webSerieses.add(webSeriesObject);
	}

}
