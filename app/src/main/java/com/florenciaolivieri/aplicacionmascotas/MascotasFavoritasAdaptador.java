package com.florenciaolivieri.aplicacionmascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MascotasFavoritasAdaptador extends RecyclerView.Adapter<MascotasFavoritasAdaptador.MascotasFavoritasViewHolder> {

    private Mascota mascota;

    public MascotasFavoritasAdaptador(ArrayList<MascotasFavoritas> mascotasFavoritas) {
        this.mascotasFavoritas = mascotasFavoritas;
    }

    ArrayList<MascotasFavoritas> mascotasFavoritas;
    @NonNull
    @Override
    public MascotasFavoritasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascfavoritas ,parent, false);
        return new MascotasFavoritasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasFavoritasViewHolder mascotasFavoritasViewHolder, int position) {
      MascotasFavoritas mascotaFavorita = mascotasFavoritas.get(position);
        mascotasFavoritasViewHolder.imgMascotaFavCV.setImageResource(mascotaFavorita.getFoto());
        mascotasFavoritasViewHolder.tvNombreMascotaFavCV.setText(mascotaFavorita.getNombre());
        mascotasFavoritasViewHolder.tvNLikesFavCV.setText(mascotaFavorita.getNumeroLikes());


    }

    @Override
    public int getItemCount() {
        return mascotasFavoritas.size();
    }

    public static class MascotasFavoritasViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascotaFavCV;
        private TextView tvNombreMascotaFavCV;
        private TextView tvNLikesFavCV;

        public MascotasFavoritasViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMascotaFavCV      = (ImageView) itemView.findViewById(R.id.imgMascotaFavCV);
            tvNombreMascotaFavCV = (TextView) itemView.findViewById(R.id.tvNombreMascotaFavCV);
            tvNLikesFavCV        = (TextView) itemView.findViewById(R.id.tvNLikesMacFavCV); //38:00

        }
    }
}