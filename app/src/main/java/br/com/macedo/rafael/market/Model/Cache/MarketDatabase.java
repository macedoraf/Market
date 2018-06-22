package br.com.macedo.rafael.market.Model.Cache;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {ProdutoDao.class}, version = 1)
public abstract class MarketDatabase extends RoomDatabase {

    public abstract ProdutoDao produtoDao();

    private static final String NOME_BANCO = "market_db";

    private static MarketDatabase INSTANCE;

    public static MarketDatabase getInstance(Context context) {

        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context, MarketDatabase.class, NOME_BANCO)
                    .allowMainThreadQueries()
                    .build();
        }

        return INSTANCE;


    }

}
