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
import com.example.vitamin.Supplement.Supp_B12;
import com.example.vitamin.vitaminDietary.DietaryB12;

public class AdapterB12 extends RecyclerView.Adapter<AdapterB12.viewHolderB12> {
    private Context context;
    private String vitaminB9[] = {"Dietary Source", "Supplement", "Effect", "Solubility",
            "Recommended Dietary Source", "Tolerence Upper Inner"};

    @NonNull
    @Override
    public AdapterB12.viewHolderB12 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_b12, parent, false);
        context = parent.getContext();
        viewHolderB12 ViewHolder12 = new viewHolderB12(view);
        return ViewHolder12;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterB12.viewHolderB12 holder, int i) {
        holder.Tv_B12.setText(vitaminB9[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolderB12 extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_B12;
        CardView Cv_B12;

        public viewHolderB12(@NonNull View itemView) {
            super(itemView);
            Tv_B12 = itemView.findViewById(R.id.tv_b12);
            Cv_B12 = itemView.findViewById(R.id.cv_b12);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryB12.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_B12.class));

            }
        }
    }


}

