CREATE TABLE actuality(
    ID_ACTU NUMBER NOT NULL PRIMARY KEY,
    TITRE_ACTU VARCHAR2(100),
    DATE_J_D_ACTU DATE,
    DATE_J_F_ACTU DATE,
    HEURE_F_ACTU VARCHAR2(10),
    TEXT_ACTU VARCHAR2(1024),
    LINK_ACTU VARCHAR2(50),
    PHOTO_ACTU VARCHAR2(30)
    );

select * from actuality;
/----------------------------  INSERTION DES DONNEES DANS LA TABLE ACTUALITY   --------------------------------/

INSERT INTO actuality (ID_ACTU, TITRE_ACTU, DATE_J_D_ACTU, DATE_J_F_ACTU, HEURE_F_ACTU, TEXT_ACTU, LINK_ACTU, PHOTO_ACTU)
VALUES(1, 
'APPEL À CANDIDATURE À LA 6ÈME ÉDITION DU PROGRAMME DE BOURSES IMMANA',
'16/12/2020', 
'31/12/2020', 
'18h',
'La 6èmeédition du programme de Bourses IMMANA permettra aux leaders émergents de la recherche en Agriculture, Nutrition et Santé » de parfaire leurs cursus.L''équipe du bourses IMMANA a organisé deux webinaires d''information pour l''appel à candidatures de la sixième série de bourses IMMANA.',
'https://bit.ly/IMMANASubmit', 
'bource_6.png');



INSERT INTO actuality (ID_ACTU, TITRE_ACTU, DATE_J_D_ACTU, DATE_J_F_ACTU, HEURE_F_ACTU, TEXT_ACTU, LINK_ACTU, PHOTO_ACTU)
VALUES (2, 
'APPEL À CANDIDATURE POUR OPPORTUNITÉS DE FINANCEMENT PAR LE BIAIS DU FONDS D''ACTION (BIOPAMA)',
'10/01/2020', 
'28/01/2020', 
'12h',
'Les subventions de réponse rapide du Fonds d''action BIOPAMA sont conçues pour répondre aux risques et aux difficultés induits par la crise du COVID-19 dans les pays d''Afrique, des Caraïbes et du Pacifique
Les subventions de réponse rapide visent à accroître la résilience des aires protégées et les moyens de subsistance des communautés locales face aux risques et aux difficultés de la pandémie mondiale de COVID-19.',
'https://action.biopama.org/ ', 
'biopama.png');



INSERT INTO actuality (ID_ACTU, TITRE_ACTU, DATE_J_D_ACTU, DATE_J_F_ACTU, HEURE_F_ACTU, TEXT_ACTU, LINK_ACTU, PHOTO_ACTU)
values (3, 
'5ÈME ÉDITION DU CONCOURS «MEDITERRANEAN WATER HEROES»',
'15/12/2020', 
'15/04/2021', 
'17h',
'Les inscriptions à la 5ème édition du Concours « Mediterranean Water Heroes Contest », sur la valorisation de l''eau, sont lancée jusqu''au 10 janvier 2021, afin que de nombreux jeunes aient la chance de présenter leurs travaux innovants sur l''eau.',
'https://bit.ly/2JXrgQC ', 
'mediterranean_water.png');

/----------------------------   LA TABLE EVENT   --------------------------------/
CREATE TABLE event(
    ID_EVE NUMBER NOT NULL PRIMARY KEY,
    TITRE_EVE VARCHAR2(255),
    DATE_J_D_EVE DATE,
    DATE_J_F_EVE DATE,
    HEURE_D_EVE VARCHAR2(10),
    HEURE_F_EVE VARCHAR2(10),
    TEXT_EVE VARCHAR2(1024),
    PHOTO_EVE VARCHAR2(50)
    );
select * from event;
/----------------------------  INSERTION DES DONNEES DANS LA TABLE EVENT   --------------------------------/

