create table products
(
    id          bigint auto_increment
        primary key,
    name        varchar(255)   not null,
    price       decimal(10, 2) not null,
    category_id tinyint        not null,
    CONSTRAINT fk_category
        FOREIGN KEY (category_id) REFERENCES categories (id)
            ON DELETE RESTRICT
);
