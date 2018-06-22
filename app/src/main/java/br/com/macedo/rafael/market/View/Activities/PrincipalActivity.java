package br.com.macedo.rafael.market.View.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import br.com.macedo.rafael.market.R;
import br.com.macedo.rafael.market.View.Enums.Tela;
import br.com.macedo.rafael.market.View.FragmentChangeDelegate;

public class PrincipalActivity extends BaseActivity implements FragmentChangeDelegate {

    private FrameLayout framePrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inicializaControles();
        trocaTela(Tela.PRODUTOS);


    }

    private void inicializaControles() {
        framePrincipal = findViewById(R.id.frame_principal);
    }


    @Override
    public void trocaTela(Tela tela) {
        FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_principal, tela.getFragment());
        fragmentTransaction.commit();


    }
}
