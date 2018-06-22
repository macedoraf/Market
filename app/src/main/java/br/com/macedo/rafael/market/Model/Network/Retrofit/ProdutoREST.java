package br.com.macedo.rafael.market.Model.Network.Retrofit;

import java.util.List;

import br.com.macedo.rafael.market.Model.Entity.Produto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProdutoREST {

    @GET
    Call<List<Produto>> getProdutos();




}
