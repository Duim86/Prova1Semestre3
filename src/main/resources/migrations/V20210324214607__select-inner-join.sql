SELECT data, horario, nome
FROM sessoes
         INNER JOIN filmes ON sessoes.filmes_id = filmes.filmes_id;