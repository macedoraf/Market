package br.com.macedo.rafael.market.Presenter;

import android.content.Context;

import java.util.List;

import br.com.macedo.rafael.market.MVP;
import br.com.macedo.rafael.market.Model.Entity.Produto;
import br.com.macedo.rafael.market.Model.ProdutoDaoImpl;


public class ProdutoPresenter implements MVP.Presenter<Produto> {

    private MVP.View view;
    private MVP.Model<Produto> model;

    public ProdutoPresenter() {
        model = new ProdutoDaoImpl(this);
    }

    public void setView(MVP.View view) {
        this.view = view;
    }

    @Override
    public List<Produto> getDados() {
        return model.getDados();
    }


    @Override
    public Context getContext() {
        return (Context) view;
    }
}
