DROP TABLE IF EXISTS crime;

CREATE TABLE crime(
   Id INTEGER PRIMARY KEY AUTOINCREMENT,
   STATISTIC_Label VARCHAR(41) NOT NULL,
   Year_Quarter    VARCHAR(6) NOT NULL,
   DIVISION  VARCHAR(35) NOT NULL,
   TYPEOFFENCE VARCHAR(73) NOT NULL,
   UNIT            VARCHAR(6) NOT NULL,
   AMOUNT          INTEGER  NOT NULL
);

INSERT INTO crime(STATISTIC_Label,Year_Quarter,DIVISION,TYPEOFFENCE,UNIT,AMOUNT) 
VALUES ('Recorded Crime Offences under Reservation','2003Q1','Cavan/Monaghan GardaDivision','Homicide offences','Number',1);

INSERT INTO crime(STATISTIC_Label,Year_Quarter,DIVISION,TYPEOFFENCE,UNIT,AMOUNT) 
VALUES ('Recorded Crime Offences under Reservation','2003Q1','Cavan/Monaghan Garda Division','Murder','Number',0);