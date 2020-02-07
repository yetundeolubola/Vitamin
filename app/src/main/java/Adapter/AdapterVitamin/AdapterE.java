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
import com.example.vitamin.Supplement.Supp_E;
import com.example.vitamin.vitaminDietary.DietaryE;

public class AdapterE extends RecyclerView.Adapter<AdapterE.viewHolderE> {
    private Context context;
    private String[] vitaminE ={"Dietary Source", "Supplement", "Effect", "Solubility",
            "Recommended Dietary Source", "Tolerence Upper Inner"
    } ;
    @NonNull
    @Override
    public AdapterE.viewHolderE onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_e,parent,false);
        context = parent.getContext();
        viewHolderE ViewHolderE = new viewHolderE(view);
        return ViewHolderE;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterE.viewHolderE holder, int i) {
        holder.Tv_E.setText(vitaminE[i]);

    }

    @Override
    public int getItemCount() {
        return vitaminE.length;
    }

    public class viewHolderE extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_E;
        CardView Cv_E;
        public viewHolderE(@NonNull View itemView) {
            super(itemView);
            Tv_E = itemView.findViewById(R.id.tv_E);
            Cv_E = itemView.findViewById(R.id.cv_E);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryE.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_E.class));

            }
        }
    }
}
