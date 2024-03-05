create database if not exists fiapshop1;

create table produto (
    id int auto_increment primary key,
    nome varchar(20),
    descricao varchar(200),
    quantidade_estoque int,
    preco double,
    data_criacao timestamp default (now())
);