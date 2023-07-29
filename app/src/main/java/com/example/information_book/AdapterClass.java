package com.example.information_book;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.cardViewHolder> {

    private ArrayList<ModelClass>modelList;

    private Context context;

    public AdapterClass(ArrayList<ModelClass>modelList,Context context){
        this.modelList = modelList;
        this.context=context;
    }

    @NonNull
    @Override
    public cardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new cardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardViewHolder holder, int position) {

        ModelClass model =modelList.get(position);
        holder.textViewSplash.setText(model.getCategoryName());
        holder.imageViewSplash.setImageResource(context.getResources()
                .getIdentifier(model.getImagename(),"drawable",context.getPackageName()));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Intent intent =new Intent(context, Museum.class);
                    context.startActivity(intent);
                }
                if (position==1){
                    Intent intent =new Intent(context, leaders.class);
                    context.startActivity(intent);
                }
                if (position==2){
                    Intent intent =new Intent(context, wonders.class);
                    context.startActivity(intent);
                }
                if (position==3){
                    Intent intent =new Intent(context, Coutries.class);
                    context.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class cardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSplash;
        private TextView textViewSplash;
        private  CardView cardView;
        public cardViewHolder(@NonNull View itemView){
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imgViewSplash);
            textViewSplash=itemView.findViewById(R.id.textViewSplash);
            cardView=itemView.findViewById(R.id.card);
        }
    }

}
