package demo.item;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class Note {

	@Id
	@GeneratedValue
	private long id;

	private long itemId;

	private String text;

	public Note() {
	}

	public Note(long id, long itemId, String text) {
		this.id = id;
		this.itemId = itemId;
		this.text = text;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getItemId() {
		return this.itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Note id(long id) {
		setId(id);
		return this;
	}

	public Note itemId(long itemId) {
		setItemId(itemId);
		return this;
	}

	public Note text(String text) {
		setText(text);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Note)) {
			return false;
		}
		Note note = (Note) o;
		return id == note.id && itemId == note.itemId && Objects.equals(text, note.text);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, itemId, text);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", itemId='" + getItemId() + "'" +
			", text='" + getText() + "'" +
			"}";
	}

}
