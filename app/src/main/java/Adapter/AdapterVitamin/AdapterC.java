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
import com.example.vitamin.Supplement.Supp_C;
import com.example.vitamin.vitaminDietary.DietaryC;

public class AdapterC extends RecyclerView.Adapter<AdapterC.viewHolderC> {
    private Context context;
    private String vitaminC []= {"Dietary Source", "Supplement", "Effect", "Solubility", "" +
            "Recommended Dietary Source", "Tolerence Upper Inner"};

    @NonNull
    @Override
    public AdapterC.viewHolderC onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_c,parent,false);
        context =parent.getContext();
        viewHolderC ViewHolder = new viewHolderC(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterC.viewHolderC holder, int i) {
        holder.Tv_C.setText(vitaminC[i]);

    }

    @Override
    public int getItemCount() {
        return vitaminC.length;
    }

    public class viewHolderC extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_C;
        CardView Cv_C;
        public viewHolderC(@NonNull View itemView) {
            super(itemView);

            Tv_C = itemView.findViewById(R.id.tv_C);
            Cv_C = itemView.findViewById(R.id.cv_C);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryC.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_C.class));
            }
        }
    }
}
