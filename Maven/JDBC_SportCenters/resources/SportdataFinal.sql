drop table inschrijving;
drop table kamp;
drop table sporttak;
drop table sportcentrum;
drop table deelnemer;
drop sequence deelnemer_seq RESTRICT;
drop sequence kamp_seq RESTRICT;
drop sequence sporttak_seq RESTRICT;


create table deelnemer(
id            int         primary key,
deelnemernaam varchar(30)  not null,
voornaam      varchar(20)  not null,
geboortedatum date         not null, 
geslacht      char(1)      not null,
straat        varchar(30)  not null,
huisnummer    varchar(6) not null,
bus           int,
postcode      int not null,
woonplaats    varchar(30),
telefoon      varchar(10),
gsm           varchar(15),
email         varchar(40)
);

create sequence deelnemer_seq AS INT START WITH 1;

insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Faes','Annick', '01/22/1999' ,'V', 'Verloren hoek','159',null,3920,'Lommel','011/545855','0498/741147','Annick_Faes@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Bareta','Wouter','10/15/2001' ,'M','Scheyerveld','26',null,3640,'Kinrooi','011/658414','0498/657198    ','Wouter_Bareta@belgacom.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'De Ridder','Stijn','06/03/2003' ,'M','Veestraat','2',null,2360,'Oud-Turnhout','014/417352','0497/743970    ','stijn.de.ridder@pandora.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Neefs','Robby','08/03/2002' ,'M','Paalseweg','125',null,3980,'Tessenderlo','013/661471','0498/458970    ','Robby_Neefs@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Stinckens','An','04/14/1999' ,'V','Dongenblok','10',null,2431,'Laakdal-Veerle','014/849503','0474/852258','An_Stinckens@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Van Loon','Sara','05/03/1999' ,'V','Nieuwstraat','83',null,2430,'Laakdal','013/667641','0496/965478','Sara_Van Loon@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Cortens','Bert','10/03/2002' ,'M','Gerkenbergstraat','68',null,3960,'Bree','089/484418','0486/632563','Bert_Cortens@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Wellens','Kristof','07/03/2004' ,'M','Ernest Claesstraat','59',1,2200,'Herentals','014/231214','0486/545421','Kristof_Wellens@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Waegenaere','Brenda','02/05/2000' ,'V','Nieuwland','21',null,2440,'Geel','014/582222','0498/657198    ','Brenda_Waegenaere@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Smekens','Leo','12/03/1998' ,'M','Sint-Annastraat','34',null,3050,'Oud-Heverlee','016/447550','0499/434843    ','Leo_Smekens@belgacom.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Wuyts','Ellen','03/21/2005' ,'V','Eikenlei','46',null,2280,'Grobbendonk','014/516976','0484/963253','Ellen_Wuyts@telenet.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Van Deun','Steven','07/20/1998' ,'M','Vieille-Montagnestraat','5',null,2400,'Mol','014/811714','0473/520140','steven.van.deun@kke.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Geelen','Kevin','05/13/2002' ,'M','Hommelbeek','18',null,3980,'Tessenderlo','013/661250','0498/962014','Kevin_Geelen@belgacom.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Heiremans','Liesbeth','10/03/2000' ,'V','Molenweg','4',null,3294,'Diest-Molenstede','013/323325','0497/458700','Liesbeth_Heiremans@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Wellens','Dennis','05/03/2004' ,'M','Tulpenstraat','32',null,2430,'Laakdal-Eindhout','014/869839','0496/560214','Dennis.Wellens@telenet.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Stes','Koen','07/03/1997' ,'M','Boerenkrijglaan','193',null,2260,'Westerlo','014/541122','0472/577563    ','Koen_Stes@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'De Weert','Dave','07/03/1998' ,'M','Brooseinde','42',1,2360,'Oud-Turnhout','014/450188','0473/289005    ','davedw@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Vanlommel','Rik','12/03/1996' ,'M','Halensebaan','126',null,3290,'Diest','013/313874','0473/505072    ','rik_Vanlommel@telenet.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Bertels','Maarten','10/07/1998' ,'M','Diestsebaan','55',null,2230,'Herselt','014/546447','0473/599357    ','Maarten_Bertels@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Brughmans','Sarah','07/03/2000' ,'V','Langstraat','9',null,2260,'Westerlo','014/540269','0473/850410','Sarah_Brughmans@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Goetschalckx','Stefaan','09/03/1998' ,'M','Wielewaalstraat','34',null,2440,'Geel','014/587664','0474/630219','Stefaan_Goetschalckx@telenet.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Verellen','Lies','07/16/2004' ,'V','Bochtstraat','12',null,3920,'Lommel','011/551836','0477/600724    ','Lies_Verellen@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Hofkens','Peter','02/03/2002' ,'M','Merellaan','9',null,2460,'Kasterlee','014/854522','0479/683063    ','Peter_Hofkens@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Moerkens','Sophie','11/08/1999' ,'V','Brigandstraat','12',null,2490,'Balen','014/651425','0486/325920    ','Sophie_Moerkens@hotmail.com' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Van Deuren','Jan','07/03/1990' ,'M','Pijnboomstraat','3',null,2480,'Dessel','014/377458','0493/505215    ','jvdeuren@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Van Goethem','Kim','09/03/1997' ,'V','Hoebenschot','7',null,2460,'Kasterlee','014/552933','0487/852014','kim.van.goethem@telene.be' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Smeyers','Wendy','12/09/1996' ,'V','St-Carolusstraat','21',null,2400,'Mol','011/542732','0496/234512','Wendy_Smeyers@belgacom.be' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Hendrickx','Joris','03/17/1997' ,'M','Lammerdries','17',null,2250,'Olen','014/217531','0495/112442','Joris_Hendrickx@hotmail.com' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Hendrix','Stijn','05/10/2004' ,'M','Koppeleershoeven','5',null,2440,'Geel','014/584908','0474/447870    ','Stijn_Hendrix@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Geelen','Bart','11/18/2002' ,'M','Krakelaarsveld','31',null,2200,'Herentals','014/210922','0474/606101    ','Bart_Geelen@belgacom.be' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Verlinden','Lucas','09/03/1999' ,'M','Balen-Neetlaan','14',null,2400,'Mol','014/813970','0474/897987    ','Lucas_Verlinden@hotmail.com' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Verhulst','Matthias','06/11/2000' ,'M','Dwarsstraat','21',null,3945,'Ham','013/666147','0477/195962    ','Matthias_Verhulst@telenet.be' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Adriaenssen','Kristof','01/19/1998' ,'M','Klaproosstraat','12',null,2340,'Beerse','014/714956','0473/874112','Kristof_Adriaenssen@belgacom.be' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Borders','Mathias','04/12/2001' ,'M','Vlasbloemlaan','7',null,2070,'Zwijndrecht','013/672356','0474/875219','Mathias_Borders@hotmail.com' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Bellen','Tom','09/03/2003' ,'M','Molsekiezel','171',null,3920,'Lommel','011/545589','0499/632630','Tom_Bellen@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Meir','Carl','03/03/1998' ,'M','Vliegplein','87',null,2180,'Ekeren (Antwerpen)','011/545589','0498/542325','Carl_Meir@telenet.be' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Van Opstal','Dieter','11/03/2004' ,'M','Kleine Puttingbaan','90',null,2560,'Nijlen-Kessel','03/4884531','0494/167920    ','dietertje@hotmail.com' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Vlekken','Kevin','08/13/2001' ,'M','Rijsberg 2','2',null,2490,'Balen','014/719963','0495/405085    ','Kevin_Vlekken@telenet.be' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Waegenaere','Dave','06/03/1996' ,'M','Zavelstraat','6',null,2290,'Vorselaar','014/214578','0495/999386    ','Dave_Waegenaere@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Lowette','Katelijne','12/27/2005' ,'V','Oostmalsebaan','86',null,2960,'Brecht','03/3130644','0496/074004    ','Katelijne_Lowette@belgacom.be' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Van Beirendonck','Tim','02/25/2003' ,'M','Glazeniersstraat 18','18',null,2300,'Turnhout','014/425289','0496/877867    ','timvanbeiren@hotmail.com' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'De Ridder','Timothy','08/11/2001' ,'M','Gildenstraat','56',null,2470,'Retie','014/370775','0497/166550    ','timothy54@hotmail.com' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Gijbels','Kristof','04/04/1999' ,'M','Heiveld','30',null,3980,'Tessenderlo','013/337743','0497/335588    ','Kristof_Gijbels@hotmailcom' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Jacobs','Kevin','11/03/2003' ,'M','Schansstraat','11',null,2431,'Laakdal-Veerle','014/840204','0473/412365','Kevin_Jacobs@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Theunis','Nicky','11/03/1998' ,'V','Hermelijn','',null,2221,'Booischot','015/225953','0474/652322','Nicky_Theunis@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Versmissen','Ken','06/03/1998' ,'M','Keirlandse Zillen','21',null,2400,'Mol','014/512930','0493/542122','Ken_Versmissen@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Goris','Marc','10/05/1998' ,'M','Graatakker','131',7,2300,'Turnhout','014/417788','0495/784785','Marc_Goris@belgacom.be');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Tombeur','Isabelle','01/23/2001' ,'V','Geelsebaan','29',2,2460,'Kasterlee','014/852718','0477/986585','Isabelle_Tombeur@hotmail.com');
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'De Backer','Inge','08/24/2005' ,'V','Turnhoutsebaan','18',3,2480,'Dessel','014/372045','0477/252514','ingetje@hotmail.com' );
insert into deelnemer values (NEXT VALUE FOR deelnemer_seq,'Gysen','Britt','02/26/1997' ,'V','Klaterstraat','19',null,2310,'Rijkevorsel','03/3142399','0493/981245','Britt_Gysen@telenet.be');



