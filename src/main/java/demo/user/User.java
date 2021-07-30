package demo.user;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	@OneToMany
	@JoinTable(
		name = "users_roles",
		joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
		inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
	)
	private Iterable<Role> roles;

	public User() {
	}

	public User(long id, String name, Iterable<Role> roles) {
		this.id = id;
		this.name = name;
		this.roles = roles;
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

	public Iterable<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Iterable<Role> roles) {
		this.roles = roles;
	}

	public User id(long id) {
		setId(id);
		return this;
	}

	public User name(String name) {
		setName(name);
		return this;
	}

	public User roles(Iterable<Role> roles) {
		setRoles(roles);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof User)) {
			return false;
		}
		User user = (User) o;
		return id == user.id && Objects.equals(name, user.name) && Objects.equals(roles, user.roles);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, roles);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", roles='" + getRoles() + "'" +
			"}";
	}

}
