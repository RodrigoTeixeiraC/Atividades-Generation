--Atividade 1

create database db_servicosrh;

use db_servicosrh,

create table funcionarios(
    id bigint(5) auto_increment,
    nome varchar(30),
    idade int(3),
    salario decimal(10,2),
    funcao varchar(30),
    primary key (id)
);


insert into funcionarios (nome, idade, salario, funcao) values("Rodrigo", 25, 10000, "DevJava Senior");
--feito 5x

select * from funcionarios where salario > 2000

select * from funcionarios where salario < 2000

update funcionarios set salario = 5000 where id = 3



--Atividade 2

create database db_ecommerce;

use db_secommerce,

create table produtos(
    id bigint(5) auto_increment,
    nome varchar(30),
    valor decimal(10,2),
    marca varchar(30),
    quantidade int,
    primary key (id)
);


insert into produtos (nome, valor, marca, quantidade) values("mouse", 250, "multilaser", 300);
--feito 8x

select * from produtos where valor > 500

select * from produtos where valor < 500

update produtos set quantidade = 0 where id = 5





--Atividade 2

create database db_escola;

use db_escola,

create table alunes(
    id bigint(5) auto_increment,
    nome varchar(30),
    idade int(3),
    nota decimal(2,2),
    turma varchar(30),
    primary key (id)
);


insert into produtos (nome, idade, nota, turma) values("Rodrigo", 25, 10, "Turma 20");
--feito 8x

select * from alunes where nota > 7

select * from alunes where nota < 7

update alunes set nota = 9 where id = 2