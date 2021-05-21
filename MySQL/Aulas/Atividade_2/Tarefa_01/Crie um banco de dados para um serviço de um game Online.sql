create database db_generation_game_online;

use db_generation_game_online;


create table  tb_class (

id bigint NOT NULL AUTO_INCREMENT,
nome varchar (100) default null , 
arma varchar(100),
passiva varchar(100),
primary key (id)


);

create table tb_personagem (
id bigint not null auto_increment,
nome varchar (100) not null,
nivel bigint (3) not null,
att bigint(5) not null,
def bigint (5) default null,
id_class bigint DEFAULT NULL,
primary key (id),
FOREIGN KEY (id_class) REFERENCES tb_class (id)

);


insert into tb_class (nome,arma,passiva) VALUES ("Mago","Cajado","Furia:+10ad");
insert into tb_class (nome,arma,passiva) VALUES ("Coronel","Pisto","Pigas: +25Hp");
insert into tb_class (nome,arma,passiva) VALUES ("HackMan","NoteBook","Energetico:35% velocidade dobradapor 4s");
insert into tb_class (nome,arma,passiva) VALUES ("Gatuno","Double Dags","Gota no oceano:Invie apos 30% do hp se for");
insert into tb_class (nome,arma,passiva) VALUES ("Bebado","EisenBahn","Litrao:Apos 2garrafas defesa dobrada");
update tb_class set att = 1100 where id = 4;


insert into tb_personagem (nome,nivel,att,def,id_class) value ("Rodriguinho2009","13","1000","250",3);
insert into tb_personagem (nome,nivel,att,def,id_class) value ("Rodriginho2209","13","1000","250",3);
insert into tb_personagem (nome,nivel,att,def,id_class) value ("kloveBig","99","3000","1600",5);
insert into tb_personagem (nome,nivel,att,def,id_class) value ("flock","222","7540","1600",4);
insert into tb_personagem (nome,nivel,att,def,id_class) value ("Gonzaga","232","10000","1480",1);
insert into tb_personagem (nome,nivel,att,def,id_class) value ("HernamosGames","262","8000","1679",2);
insert into tb_personagem (nome,nivel,att,def,id_class) value ("GAMER045","2442","115940","70000",3);
insert into tb_personagem (nome,nivel,att,def,id_class) value ("XERV","222","6000","2100",5);

update tb_personagem set nome = "C123MelaoColorido" where id = 1;

use db_generation_game_online;

select*from tb_personagem where att > 2000;
select*from tb_personagem where def between  1000 and 2000;
select*from tb_personagem where nome like 'c%';
select*from tb_personagem inner join tb_class on  tb_personagem.nome,arma,passiva= tb_class.nome,arma,passiva;


