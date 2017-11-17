package com.example.randa.recyclerviewiak;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

/**
 * Created by randa on 27/11/2016.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.MyViewHolder>{

    private List<AnimalModel> animalList;
    Context context; //apa ini? fungsi dasar nya class

    public AnimalAdapter(Context context, List<AnimalModel>animalList){
        this.animalList= animalList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //view yang untuk ditampilkan dalam satu baris
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_list_item, parent, false); //di oper ke class bagian bawah
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) { //menemukan data ke dalam layout
        final AnimalModel animal = animalList.get(position);
        holder.nama.setText(animal.getNamaIndo()); // ini fungsi yang di getter setter pada model tadi
        holder.gambar.setImageResource(animal.getGambar());
        holder.layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(context, animal.getNamaEng(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //definisikan item yang ada pada layout
        TextView nama;
        ImageView gambar;
        LinearLayout layout;
        public MyViewHolder(View itemView) {
            super(itemView);
            gambar = (ImageView) itemView.findViewById(R.id.gambar); // itemView karena sesuai dengan public ViewHolder(View itemView)
            nama = (TextView) itemView.findViewById(R.id.nama);
            layout = (LinearLayout) itemView.findViewById(R.id.layout);

        }
    }
}