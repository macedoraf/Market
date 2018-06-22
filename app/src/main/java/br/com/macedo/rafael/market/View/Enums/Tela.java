package br.com.macedo.rafael.market.View.Enums;

import android.support.v4.app.Fragment;

import br.com.macedo.rafael.market.View.Fragments.ProdutoDetalhe;
import br.com.macedo.rafael.market.View.Fragments.ProdutosFragment;

public enum Tela {
    PRODUTOS(new ProdutosFragment()),
    PRODUTO_DETALHE(new ProdutoDetalhe());

    private Fragment fragment;

    public Fragment getFragment() {
        return fragment;
    }

    Tela(Fragment fragment) {
        this.fragment = fragment;
    }




}
