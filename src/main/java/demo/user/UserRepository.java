package demo.user;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
@Join(value = "roles", type = Join.Type.LEFT_FETCH)
public interface UserRepository extends CrudRepository<User, Long> { }
