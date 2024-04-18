CREATE TABLE Motorvogn
(
    id SERIAL NOT NULL,
    eierPersonNr VARCHAR(255) NOT NULL,
    eiersNavn VARCHAR(255) NOT NULL,
    eiersAdresse VARCHAR(255) NOT NULL,
    kjennetegn VARCHAR(255) NOT NULL,
    bilMerke VARCHAR(255) NOT NULL,
    biltype VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
    FOREIGN KEY (bilType) references Biler(bilType)
);
CREATE TABLE Biler
(
    bilMerke VARCHAR(255) NOT NULL,
    bilType    VARCHAR(255) NOT NULL,
    PRIMARY KEY (bilType)
);