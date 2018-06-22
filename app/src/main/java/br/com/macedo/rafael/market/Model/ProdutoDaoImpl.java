package br.com.macedo.rafael.market.Model;

import java.util.List;

import br.com.macedo.rafael.market.MVP;
import br.com.macedo.rafael.market.Model.Cache.MarketDatabase;
import br.com.macedo.rafael.market.Model.Entity.Produto;

public class ProdutoDaoImpl implements MVP.Model<Produto> {

    private MVP.Presenter<Produto> produtoPresenter;

    public ProdutoDaoImpl(MVP.Presenter<Produto> produtoPresenter) {
        this.produtoPresenter = produtoPresenter;
    }

    @Override
    public List<Produto> getDados() {
        return MarketDatabase.getInstance(produtoPresenter.getContext()).produtoDao().getProdutos();
    }
}
