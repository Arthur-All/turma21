create  database db_cidade_das_frutas;
 use  db_cidade_das_frutas;
 
 create table tb_categoria (
 
 id bigint auto_increment not null,
 produtor varchar (80) not null,
 fiado boolean,
 cartao boolean,
 primary key (id)
 );
 
 create table tb_produto (
 id bigint auto_increment not null,
 nome varchar (20) not null,
 valor bigint not null,
 agrotoxico boolean,
 
 id_catego bigint default null,
 primary key (id),
 foreign key (id_catego) references tb_categoria(id)
 );
 
 
 insert into tb_categoria (produtor,fiado,cartao) values ("Barato",true,false);
 insert into tb_categoria (produtor,fiado,cartao) values ("Caro",false,true);
 insert into tb_categoria (produtor,fiado,cartao) values ("Barato",false,false);
 
 
 insert into tb_produto (nome,valor,agrotoxico,id_catego) values ("Banana",3,true,1);
 insert into tb_produto (nome,valor,agrotoxico,id_catego) values ("FrutaCara",10,false,2);
 insert into tb_produto (nome,valor,agrotoxico,id_catego) values ("Pera",3,true,3);
 insert into tb_produto (nome,valor,agrotoxico,id_catego) values ("muitomuitocaro",60,false,2);
 insert into tb_produto (nome,valor,agrotoxico,id_catego) values ("Caju",4,true,2);
 select*from tb_produto where valor > 50;
 select*from tb_produto where valor between 3 and 60;
 select*from tb_produto where nome like 'c%';
 select nome,valor,agrotoxico,tb_categoria.produtor,tb_categoria.fiado from tb_produto inner join tb_categoria 
 on tb_produto.id_catego = tb_categoria.id;
 