package br.com.macedo.rafael.market.Model.Cache;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import br.com.macedo.rafael.market.Model.Entity.Produto;

@Dao
public interface ProdutoDao {

    @Query("SELECT * FROM Produto")
    List<Produto> getProdutos();

    @Insert
    void insert(Produto produto);

    @Delete
    void delete(int codigo);
}
