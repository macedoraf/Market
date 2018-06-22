package br.com.macedo.rafael.market.Model.Entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

@Entity
public class Produto  {
    @PrimaryKey(autoGenerate = true)
    private int codigo;
    private String nome;
    private List<String> urlImagem;
    private float preco;

    public Produto(int codigo, String nome, List<String> urlImagem, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.urlImagem = urlImagem;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(List<String> urlImagem) {
        this.urlImagem = urlImagem;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
