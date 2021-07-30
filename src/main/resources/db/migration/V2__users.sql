create table users (
  id bigserial primary key,
  name varchar(255) not null
);

create table roles (
  id bigserial primary key,
  name varchar(30) not null
);

create table users_roles (
  user_id bigserial references users(id),
  role_id bigserial references roles(id)
);

insert into roles (name) values ('ADMIN'), ('USER');

insert into users (name) values ('Alice'), ('Bob');

insert into users_roles (user_id, role_id) values
  (1, 1),
  (1, 2),
  (2, 2);
