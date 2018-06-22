package br.com.macedo.rafael.market.Model.Network;

import java.io.IOException;
import java.util.List;

import br.com.macedo.rafael.market.Model.Entity.Produto;
import br.com.macedo.rafael.market.Model.Network.Retrofit.ProdutoREST;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {

    private static final String BASE_URL = "";
    private Retrofit retrofit;
    private ProdutoREST service;

    public Service() {

        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(ProdutoREST.class);
    }

    public List<Produto> getProduto() throws IOException {
        return service.getProdutos().execute().body();
    }
}
