create table customers
(
    id           serial primary key,
    name         varchar(50) not null,
    surname      varchar(50) not null,
    age          int check ( age > -1 ),
    phone_number varchar(20)
);

insert into customers (name, surname, age, phone_number)
values ('Alexey', 'Ivanov', '21', '444-555');
insert into customers (name, surname, age, phone_number)
values ('Petr', 'Romanov', '49', '442-555');
insert into customers (name, surname, age, phone_number)
values ('Kseniya', 'Stechkina', '18', '424-555');
insert into customers (name, surname, age, phone_number)
values ('Klim', 'Zhukov', '50', '424-525');
insert into customers (name, surname, age, phone_number)
values ('John', 'Tolkien', '81', '414-545');

create table orders
(
    id           serial primary key,
    date         date         not null default now(),
    customer_id  int references customers (Id),
    product_name varchar(100) not null,
    amount       int check ( amount > -1 )
);

insert into orders (customer_id, product_name, amount)
values (1, 'books', 14000);
insert into orders (customer_id, product_name, amount)
values (2, 'warships', 13);
insert into orders (customer_id, product_name, amount)
values (3, 'cats', 40);
insert into orders (customer_id, product_name, amount)
values (4, 'cool story', 9000);
insert into orders (customer_id, product_name, amount)
values (5, 'rings', 20);

