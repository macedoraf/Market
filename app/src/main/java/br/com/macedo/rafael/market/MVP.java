package br.com.macedo.rafael.market;

import android.content.Context;

import java.util.List;

public interface MVP {

    interface View {
    }

    interface Model<T> {
        List<T> getDados();

    }

    interface Presenter<T> {

        List<T> getDados();

        Context getContext();
    }
}
