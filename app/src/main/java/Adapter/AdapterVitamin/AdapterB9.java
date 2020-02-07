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
import com.example.vitamin.Supplement.Supp_B9;
import com.example.vitamin.vitaminDietary.DietaryB9;

public class AdapterB9 extends RecyclerView.Adapter<AdapterB9.viewHolderB9> {
    private Context context;
    private String vitaminB9 []= {"Dietary Source", "Supplement", "Effect", "Solubility", "Recommended Dietary Source", "Tolerence Upper Inner"};

    @NonNull
    @Override
    public AdapterB9.viewHolderB9 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_b9,parent,false);
        context = parent.getContext();
        viewHolderB9 ViewHolderB9 = new viewHolderB9(view);
        return ViewHolderB9;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterB9.viewHolderB9 holder, int i) {
        holder.Tv_B9.setText(vitaminB9[i]);

    }

    @Override
    public int getItemCount() {
        return vitaminB9.length;
    }

    public class viewHolderB9 extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_B9;
        CardView Cv_B9;
        public viewHolderB9(@NonNull View itemView) {
            super(itemView);
            Tv_B9 = itemView.findViewById(R.id.rv_B9);
            Cv_B9 = itemView.findViewById(R.id.cv_b9);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryB9.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_B9.class));

            }
        }
    }
}
