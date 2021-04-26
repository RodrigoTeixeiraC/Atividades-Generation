

CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;


CREATE TABLE `tb_personagem`(
`id` BIGINT(5) AUTO_INCREMENT NOT NULL,
`nome` VARCHAR(15) NOT NULL,
`defesa` INT(5) NOT NULL,
`arma` VARCHAR(30),
`ataque` VARCHAR(30),
`classe_id` BIGINT(5),
PRIMARY KEY(`id`),
FOREIGN KEY (`classe_id`) REFERENCES `tb_classe` (`id`)
);


CREATE TABLE tb_classe(
`id` BIGINT(5) AUTO_INCREMENT NOT NULL,
`tipo` VARCHAR(30) NOT NULL,
`raca` VARCHAR(30) NOT NULL,
PRIMARY KEY (`id`)
);


INSERT INTO `tb_classe` (`tipo`, `raca`) VALUES ("assassino", "humano");
INSERT INTO `tb_classe` (`tipo`, `raca`) VALUES ("mago", "humano");
INSERT INTO `tb_classe` (`tipo`, `raca`) VALUES ("assassino", "elfo");
INSERT INTO `tb_classe` (`tipo`, `raca`) VALUES ("mago", "elfo");
INSERT INTO `tb_classe` (`tipo`, `raca`) VALUES ("assassino", "anao");
INSERT INTO `tb_classe` (`tipo`, `raca`) VALUES ("mago", "anao");



INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Valdemir", 1500, "estilete", 1500, 1);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Judeilson", 2100, "cajado de pvc", 2000, 2);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Judite", 1800, "facao", 1600, 1);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Valeria", 2000, "varinha de brinquero", 900, 2);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Rimedlav", 3000, "foice", "super pulo", 3);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Noslieduj", 4000, "Cajado de verdade", 2300, 4);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Etiduj", 3000, "agulhas", 3000, 3);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Airelav", 4000, "Varinha de condão", 4000, 4);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Balin", 6000, "Machado", 3500, 5);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Bifur", 5000, "Machado mágico", 4500, 6);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Durin", 6000, "dois machados", 5000, 5);
INSERT INTO `tb_personagem` (`nome`, `defesa`,`arma`, `ataque`, `classe_id`) VALUES ("Dwalin", 5000, "Martelo magico", 6000, 6);


SELECT * FROM `tb_personagem` WHERE `ataque` > 2000;

SELECT * FROM `tb_personagem` WHERE `defesa` > 1000 and `defesa` < 2000;

SELECT * FROM `tb_personagem` WHERE `nome` LIKE "%j%";

SELECT * FROM `tb_personagem` INNER JOIN `tb_classe` on tb_classe.id = tb_personagem.classe_id;



