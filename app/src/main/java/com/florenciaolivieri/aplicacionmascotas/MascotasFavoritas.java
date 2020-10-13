package com.florenciaolivieri.aplicacionmascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<MascotasFavoritas> mascotasfavoritas;
    private RecyclerView listaMascotasFavoritas;
    private String nombre;
    private String numeroLikes;
    private int foto;

    public MascotasFavoritas( int foto, String nombre, String numeroLikes) {
        this.nombre      = nombre;
        this.numeroLikes = numeroLikes;
        this.foto        = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(String numeroLikes) {
        this.numeroLikes = numeroLikes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        listaMascotasFavoritas = (RecyclerView) findViewById(R.id.rvMascotasFav);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotasFavoritas.setLayoutManager(llm);
        inicializarListaMascotasFavoritas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotasFavoritasAdaptador adaptador = new MascotasFavoritasAdaptador(mascotasfavoritas);
        listaMascotasFavoritas.setAdapter(adaptador);
    }



    public void inicializarListaMascotasFavoritas(){
        mascotasfavoritas = new ArrayList<MascotasFavoritas>();

        mascotasfavoritas.add(new MascotasFavoritas(R.drawable.foto_perro_plato_comida,"Odie", "5"));
        mascotasfavoritas.add(new MascotasFavoritas(R.drawable.foto_perro_sonriente,"Minerva", "4"));
        mascotasfavoritas.add(new MascotasFavoritas(R.drawable.foto_perro_puppy,"Lucas", "4"));
        mascotasfavoritas.add(new MascotasFavoritas(R.drawable.foto_perro_salchicha,"Lupe", "6"));
        mascotasfavoritas.add(new MascotasFavoritas(R.drawable.fotoperro_gretriever,"Marley", "6"));
    }

    public void irAtras(View v) {
        Intent intent = new Intent(MascotasFavoritas.this, MainActivity.class);
        startActivity(intent);
    }


}

