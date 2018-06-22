package br.com.macedo.rafael.market.View.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.macedo.rafael.market.Domain.ProdutoPresenter;
import br.com.macedo.rafael.market.MVP;
import br.com.macedo.rafael.market.Model.Entity.Produto;
import br.com.macedo.rafael.market.R;
import br.com.macedo.rafael.market.View.Adapters.OnProdutoClickListener;
import br.com.macedo.rafael.market.View.Adapters.ProdutoClickAdapter;
import br.com.macedo.rafael.market.View.Enums.Tela;
import br.com.macedo.rafael.market.View.FragmentChangeDelegate;

public class ProdutosFragment extends Fragment implements OnProdutoClickListener, MVP.View {

    public static final int NUMERO_DE_COLUNAS = 3;

    private RecyclerView recyclerView;
    private MVP.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_produtos, container, false);
        recyclerView = view.findViewById(R.id.rvProdutos);
        presenter = new ProdutoPresenter();
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        configuraRecyclerView();

        configuraAdapter();
    }

    private void configuraAdapter() {
        recyclerView.setAdapter(new ProdutoClickAdapter(this.getContext(), carregaProdutos()));

    }

    private List<Produto> carregaProdutos() {
        return presenter.getDados();

    }

    private void configuraRecyclerView() {
        LinearLayoutManager linearLayoutManager = new GridLayoutManager(getContext(), NUMERO_DE_COLUNAS);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onClick(int position) {
        FragmentChangeDelegate fragmentChangeDelegate = (FragmentChangeDelegate) getActivity();
        fragmentChangeDelegate.trocaTela(Tela.PRODUTO_DETALHE);

    }
}
