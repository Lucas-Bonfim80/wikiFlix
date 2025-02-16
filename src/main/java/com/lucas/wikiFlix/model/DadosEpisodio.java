package com.lucas.wikiFlix.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo, @JsonAlias("Episode") Integer numero, @JsonAlias("imdbRating") String Avaliacao, @JsonAlias("Released") String data) {
}
