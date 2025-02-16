package com.lucas.wikiFlix.service;

public interface IConberteDados {
    <T> T obterDados(String json, Class<T> classe);
}
