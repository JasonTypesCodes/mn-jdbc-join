create table item (
  id bigserial primary key,
  name varchar(255) not null
);

create table note (
  id bigserial primary key,
  item_id bigint REFERENCES item(id) not null,
  text varchar(500) not null
);

insert into item (name) values ('Item 1'), ('Item 2'), ('Item 3'), ('Item 4');

insert into note (item_id, text) values
  (1, 'Note 1'),
  (1, 'Note 2'),
  (3, 'Note 3'),
  (3, 'Note 4'),
  (3, 'Note 5'),
  (4, 'Note 6'),
  (4, 'Note 7'),
  (4, 'Note 8'),
  (4, 'Note 9'),
  (4, 'Note 10');