INSERT INTO event (ID_EVE, TITRE_EVE, DATE_J_D_EVE, DATE_J_F_EVE, HEURE_D_EVE, HEURE_F_EVE, TEXT_EVE, PHOTO_EVE)
VALUES(1,
'Webinaire',
'10/02/2020', 
'20/02/2021', 
'10h',
'12h',
'L''Institut de Recherche pour l''Energie Solaire et les Nouvelles Energies (IRESEN) du Maroc et le CDTI, Agence d''Innovation du Ministère des Sciences et de l''Innovation d''Espagne, ont le plaisir de vous inviter au webinaire',
'webinaire.png');
--select * from event;
--DELETE FROM event WHERE ID_EVE = 2;
INSERT INTO event (ID_EVE, TITRE_EVE, DATE_J_D_EVE, DATE_J_F_EVE, HEURE_D_EVE, HEURE_F_EVE, TEXT_EVE, PHOTO_EVE)
VALUES(2,
'Workshop',
'05/09/2020', 
'09/10/2021', 
'15h',
'17h',
'Registration for the Dark - Quiet Skies online Workshop is free. You must register to acquire a link << http://research.iac.es/congreso/quietdarksky2020/pages/registration.php >>.',
'workshop.png');


INSERT INTO event (ID_EVE, TITRE_EVE, DATE_J_D_EVE, DATE_J_F_EVE, HEURE_D_EVE, HEURE_F_EVE, TEXT_EVE, PHOTO_EVE)
VALUES(3,
'Enseignement dans COVID 19',
'21/05/2020', 
'22/05/2021', 
'16h',
'23h',
'LE CENTRE DE L''ENSEIGNEMENT INCLUSIF ET DE LA RESPONSABILITÉ SOCIALE DE L''UCA (CEIRS/UCA) ORGANISE UNE TABLE RONDE À DISTANCE SOUS LE THÈME : << ENSEIGNEMENT INCLUSIF ET RESPONSABILITÉ SOCIALE À L''UCA DANS LE CONTEXTE DE LA PANDÉMIE COVID 19 >>.',
'covid19.png');
    
/----------------------------   LA TABLE ESTABLISHMENT   --------------------------------/
CREATE TABLE establishment (
    ID_ESTA NUMBER NOT NULL PRIMARY KEY,
    ABRE_ESTA VARCHAR2(10),
    NOM_ESTA VARCHAR2(100),
    ADRESSE_ESTA VARCHAR2(100),
    TELE_ESTA VARCHAR2(20),
    EMAIL_ESTA VARCHAR2(50),
    LINK_ESTA VARCHAR2(30),
    PHOTO_ESTA VARCHAR2(30)
    );
    
