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

public class AdapterDietaryC extends RecyclerView.Adapter<AdapterDietaryC.viewHolderC> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public AdapterDietaryC.viewHolderC onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.c_dietary,parent,false);
        viewHolderC ViewHolderC = new viewHolderC(view);
        return ViewHolderC;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryC.viewHolderC holder, int i) {
        holder.Tv_dietaryC.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolderC extends RecyclerView.ViewHolder {
        TextView Tv_dietaryC;
        CardView Cv_dietaryC;
        public viewHolderC(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryC = itemView.findViewById(R.id.tv_dietaryC);
            Cv_dietaryC= itemView.findViewById(R.id.cv_dietaryC);
        }
    }
}
