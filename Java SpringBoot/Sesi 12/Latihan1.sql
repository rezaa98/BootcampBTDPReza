CREATE DATABASE MELODI_INDAH;

DROP TABLE IF EXISTS musisi;
CREATE TABLE musisi (
    ssn INT (50) NOT NULL,
    nama VARCHAR (50) NOT NULL,
    alamat VARCHAR (50) NULL,
    no_telp VARCHAR (50) NOT NULL,
    id_album INT(50) NOT NULL,
    CONSTRAINT musisi_ssn_pk PRIMARY KEY(ssn)
    );

CREATE TABLE ALBUM(
    ID_ALBUM INT (50) NOT NULL,
    TGL_COPYRIGHT DATE NOT NULL,
    FORMAT VARCHAR (50) NOT NULL,
    JUDUL VARCHAR (50) NOT NULL,
    CONSTRAINT ALBUM_ID_PK PRIMARY KEY (ID_ALBUM)
);

CREATE TABLE lagu(
    judul VARCHAR (50) NOT NULL,
    pengarang VARCHAR (50) NOT NULL,
    ssn INT (50) NOT NULL,
    CONSTRAINT lagu_judul_fk PRIMARY KEY (judul),
    CONSTRAINT penyanyi FOREIGN key (ssn)
    REFERENCES musisi (ssn)
);

DROP TABLE IF EXISTS INSTRUMENT;
CREATE TABLE INSTRUMENT (
    NAMA VARCHAR (50) NOT NULL,
    KUNCI_MUSIK VARCHAR (50) NOT NULL,
    CONSTRAINT NAMA_INSTRUMENT PRIMARY KEY (NAMA)
);

ALTER TABLE MUSISI ADD CONSTRAINT NAMA_INSTRUMENT_FK FOREIGN KEY (NAMA_INSTR) REFERENCES INSTRUMENT(NAMA);

ALTER TABLE MUSISI ADD CONSTRAINT ALBUM_ID_PK FOREIGN KEY (ID_ALBUM) REFERENCES ALBUM(ID_ALBUM);

ALTER TABLE MUSISI ADD CONSTRAINT ALBUM_ID_FK FOREIGN KEY (ID_ALBUM) REFERENCES ALBUM(ID_ALBUM);

ALTER TABLE ALBUM ADD CONSTRAINT ALBUM_LAGU_FK FOREIGN KEY (JUDUL) REFERENCES LAGU(JUDUL);



INSERT INTO musisi VALUES (1, 'Reza Yusuf Maulana', 'Melati Mas',08123456789, 23)
                            (2, 'Maulana Yusuf Reza', 'Mas Melati', 08223123123, 22)
                            (3, 'Yusuf Reza Maulana', 'Mas Mas', 082212913234, 21);

INSERT INTO ALBUM VALUES (23, 12-12-2023, 'mp3', 'ketika cinta tak terbalas')
                         (22, 13-01-2024, 'vsc', 'when i was your man')
                         (21, 14-02-2024, 'flac', 'ketika mimpimu yang begitu indah');

INSERT INTO LAGU VALUES('ketika cinta tak terbalas', 'adam levine', 1)  
                        ('when i was your man', 'lisa', 2)  
                        ('ketika mimpimu yang begitu indah', 'aimer', 3);  

INSERT INTO INSTRUMENT VALUES ('ukulele', 'C mayor')      
                                ('gitar', 'C minor')    
                                ('piano', 'd mayor')   ;                        

CREATE TABLE ALBUM(
    ID_ALBUM INT (50) NOT NULL,
    TGL_COPYRIGHT DATE NOT NULL,
    FORMAT VARCHAR (50) NOT NULL,
    JUDUL VARCHAR (50) NOT NULL,
    CONSTRAINT ALBUM_ID_PK PRIMARY KEY (ID_ALBUM)
);
CREATE TABLE lagu(
    judul VARCHAR (50) NOT NULL,
    pengarang VARCHAR (50) NOT NULL,
    ssn INT (50) NOT NULL,
    CONSTRAINT lagu_judul_fk PRIMARY KEY (judul),
    CONSTRAINT penyanyi FOREIGN key (ssn)
    REFERENCES musisi (ssn)
);

DROP TABLE IF EXISTS INSTRUMENT;
CREATE TABLE INSTRUMENT (
    NAMA VARCHAR (50) NOT NULL,
    KUNCI_MUSIK VARCHAR (50) NOT NULL,
    CONSTRAINT NAMA_INSTRUMENT PRIMARY KEY (NAMA)
);
