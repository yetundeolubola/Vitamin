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
import com.example.vitamin.Supplement.Supp_F;
import com.example.vitamin.vitaminDietary.DietaryF;

public class AdapterF extends RecyclerView.Adapter<AdapterF.viewHolderF> {
    private Context context;
    private String[] vitaminE ={"Dietary Source", "Supplement", "Effect", "Solubility", "Recommended Dietary Source",
            "Tolerence Upper Inner"
    } ;
    @NonNull
    @Override
    public AdapterF.viewHolderF onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_f,parent,false);
        context = parent.getContext();
        viewHolderF ViewHolderF = new viewHolderF(view);
        return ViewHolderF;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterF.viewHolderF holder, int i) {
        holder.Tv_F.setText(vitaminE[i]);

    }

    @Override
    public int getItemCount() {
        return vitaminE.length;
    }

    public class viewHolderF extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_F;
        CardView Cv_F;
        public viewHolderF(@NonNull View itemView) {
            super(itemView);
            Tv_F = itemView.findViewById(R.id.tv_E);
            Cv_F = itemView.findViewById(R.id.cv_E);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryF.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_F.class));

            }
        }
    }
}
