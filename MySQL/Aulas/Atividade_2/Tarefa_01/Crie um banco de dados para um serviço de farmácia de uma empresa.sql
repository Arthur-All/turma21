create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment not null,
categoria varchar(100) not null,
Fix_User boolean not null,
Covenio boolean not null,
primary key (id)
);


create table tb_produto(
id bigint auto_increment not null,
nome varchar (100) not null,
valor bigint not null,
deliv boolean not null,
descricao varchar (100) not null,
id_catego bigint default null,
primary key (id),
foreign key(id_catego) references tb_categoria(id)
);

insert into tb_categoria (categoria,Fix_User,Covenio) values ("dorFlex",false,true);
insert into tb_categoria (categoria,Fix_User,Covenio) values ("Adivil",true,true);
insert into tb_categoria (categoria,Fix_User,Covenio) values ("Alegra",false,false);
insert into tb_categoria (categoria,Fix_User,Covenio) values ("RemedioX",false,true);
insert into tb_categoria (categoria,Fix_User,Covenio) values ("Bibafil",false,true);
insert into tb_produto (nome,valor,deliv,descricao,id_catego) values ("Rodolf",80,false,"Remedio tira a dor de cabeca",1);
insert into tb_produto (nome,valor,deliv,descricao,id_catego) values ("jerfersom",20,false,"Bom para gripe",2);
insert into tb_produto (nome,valor,deliv,descricao,id_catego) values ("Arnaldo",35,true,"Remedio para alergia",3);
insert into tb_produto (nome,valor,deliv,descricao,id_catego) values ("Null",5000,false,"Remedio X cura tudo ate oso quebrado",4);

select*from tb_produto where valor >50;
select*from tb_produto where valor between 3 and 60;
select*from tb_categoria where categoria like 'b%';
select nome,valor,deliv,descricao,tb_categoria.categoria,tb_categoria.Fix_User,tb_categoria.Covenio from tb_produto inner join tb_categoria 
on tb_produto.id_catego = tb_categoria.id;








