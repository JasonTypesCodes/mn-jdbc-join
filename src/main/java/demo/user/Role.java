package demo.user;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	public Role() {
	}

	public Role(long id, String name) {
		this.id = id;
		this.name = name;
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

	public Role id(long id) {
		setId(id);
		return this;
	}

	public Role name(String name) {
		setName(name);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Role)) {
			return false;
		}
		Role role = (Role) o;
		return id == role.id && Objects.equals(name, role.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			"}";
	}


}
