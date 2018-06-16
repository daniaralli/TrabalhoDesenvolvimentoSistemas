INSERT INTO `tb_tipoprojeto`(`COD_TIPO`, `DESC_PROJETO`) VALUES (1,"Extensao");
INSERT INTO `tb_tipoprojeto`(`COD_TIPO`, `DESC_PROJETO`) VALUES (2,"Pesquisa");
INSERT INTO `tb_tipoprojeto`(`COD_TIPO`, `DESC_PROJETO`) VALUES (3,"Ensino");

INSERT INTO `tb_colaborador`(`COD_COLABORADOR`, `CPF`, `EMAIL`, `NM_CURSO`, `NOME_PESSOA`, `TELEFONE`) VALUES (1,'123029381','felipeam01@email','ADS','Felipe Menezes','98259070');
INSERT INTO `tb_colaborador`(`COD_COLABORADOR`, `CPF`, `EMAIL`, `NM_CURSO`, `NOME_PESSOA`, `TELEFONE`) VALUES (2,'463029381','terezanayara@email','MSI','Nayara Terezinha','98258037');
INSERT INTO `tb_colaborador`(`COD_COLABORADOR`, `CPF`, `EMAIL`, `NM_CURSO`, `NOME_PESSOA`, `TELEFONE`) VALUES (3,'343029381','santosmariaed01@email','MSI','Maria Eduarda Santos','98257348');
INSERT INTO `tb_colaborador`(`COD_COLABORADOR`, `CPF`, `EMAIL`, `NM_CURSO`, `NOME_PESSOA`, `TELEFONE`) VALUES (4,'003029381','zatialine@email','ADS','Aline Fermino Zati','98258900');
INSERT INTO `tb_colaborador`(`COD_COLABORADOR`, `CPF`, `EMAIL`, `NM_CURSO`, `NOME_PESSOA`, `TELEFONE`) VALUES (5,'193029381','andradejoao@email','BEE','João Pedro Andrade','982519281');
INSERT INTO `tb_colaborador`(`COD_COLABORADOR`, `CPF`, `EMAIL`, `NM_CURSO`, `NOME_PESSOA`, `TELEFONE`) VALUES (6,'893029381','eletronicapedro@email','BEE','João Pedro Silva Fonseca','98256789');


INSERT INTO `tb_projeto`(`COD_PROJETO`, `DT_FIM`, `DT_INICIO`, `DS_NOME`, `TOTAL_HORAS`, `SITUACAO`, `TIPO_EDITAL`, `COD_TIPO`) VALUES (1,'2018-7-04','2014-8-03', 'Criptografia com automatos celulares', 480, 'Concluido','PIVIC Sem Bolsa',1);
INSERT INTO `tb_projeto`(`COD_PROJETO`, `DT_FIM`, `DT_INICIO`, `DS_NOME`, `TOTAL_HORAS`, `SITUACAO`, `TIPO_EDITAL`, `COD_TIPO`) VALUES (2,'2018-7-04','2014-8-03', 'Modelagem de fogos com automatos celulares', 900, 'Andamento','PIBIC EM CNPQ',1);
INSERT INTO `tb_projeto`(`COD_PROJETO`, `DT_FIM`, `DT_INICIO`, `DS_NOME`, `TOTAL_HORAS`, `SITUACAO`, `TIPO_EDITAL`, `COD_TIPO`) VALUES (3,'2018-7-04','2014-8-03', 'Evacuação de pedestres baseada em automatos', 300, 'Andamento','PIBIC EM CNPQ',1);
INSERT INTO `tb_projeto`(`COD_PROJETO`, `DT_FIM`, `DT_INICIO`, `DS_NOME`, `TOTAL_HORAS`, `SITUACAO`, `TIPO_EDITAL`, `COD_TIPO`) VALUES (4,'2018-7-04','2014-8-03', 'Mineração de dados educacao', 3600, 'Andamento','PIVIC Sem Bolsa',3);
INSERT INTO `tb_projeto`(`COD_PROJETO`, `DT_FIM`, `DT_INICIO`, `DS_NOME`, `TOTAL_HORAS`, `SITUACAO`, `TIPO_EDITAL`, `COD_TIPO`) VALUES (5,'2018-7-04','2014-8-03', 'Arduino para robótica coletica', 200, 'Andamento','PIBIC FAPEMIG',1);
INSERT INTO `tb_projeto`(`COD_PROJETO`, `DT_FIM`, `DT_INICIO`, `DS_NOME`, `TOTAL_HORAS`, `SITUACAO`, `TIPO_EDITAL`, `COD_TIPO`) VALUES (6,'2018-7-04','2014-8-03', 'Controle de robôs baseado em autômatos celulares', 500, 'Andamento','PIDIT IFTM',2);
