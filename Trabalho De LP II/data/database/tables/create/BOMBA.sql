CREATE TABLE IF NOT EXISTS BOMBA (
	idBomba INT,
	tipo VARCHAR (10),
	preco DECIMAL (3,2),
	idPosto INT,
	PRIMARY KEY (idBomba),
	FOREIGN KEY (idPosto) REFERENCES POSTO(idPosto)
);
