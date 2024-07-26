MySQL Queries: 

Create Database JRTP;

CREATE TABLE 'ORDR_DTLS' (
  'ORDER_ID' bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

Insert into ORDR_DTLS VALUES(0);

select * from ORDR_DTLS;

drop table ordr_dtls;

truncate table ordr_dtls;