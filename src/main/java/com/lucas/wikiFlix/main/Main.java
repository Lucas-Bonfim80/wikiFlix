package com.lucas.wikiFlix.main;

import com.lucas.wikiFlix.model.DadosSerie;
import com.lucas.wikiFlix.model.DadosTemporada;
import com.lucas.wikiFlix.service.ConsumindoApi;
import com.lucas.wikiFlix.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private Scanner leitura = new Scanner(System.in);

    private ConsumindoApi consumindoApi = new ConsumindoApi();

    private ConverteDados converte = new ConverteDados();

    private final String ENDERECO = "http://www.omdbapi.com/?t=";

    private final String API_KEY = "&apikey=e398ce53";



    public void exibeMenu() {
        System.out.println("Digite o nome da série");
        var nomeSerie = leitura.nextLine();
        var json = consumindoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = converte.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemps(); i++) {
            json = consumindoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = converte.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
    }
}