create table sportcentrum(
id                int 	     not null,
centrumnaam       varchar(50)  not null,
straat            varchar(30)  not null,
huisnummer        varchar(6) not null,
postcode          int not null,
woonplaats        varchar(30),
telefoon          varchar(10),
primary key (id)
);


insert into sportcentrum
values (1,'Herentals Netepark','Vorselaarsebaan','60',2200,'Herentals','014 859512');
insert into sportcentrum
values (2,'Tongeren','Hasseltsebaan','4',3600,'Tongeren','011 300810');
insert into sportcentrum
values (3,'Geraardsbergen','Stw op Gent','52',9500,'Geraardsbergen','09 8559510');
insert into sportcentrum
values (4,'Nieuwpoort','Burgse Steenweg 9','52',8620,'Nieuwpoort','058 235891');


create table sporttak(
id               int 	        not null,
omschrijving	varchar(50)  not null, 
primary key (id)
);

create sequence sporttak_seq AS INT START WITH 1;

insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Omnisport');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Tennis');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Atletiek');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Gymnastiek');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Zeilen');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Basket');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Volleybal');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Paardrijden');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Badminton');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Voetbal');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Kajak');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Judo');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Ropeskipping');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Dans');
insert into sporttak values (NEXT VALUE FOR sporttak_seq,'Windsurfen');

