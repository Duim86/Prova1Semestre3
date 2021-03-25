INSERT INTO cinema (nome, rua, numero, complemento, bairro, cidade, estado)
VALUES ('Cine Cataratas', 'Avenida Parana', '1058', 'Shopping JL', 'Centro', 'Foz do Iguacu', 'Parana');
INSERT INTO cinema (nome, rua, numero, complemento, bairro, cidade, estado)
VALUES ('Cinemark', 'Avenida das Cataratas', '5025', 'Shopping Catuai', 'Vila Yolanda', 'Foz do Iguaçu', 'Parana');

INSERT INTO filmes (nome, descrição, diretor, atores, genero)
VALUES ('Fight Club',
        'An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more.',
        ' David Fincher', 'Brad Pitt, Edward Norton', 'Drama');
INSERT INTO filmes (nome, descrição, diretor, atores, genero)
VALUES ('Pulp Fiction',
        'The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.',
        'Quentin Tarantino', 'John Travolta, Uma Thurman', 'Crime, Drama');
INSERT INTO filmes (nome, descrição, diretor, atores, genero)
VALUES ('The Godfather',
        'An organized crime dynasty\'s aging patriarch transfers control of his clandestine empire to his reluctant son.',
        'Francis Ford Coppola', 'Marlon Brando, Al Pacino', 'Crime, Drama ');
INSERT INTO filmes (nome, descrição, diretor, atores, genero)
VALUES ('Seven',
        'Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.',
        'David Fincher', 'Morgan Freeman, Brad Pitt,', 'Crime, Drama');
INSERT INTO filmes (nome, descrição, diretor, atores, genero)
VALUES ('Forrest Gump',
        'The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.',
        'Robert Zemeckis', 'Tom Hanks, Robin Wright', 'Drama, Romance');

INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '16:30:00', '1', '1', '1');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '16:30:00', '3', '1', '3');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '16:30:00', '5', '2', '4');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '17:30:00', '5', '2', '2');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '17:30:00', '5', '1', '5');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '17:30:00', '5', '2', '1');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '18:40:00', '5', '2', '3');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '18:40:00', '5', '1', '4');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '21:30:00', '5', '2', '4');
INSERT INTO sessoes (data, horario, sala, cinema_id, filmes_id)
VALUES ('2021-03-25', '21:30:00', '5', '2', '5');

