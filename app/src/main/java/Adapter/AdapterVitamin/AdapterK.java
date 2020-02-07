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
import com.example.vitamin.vitaminDietary.DietaryK;

public class AdapterK extends RecyclerView.Adapter<AdapterK.viewHolderK> {
    private Context context;
    private String[] vitaminK ={"Dietary Source", "Supplement", "Effect", "Solubility",
            "Recommended Dietary Source", "Tolerence Upper Inner"
    } ;
    @NonNull
    @Override
    public AdapterK.viewHolderK onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_k,parent,false);
        context = parent.getContext();
        viewHolderK viewHolderK = new viewHolderK(view);
        return viewHolderK;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterK.viewHolderK holder, int i) {
        holder.Tv_k.setText(vitaminK[i]);

    }

    @Override
    public int getItemCount() {

        return vitaminK.length;
    }

    public class viewHolderK extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_k;
        CardView Cv_K;
        public viewHolderK(@NonNull View itemView) {
            super(itemView);
            Tv_k = itemView.findViewById(R.id.tv_K);
            Cv_K = itemView.findViewById(R.id.cv_K);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryK.class));

            }
        }
    }
}
