package example.hibernate.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Marks this class as an Entity
@Table(name = "Film_Master")
public class Film {
	@Id
	@Column(name = "film_id")
	private Integer filmId;
	@Column(name = "film_title", length = 40)
	private String title;
	@Column(name = "film_type", length = 20)
	private String type;
	
	public Film() {
		// TODO Auto-generated constructor stub
	}

	public Film(Integer filmId, String title, String type) {
		super();
		this.filmId = filmId;
		this.title = title;
		this.type = type;
	}

	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", title=" + title + ", type=" + type + "]";
	}

}
