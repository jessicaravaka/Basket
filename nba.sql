INSERT INTO Equipe Values (1, 'Los Angeles Lakers'),
                          (2, 'Golden State Warriors'),
                          (3, 'Chicago Bulls'),
                          (4, 'Boston Celtics');

INSERT into Joueur Values (1, 'LeBron James', 6, 1),
                          (2, 'Anthony Davis', 3, 1),
                          (3, 'Russel Westbrook', 0, 1),
                          (4, 'Stephen Curry', 30, 2),
                          (5, 'Klay Thompson', 11, 2),
                          (6, 'Draymond Green', 23, 2); 

CREATE TABLE Action (
    id SERIAL NOT NULL PRIMARY KEY,
    idMatch INTEGER,
    idJoueur INTEGER,
    passeDecisive INTEGER,
    ballePerdu INTEGER,
    interception INTEGER,
    contreMatch INTEGER,
    faute INTEGER,
    FOREIGN KEY (idMatch) REFERENCES Match(id),
    FOREIGN KEY (idJoueur) REFERENCES Joueur(id)
);

CREATE TABLE Tirs (
    id SERIAL NOT NULL PRIMARY KEY,
    tir INTEGER,
    troisPoints INTEGER,
    lancerFront INTEGER,
    idMatch INTEGER,
    idJoueur INTEGER,
    FOREIGN KEY (idMatch) REFERENCES Match(id),
    FOREIGN KEY (idJoueur) REFERENCES Joueur(id)
);

CREATE TABLE Rebond (
    id SERIAL NOT NULL PRIMARY KEY,
    rbOffensive INTEGER,
    rbDefensive INTEGER,
    idMatch INTEGER,
    idJoueur INTEGER,
    FOREIGN KEY (idMatch) REFERENCES Match(id),
    FOREIGN KEY (idJoueur) REFERENCES Joueur(id)
);

CREATE VIEW actionTir_view
SELECT  
FROM Actions
JOIN