create table kamp(
id              int 	     not null,
centrum_id      int	not null,
kampnaam            varchar(50) not null,
begindatum      date	not null,
einddatum       date	not null,
sporttak_id     int	not null,
min_gebjaar     int not null,
max_gebjaar     int not null,
prijs           numeric(8, 2) not null,
aantal_plaatsen	numeric(4, 0) not null, 
primary key (id), 
foreign key (centrum_id) references sportcentrum (id), 
foreign key (sporttak_id) references sporttak (id)
);

create sequence kamp_seq AS INT START WITH 1;

insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Paardrijden en verzorgen voor beginnelingen','2018-08-13','2018-08-17',8,1999,2003,287,10);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Paardrijden en verzorgen voor beginnelingen','2018-07-30','2018-08-03',8,1999,2003,287,10);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Atletiek: zevenkamp','2018-08-20','2018-08-24',3,2000,2004,207,12);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Kajak en jeugdzeilen','2018-07-02','2018-07-06',11,2000,2004,223,12);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Kajak: A-brevet','2018-08-20','2018-08-24',11,1998,2001,223,12);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Atletiek: vijfkamp','2018-07-09','2018-07-13',3,1998,2002,207,15);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Atletiek: vijfkamp','2018-08-06','2018-08-10',3,1998,2002,207,15);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Zeilen met 4.20','2018-08-13','2018-08-17',5,1998,2002,223,15);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Zeilen met 4.20','2018-07-09','2018-07-13',5,1998,2002,223,15);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'All-in-one','2018-07-02','2018-07-06',1,1995,1998,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'All-in-one','2018-08-13','2018-08-17',1,1995,1998,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Basket: teener','2018-07-23','2018-07-27',6,1998,2002,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Beachsport','2018-08-20','2018-08-24',7,2000,2004,207,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Gymnastiek: acrogym','2018-07-02','2018-07-06',4,2000,2004,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Gymnastiek: acrogym','2018-07-16','2018-07-20',4,1998,2002,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Gymnastiek: acrogym','2018-08-06','2018-08-10',4,1995,2000,207,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Gymnastiek: trampoline en tumbling','2018-07-23','2018-07-27',4,1998,2002,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Gymnastiek: trampoline en tumbling','2018-08-13','2018-08-17',4,1995,2000,207,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Roeien en jeugdzeilen','2018-07-02','2018-07-06',5,2000,2004,207,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Roeien en jeugdzeilen','2018-07-30','2018-08-03',5,2000,2004,207,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Vijfkamp en omnisport','2018-07-09','2018-07-13',1,2000,2004,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Voetbal','2018-07-02','2018-07-06',10,2000,2004,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Voetbal','2018-07-16','2018-07-20',10,2000,2004,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Voetbal','2018-07-23','2018-07-27',10,1998,2001,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Voetbal','2018-08-20','2018-08-24',10,1998,2001,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Voetbal','2018-07-30','2018-08-03',10,1995,1998,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Voetbal','2018-08-13','2018-08-17',10,1995,1998,203,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Volleybal en beachvolley','2018-07-09','2018-07-13',7,1998,2002,207,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Volleybal en beachvolley','2018-08-06','2018-08-10',7,1998,2002,207,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Windsurfen voor beginnelingen','2018-07-02','2018-07-06',15,1998,2002,227,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Windsurfen voor beginnelingen','2018-08-13','2018-08-17',15,1994,1998,227,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Windsurfen: evolutie 1','2018-07-30','2018-08-03',15,1998,2002,227,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Windsurfen: evolutie 1','2018-07-16','2018-07-20',15,1994,1998,227,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Windsurfen: evolutie 1','2018-07-23','2018-07-27',15,1994,1998,227,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Zeilen (optimist)','2018-08-06','2018-08-10',5,1998,2002,223,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,4,'Zeilen (optimist)','2018-08-20','2018-08-24',5,2000,2004,223,20);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Badminton en omnisport','2018-07-23','2018-07-27',9,2000,2004,203,25);
insert into kamp values (NEXT VALUE FOR kamp_seq,1,'Badminton en omnisport','2018-08-06','2018-08-10',9,1998,2001,203,25);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Basket: junior pro','2018-07-16','2018-07-20',6,1998,2002,203,25);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Basketbal en omnisport','2018-07-09','2018-07-13',6,2000,2004,203,25);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Judo voor gevorderden','2018-07-23','2018-07-27',12,1998,2001,207,25);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Tennis ','2018-07-16','2018-07-20',2,2000,2004,223,25);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Tennis ','2018-07-30','2018-08-03',2,1998,2002,223,25);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Dans: funky dance','2018-08-20','2018-08-24',14,1995,1998,203,30);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Dans: hiphop','2018-07-16','2018-07-20',14,1998,2002,203,30);
insert into kamp values (NEXT VALUE FOR kamp_seq,2,'Dans: hiphop','2018-07-30','2018-08-03',14,1995,1998,203,30);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Ropeskipping en dansatelier','2018-07-09','2018-07-13',13,1998,2002,203,30);
insert into kamp values (NEXT VALUE FOR kamp_seq,3,'Ropeskipping en dansatelier','2018-08-06','2018-08-10',13,2000,2004,203,30);



create table inschrijving(
deelnemer_id	int		not null, 
kamp_id		int		not null, 
datum		date, 
primary key (deelnemer_id, kamp_id), 
foreign key (deelnemer_id) references deelnemer (id), 
foreign key (kamp_id) references kamp (id)
);

insert into inschrijving values (12, 1, '2018-04-07');
insert into inschrijving values (1, 4, '2018-04-07');
insert into inschrijving values (32, 31, '2018-04-15');
insert into inschrijving values (13, 17, '2018-04-24');
insert into inschrijving values (14, 26, '2018-04-17');
insert into inschrijving values (5, 11, '2018-04-18');
insert into inschrijving values (26, 24, '2018-03-07');
insert into inschrijving values (50, 12, '2018-04-07');
insert into inschrijving values (33, 19, '2018-04-07');
insert into inschrijving values (19, 30, '2018-04-15');
insert into inschrijving values (47, 35, '2018-03-24');
insert into inschrijving values (14, 45, '2018-04-17');
insert into inschrijving values (44, 19, '2018-04-18');
insert into inschrijving values (39, 22, '2018-03-07');