package br.com.macedo.rafael.market.Domain;

import android.content.Context;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.macedo.rafael.market.Domain.Network.Retrofit.Service;
import br.com.macedo.rafael.market.MVP;
import br.com.macedo.rafael.market.Model.Cache.MarketDatabase;
import br.com.macedo.rafael.market.Model.Entity.Produto;


public class ProdutoPresenter implements MVP.Presenter<Produto> {

    private MVP.View view;


    public void setView(MVP.View view) {
        this.view = view;
    }

    @Override
    public List<Produto> getDados() {
        try {
            //TODO RESPONSABILIDADE DA MODEL TIRAR DAQUI DEPOIS
            //TODO VAI SER INJECAO DE DEPENDECIA RETORNANDO DO SERVICE OU DO BANCO
            new Service().getProduto();
            MarketDatabase.getInstance(getContext()).produtoDao().getProdutos();
        } catch (IOException err) {
            err.printStackTrace();

        }
        return new ArrayList();

    }

    @Override
    public Context getContext() {
        return (Context) view;
    }
}
