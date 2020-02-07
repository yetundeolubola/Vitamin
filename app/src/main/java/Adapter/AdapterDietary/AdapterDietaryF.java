package Adapter.AdapterDietary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.R;

public class AdapterDietaryF extends RecyclerView.Adapter<AdapterDietaryF.viewHolderF> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public AdapterDietaryF.viewHolderF onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.k_dietary,parent,false);
        viewHolderF ViewHolderF = new viewHolderF(view);
        return ViewHolderF;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryF.viewHolderF holder, int i) {
        holder.Tv_dietaryF.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolderF extends RecyclerView.ViewHolder {
        TextView Tv_dietaryF;
        CardView Cv_dietaryF;
        public viewHolderF(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryF = itemView.findViewById(R.id.tv_dietaryF);
            Cv_dietaryF= itemView.findViewById(R.id.cv_dietaryF);
        }
    }
}
