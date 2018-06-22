package br.com.macedo.rafael.market.View.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.macedo.rafael.market.Model.Entity.Produto;
import br.com.macedo.rafael.market.R;

public class ProdutoClickAdapter extends RecyclerView.Adapter<ProdutoClickAdapter.ProdutoHolder> {

    private final List<Produto> produtoList;
    private final Context context;
    private OnProdutoClickListener produtoClickListener;

    public ProdutoClickAdapter(Context context, List<Produto> produtoList){
        this.context = context;
        this.produtoList = produtoList;
    }

    public void setProdutoClickListener(OnProdutoClickListener produtoClickListener) {
        this.produtoClickListener = produtoClickListener;
    }

    @NonNull
    @Override
    public ProdutoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.lst_item_produto, parent, false);
        return new ProdutoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoHolder holder, final int position) {
        holder.setPropriedades(produtoList.get(position));
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                produtoClickListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return produtoList.size();
    }


    class ProdutoHolder extends RecyclerView.ViewHolder {
        private final View view;
        private final TextView lblNomeProduto;
        private final TextView lblPrecoProduto;
        private final ImageView imgProduto;

        public ProdutoHolder(View itemView) {
            super(itemView);
            this.view = itemView;
            lblNomeProduto = view.findViewById(R.id.lblNomeProduto);
            lblPrecoProduto = view.findViewById(R.id.lblPrecoProduto);
            imgProduto = view.findViewById(R.id.imgProduto);
        }

        public void setPropriedades(Produto produto) {
            lblNomeProduto.setText(produto.getNome());
            lblPrecoProduto.setText("R$:" + produto.getPreco());

            if (produto.getUrlImagem() != null) {


            }


        }
    }


}
