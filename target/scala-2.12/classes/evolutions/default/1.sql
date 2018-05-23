# --- !Ups

create table "product_type" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null
);

create table "product" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null,
  "description" varchar not null,
  "type_id" integer default (0),
  "price" integer default (0),
  foreign key("type_id") references product_type(id)
);

create table "opinion" (
  "id" integer primary key autoincrement,
  "value" varchar,
  "product_id" integer not null,
  foreign key("product_id") references product(id)
);

create table "basket"(
  "id" integer primary key autoincrement,
  "user_id" integer not null
);

create table "basket_product" (
    "id" integer primary key autoincrement,
    "product_id" integer not null,
    "basket_id" integer not null,
    foreign key("product_id") references product(id),
    foreign key("basket_id") references basket(id)
);

create table "orders" (
  "id" integer primary key autoincrement,
  "basket_id" integer not null,
  "total" integer default (0),
  foreign key("basket_id") references basket(id)
);

create table "pay" (
  "id" integer primary key autoincrement,
  "order_id" integer not null,
  foreign key("order_id") references orders(id)
);

create table "key_word" (
  "id" integer primary key autoincrement,
  "word" varchar not null
);


# --- !Downs

drop table "product" if exists;
drop table "opinion" if exists;
drop table "key_word" if exists;
drop table "basket" if exists;
drop table "pay" if exists;
drop table "orders" if exists;
drop table "product_type" if exists;