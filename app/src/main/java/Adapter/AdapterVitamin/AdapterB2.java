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

import com.example.vitamin.R;
import com.example.vitamin.Supplement.Supp_B2;
import com.example.vitamin.vitaminDietary.DietaryB2;

public class AdapterB2 extends RecyclerView.Adapter<AdapterB2.Tviewholder> {
    private Context context;
    private String vitamin[] = {"Dietary Source", "Supplement", "Effect", "Solubility", "Recommended Dietary Source", "Tolerence Upper Inner"
    };

    @NonNull
    @Override
    public AdapterB2.Tviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_supplement, parent, false);
        context = parent.getContext();
        Tviewholder tviewholder = new Tviewholder(view);
        return tviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterB2.Tviewholder holder, int i) {
        holder.Sup_tv.setText(vitamin[i]);

    }

    @Override
    public int getItemCount() {
        return vitamin.length;
    }

    public class Tviewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Sup_tv;
        CardView Sup_cv;

        public Tviewholder(@NonNull View itemView) {
            super(itemView);
            Sup_tv = itemView.findViewById(R.id.tv_supplement);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryB2.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_B2.class));

            }
        }
    }
}