/----------------------------  INSERTION DES DONNEES DANS LA TABLE ESTABLISHMENT   --------------------------------/
INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(1 , 'FSSM' , 'Faculté des Sciences Semlalia' , 'Bd. Prince My Abdellah, B.P. 2390, 40000 Marrakech' , '+212 5 24 43 46 49' , 'fssm@uca.ma' , 'https://www.uca.ma/site/fssm' , 'fssm.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(2 , 'FSJES' , 'Faculté des Sciences Juridiques  Economiques et Sociales' , 'Daoudiate B.P. 2380, 40000 Marrakech' , '+212 5 24 30 30 32' , 'contact@uca.ma' , 'https://www.uca.ma/site/fsjes' , 'fsjes.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(3 , 'ENCG' , 'Ecole Nationale de Commerce et de Gestion de Marrakech' , 'Av. Allal El Fassi BP 3748 Amerchich – Marrakech' , '+212 5 24 30 46 92' , 'encg@uca.ma' , 'https://www.uca.ma/site/encg' , 'encg.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(4 , 'FMPM' , 'Faculté de Médecine et de Pharmacie de Marrakech' , 'Adresse postale: Sidi Abbad, B.P. 7010, Marrakech 40000' , '+212 5 24 33 98 99' , 'fmpmcontact@uca.ma' , 'https://www.uca.ma/site/fmpm' , 'fmpm.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(5 , 'FLSHM' , 'Faculté des Lettres et des Sciences Humaines' , 'Quartier Amerchich, B.P. 3737, 40000 Marrakech' , '+212 5 24 30 27 42' , 'contact@uca.ma' , 'https://www.uca.ma/site/flshm' , 'flshm.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(6 , 'FSTG' , 'Faculte des Sciences et Techniques Gueliz' , 'Bd. Abdelkrim El Khattabi , B.P. 618 Guéliz, 40000 Marrakech' , '+212 5 24 43 31 63 ' , 'contact@uca.ma' , 'https://www.uca.ma/site/fstgm' , 'fstgm.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(7 , 'ENSA-M' , 'Ecole Nationale des Sciences Appliquées de Marrakech' , 'Bd. Abdelkrim El Khattabi, B.P. 575 Guéliz, 40000 Marrakech' , '+212 5 24 43 47 45 ' , 'contact@uca.ma' , 'https://www.uca.ma/site/ensam' , 'ensam.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(8 , 'ENS-M' , ' Ecole Normale Supérieure Marrakech' , 'BP 2400 Hay Hassani 40000 Marrakech' , '+212 5 24 34 01 25 ' , ' contact@ens-marrakech.ac.ma' , 'https://www.uca.ma/site/ens' , 'ensm.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(9 , 'FPS' , 'Faculté Polydisciplinaire de SAFI' , 'Sidi Bouzid, B.P. 4162, 46000 SAFI - MAROC' , '+212 5 24 66 93 57 ' , 'secretariat.fps@uca.ac.ma' , 'https://www.uca.ma/site/fps' , 'fps.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(10 , 'ENSA-SAFI' , 'Ecole Nationale des Sciences Appliquées Safi' , 'oute Sidi Bouzid BP 63, 46000 SAFI' , '+212 5 24 66 91 55 ' , 'contact@uca.ma' , 'https://www.uca.ma/site/ensas' , 'ensas.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(11 , 'EST-SAFI' , 'Ecole Supérieure de Technologie Safi' , 'Route Dar Si Aïssa, B.P. 89, 46000 SAFI' , '+212 5 24 62 50 53' , ' contact.ests@uca.ma' , 'https://www.uca.ma/site/ests' , 'ests.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(12 , 'ESTE' , 'École Supérieure de Technologie, Essaouira' , 'Km 9, Route d''Agadir, Essaouira Aljadida BP. 383, Essaouira. Maroc' , '+212 5 24 79 20 64' , ' este@uca.ac.ma ' , 'https://www.uca.ma/site/este' , 'este.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(13 , 'CUKS' , 'Centre Universitaire, Kelâa des Sraghna' , 'Bureau de Poste -Centre Ville, BP 263, Avenue Mohammed V kelaa' , '+212 5 24 41 44 98' , ' contact@uca.ma ' , 'https://www.uca.ma/site/cuks' , 'cuks.png');

INSERT INTO establishment (ID_ESTA,ABRE_ESTA,NOM_ESTA,ADRESSE_ESTA,TELE_ESTA,EMAIL_ESTA,LINK_ESTA,PHOTO_ESTA)
VALUES(14 , 'FLAM' , 'Faculté de Langue Arabe de Marrakech' , 'Avenue Allal Fassi. B.P 1483 Marrakech' , '+212 524 303 647' , ' contact.flam@uca.ma' , 'https://www.uca.ma/site/flam' , 'flam.png');

/----------------------------   LA TABLE PROFESSEUR   --------------------------------/
CREATE TABLE professeur (
    ID_PROF NUMBER NOT NULL PRIMARY KEY,
    ID_ESTA NUMBER ,
    NOM_PROF VARCHAR2(30),
    PRENOM_PROF VARCHAR2(30),
    EMAIL_PROF VARCHAR2(60),
    CONSTRAINT FK_prof FOREIGN KEY (ID_ESTA)
    REFERENCES establishment(ID_ESTA)
    );
/----------------------------  INSERTION DES DONNEES DANS LA TABLE PROFESSEUR   --------------------------------/

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(1, 12, 'GUEZZAZ', 'Azidine', 'a.guzzaz@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(2, 12, 'BENKIRANE', 'Said', 'benkiranedut@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(3, 12, 'ZIAD', 'Lamia', 'ziad.lamia@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(4, 12, 'GOUNANE', 'Said', 's.gounane@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(5, 12, 'JOUHRI', 'Mustapha', 'm.jouhri@usms.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(6, 12, 'KARAMI', 'Fahd', 'f.karami@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(7, 12, 'ELMOURABIT', 'Idriss', 'idriss.el.mourabit.88@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(8, 12, 'MESKINI', 'Idriss', 'meskini.idriss@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(9, 1, 'DAMOU', 'Walid', 'w.damou@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(10, 2, 'ELAAROUB', 'Abdellah', 'abdouelaaroub@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(11, 3, 'ATANAN', 'Othmane', 'o.atanan@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(12, 4, 'QEZIBRI', 'Hiba', 'h.qezibri@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(13, 5, 'HAMOUICHOU', 'Khaoula', 'kh.hamouichou@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
values(14, 6, 'ELAHENYNY', 'Mohammed', 'm.elhenyny@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(15, 7, 'AAMICHA', 'FOUAD', 'f.aamicha@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(16, 8, 'ELAAROUB', 'Mohammed', 'm.elaaroub@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(17, 9, 'BOUSKID', 'Mohammed', 'f.bouskid@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(18, 10, 'CHOUHAD', 'Nadia', 'n.chouhad@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(19, 11, 'BOURFIAA', 'Youssef', 'y.bourfiaa@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(20, 13, 'EHIABI', 'Abderrahmane', 'a.rhiabi@gmail.com');

INSERT INTO professeur (ID_PROF, ID_ESTA, NOM_PROF, PRENOM_PROF, EMAIL_PROF)
VALUES(21, 14, 'ARTIL', 'Mohammed', 'meskini.idriss@gmail.com');

/----------------------------   LA TABLE FILIERE   --------------------------------/
CREATE TABLE filiere (
    ID_FILIERE NUMBER NOT NULL PRIMARY KEY,
    ID_ESTA NUMBER ,
    ABRE_FILIERE VARCHAR2(30),
    NOM_FILIERE VARCHAR2(100),
    CONSTRAINT FK_filiere FOREIGN KEY (ID_ESTA)
    REFERENCES establishment(ID_ESTA)
    );

/----------------------------  INSERTION DES DONNEES DANS LA TABLE FILIERE   --------------------------------/
INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(1,12,'IDSD','Informatique Décisionnelle et Science de Données');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(2,12,'GI','Génie Informatique');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(3,12,'ER','Energies Renouvelables');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(4,12,'TM','Techniques de Management');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(5,12,'GODT','Gestion des Organisations et des Destinations Touristiques');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(6,12,'GE','Génie de l''Environnement');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(7,1,'PH','PHYSIQUE');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(8,2,'EG','Economie et Gestion');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(9,3,'CO','Commerce');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(10,4,'P','Pharmacie');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(11,5,'DR','DROIT');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(12,6,'MIP','Mathématiques et Informatique appliqués aux Sciences de l''Ingénieur');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(13,7,'GM','Génie Mécanique');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(14,8,'PC','Physique-Chimie');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(15,9,'FR','Français');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(16,10,'GC','Génie Civil');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(17,11,'TM','Techniques de Management');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(18,13,'EC','ECONOMIE');

INSERT INTO filiere(ID_FILIERE,ID_ESTA,ABRE_FILIERE,NOM_FILIERE)
VALUES(19,14,'AR','ARABE');
/----------------------------   LA TABLE SENDER   --------------------------------/
CREATE TABLE sender (
    ID_SEN NUMBER NOT NULL PRIMARY KEY,
    NOM_SEN VARCHAR2(40),
    PRENOM_SEN VARCHAR2(40),
    TELE_SEN VARCHAR2(30),
    EMAIL_SEN VARCHAR2(60)
    );
    
INSERT INTO sender (ID_SEN, NOM_SEN, PRENOM_SEN, TELE_SEN, EMAIL_SEN)
VALUES(1, 'ELAAROUB', 'Abdellah', '+(212)6 41 85 44 28', 'abdouelaaroub@gmail.com');

INSERT INTO sender (ID_SEN, NOM_SEN, PRENOM_SEN, TELE_SEN, EMAIL_SEN)
VALUES(2, 'DAMOU', 'Walid', '+(212)6 96 62 87 10', 'damou.walid.2015@gmail.com');

INSERT INTO sender (ID_SEN, NOM_SEN, PRENOM_SEN, TELE_SEN, EMAIL_SEN)
VALUES(3, 'ATANAN', 'Othman', '+(212)6 41 85 44 28', 'o.atanan@gmail.com');
/----------------------------   LA TABLE MESSAGE   --------------------------------/

select to_date(message.DATE_MES, 'DD-MM-YYYY'), sender.nom_sen, sender.prenom_sen, sender.email_sen from message, sender
where message.ID_SEN = sender.ID_SEN;

CREATE TABLE message (
    ID_MES NUMBER NOT NULL PRIMARY KEY,
    ID_SEN NUMBER ,
    TEXT_MES VARCHAR2(1024),
    DATE_MES DATE,
    CONSTRAINT FK_mes FOREIGN KEY (ID_SEN)
    REFERENCES sender(ID_SEN)
    );

INSERT INTO message (ID_MES, ID_SEN, TEXT_MES, DATE_MES)
VALUES(1, 1, 'Hello admin, this is a test for new message from abdellah elaaroub. :) Enjoy besty..', '03/01/2021');

INSERT INTO message (ID_MES, ID_SEN, TEXT_MES, DATE_MES)
VALUES(2, 2, 'Hello admin, this is a test for new message from walid damou. :) Enjoy besty..', '04/01/2021');

INSERT INTO message (ID_MES, ID_SEN, TEXT_MES, DATE_MES)
VALUES(3, 3, 'Hello admin, this is a test for new message from othmane atnan. :) Enjoy besty..', '05/01/2021');


/----------------------------   LA TABLE ADMINISTRATEUR   --------------------------------/
CREATE TABLE administrateur (
    ID_ADMIN NUMBER NOT NULL PRIMARY KEY,
    NOM_ADMIN VARCHAR2(30),
    PRENOM_ADMIN VARCHAR2(30),
    LOGIN_ADMIN VARCHAR2(50),
    PASSWORD_ADMIN VARCHAR2(50),
    EMAIL_ADMIN VARCHAR2(60)
    );
/----------------------------  INSERTION DES DONNEES DANS LA TABLE ADMINISTRATEUR   --------------------------------/
INSERT INTO administrateur (ID_ADMIN, NOM_ADMIN, PRENOM_ADMIN, LOGIN_ADMIN, PASSWORD_ADMIN, EMAIL_ADMIN)
VALUES(1, 'ELAAROUB', 'Abdellah','ELAAROUB_Abdellah','IDSD2', 'abdouelaaroub@gmail.com');

INSERT INTO administrateur (ID_ADMIN, NOM_ADMIN, PRENOM_ADMIN, LOGIN_ADMIN, PASSWORD_ADMIN, EMAIL_ADMIN)
VALUES(2, 'DAMOU', 'Walid','DAMOU_Walid','IDSD2', 'walid.damou.2015@gmail.com');
/----------------------------   LA TABLE UNIVERSITY   --------------------------------/
CREATE TABLE university (
    ID_UNIV NUMBER NOT NULL PRIMARY KEY,
    ABRE_UNIV VARCHAR2(6),
    DATE_CREATION_UNIV DATE,
    REGION_UNIV VARCHAR2(30),
    DESCRIPTION_UNIV VARCHAR2(1024),
    LINK_UNIV VARCHAR2(50),
    PHOTO_UNIV VARCHAR2(30)
    );
/----------------------------  INSERTION DES DONNEES DANS LA TABLE UNIVERSITY   --------------------------------/
INSERT INTO university (ID_UNIV, ABRE_UNIV, DATE_CREATION_UNIV, REGION_UNIV, DESCRIPTION_UNIV, LINK_UNIV, PHOTO_UNIV)
VALUES(1, 'UCA', '29/05/1978', 'Marrakech Safi','L''UCA est une jeune université, créée en 1978, qui n''a cessé d''évoluer et de confirmer son positionnement au niveau national et international autant par l''évolution de son effectif d''étudiants que par la diversification de son offre de formation ou encore par la recherche et le rayonnement national et international.', 'https://www.uca.ma/','uca.png');

commit;



