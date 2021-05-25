create database db_pizzaria_legal;
use  db_pizzaria_legal;
create table tb_categoria(
id bigint auto_increment not null,
tamanho varchar(100),
valorTama bigint,
Refri varchar(100),
valorRefri bigint,
primary key (id)
);

create table tb_pizza(
id bigint auto_increment not null,	
doce varchar (100) not null,
valorDo bigint,
salgado varchar (100) not null,
valorSal bigint,
id_catego bigint default null,
primary key(id),
foreign key(id_catego) references tb_categoria (id)

);

insert into tb_categoria (tamanho,Refri,valorTama,valorRefri) values ('Pequena','Coca',10,6);
insert into tb_categoria (tamanho,Refri,valorTama,valorRefri) values ('Media','guarana',15,6);
insert into tb_categoria (tamanho,Refri,valorTama,valorRefri) values ('Grade','Fanata',20,6);

insert into tb_pizza (doce,salgado,valorDo,valorSal,id_catego) value ("Morango","Queijo",29,70,3);
insert into tb_pizza (doce,salgado,valorDo,valorSal,id_catego) value ("Doce de leite","catupire",50,55,2);
insert into tb_pizza (doce,salgado,valorDo,valorSal,id_catego) value ("Morango com queijo","4 queijos",43,34,2);
insert into tb_pizza (doce,salgado,valorDo,valorSal,id_catego) value ("vanila","havaiana",32,33,2);
insert into tb_pizza (doce,salgado,valorDo,valorSal,id_catego) value ("geleia","portuguesa",22,50,1);







select valorDo,valorSal,tb_categoria.valorRefri,tb_categoria.valorTama from tb_pizza inner join tb_categoria on tb_pizza.id_catego = tb_categoria.id
where tb_pizza.valorSal  and tb_pizza.valorDo > 45;

select valorDo,valorSal,tb_categoria.valorRefri,tb_categoria.valorTama from tb_pizza right join tb_categiria on tb_pizza.id_catego = tb_categiria.id
where tb_pizza.valorSal and tb_pizza.valorDo between '29' and 60;

select*from tb_pizza where tb_pizza.valorSal and tb_pizza.valorDo between 29 and 60;

select* from tb_pizza where salgado  like 'c%';

select  doce from tb_pizza;





