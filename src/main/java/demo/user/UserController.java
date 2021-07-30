package demo.user;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/users")
public class UserController {
	private UserRepository repo;

	public UserController(UserRepository repo) {
		this.repo = repo;
	}

	@Get
	public Iterable<User> getUsers() {
		return repo.findAll();
	}
}
