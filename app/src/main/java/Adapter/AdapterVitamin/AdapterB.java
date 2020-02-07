package Adapter.AdapterVitamin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.Activity.Main2Activity;
import com.example.vitamin.R;
import com.example.vitamin.Supplement.Supp_B;
import com.example.vitamin.vitaminDietary.DietaryB;

public class AdapterB extends RecyclerView.Adapter<AdapterB.MyHolder> {
    private static Context context;

    private String[] vitamin = {"Dietary Source", "Supplement", "Effect", "Solubility", "Recommended Dietary Source", "Tolerence Upper Inner"

    };


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_effect, parent, false);
        context = parent.getContext();
        MyHolder myHolder = new MyHolder(view);
        return myHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int i) {
        holder.vitamindet.setText(vitamin[i]);
        holder.vitamindet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,Main2Activity.class));

            }
        });

    }

    @Override
    public int getItemCount() {

        return vitamin.length;
    }

    public static class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView vitamindet;
        CardView Vitamin_cv;

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                context.startActivity(new Intent(context, DietaryB.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_B.class));


            }
        }
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            vitamindet = itemView.findViewById(R.id.tv_vitamindet);
            Vitamin_cv = itemView.findViewById(R.id.cv_vitamindet);

        }


    }

}
