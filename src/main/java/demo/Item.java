package demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	@OneToMany(mappedBy = "itemId", fetch = FetchType.EAGER)
	private Iterable<Note> notes;

	public Item() {
	}

	public Item(long id, String name, Iterable<Note> notes) {
		this.id = id;
		this.name = name;
		this.notes = notes;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Iterable<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(Iterable<Note> notes) {
		this.notes = notes;
	}

	public Item id(long id) {
		setId(id);
		return this;
	}

	public Item name(String name) {
		setName(name);
		return this;
	}

	public Item notes(Iterable<Note> notes) {
		setNotes(notes);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Item)) {
			return false;
		}
		Item item = (Item) o;
		return id == item.id && Objects.equals(name, item.name) && Objects.equals(notes, item.notes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, notes);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", notes='" + getNotes() + "'" +
			"}";
	}
}
