package demo.item;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/item")
public class ItemController {

	private ItemRepository repo;

	public ItemController(ItemRepository repo) {
		this.repo = repo;
	}

	@Get
	public Iterable<Item> getItems() {
		return repo.findAll();
	}
}
