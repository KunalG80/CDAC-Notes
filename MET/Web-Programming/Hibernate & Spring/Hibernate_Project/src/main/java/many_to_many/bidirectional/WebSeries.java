package many_to_many.bidirectional;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "WebSeries_Master")
public class WebSeries {
	@Id
	@Column(name = "web_series_id", length = 3)
	private String webSeriesId;
	@Column(name = "web_series_title", length = 30)
	private String title;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			joinColumns = {@JoinColumn(name = "webseries_code")},
			inverseJoinColumns = {@JoinColumn(name = "actor_code")},
			name = "Actor_WebSeries"
			)
	private Collection<Actor> actors;
	public WebSeries() {
		// TODO Auto-generated constructor stub
	}
	public WebSeries(String webSeriesId, String title, Collection<Actor> actors) {
		super();
		this.webSeriesId = webSeriesId;
		this.title = title;
		this.actors = actors;
	}
	public String getWebSeriesId() {
		return webSeriesId;
	}
	public void setWebSeriesId(String webSeriesId) {
		this.webSeriesId = webSeriesId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Collection<Actor> getActors() {
		return actors;
	}
	public void setActors(Collection<Actor> actors) {
		this.actors = actors;
		for(Actor currentActor : actors)
			currentActor.addWebSeries(this);
		
	}
	public void addActor(Actor actorObject) {
		//Adding a new actor into the actors collection held by WebSeries
		actors.add(actorObject);
		//Adding the current web series into web serieses collection held by
		//the corresponding actor.
		actorObject.addWebSeries(this);
	}

}
