DROP TABLE IF EXISTS CRIME;
CREATE TABLE CRIME(
   ID              INTEGER  NOT NULL PRIMARY KEY 
  ,STATISTIC_LABEL VARCHAR(41) NOT NULL
  ,YEAR_DATE       VARCHAR(6) NOT NULL
  ,DIVISION        VARCHAR(35) NOT NULL
  ,OFFENCE         VARCHAR(73) NOT NULL
  ,UNIT            VARCHAR(6) NOT NULL
  ,AMOUNT          INTEGER  NOT NULL
);
INSERT INTO CRIME(ID,STATISTIC_LABEL,YEAR_DATE,DIVISION,OFFENCE,UNIT,AMOUNT) VALUES (1,'Recorded Crime Offences under Reservation','2003Q1','Cavan/Monaghan Garda Division','Homicide offences','Number',1);
INSERT INTO CRIME(ID,STATISTIC_LABEL,YEAR_DATE,DIVISION,OFFENCE,UNIT,AMOUNT) VALUES (2,'Recorded Crime Offences under Reservation','2003Q1','Cavan/Monaghan Garda Division','Murder','Number',0);
INSERT INTO CRIME(ID,STATISTIC_LABEL,YEAR_DATE,DIVISION,OFFENCE,UNIT,AMOUNT) VALUES (3,'Recorded Crime Offences under Reservation','2003Q1','Cavan/Monaghan Garda Division','Manslaughter','Number',0);