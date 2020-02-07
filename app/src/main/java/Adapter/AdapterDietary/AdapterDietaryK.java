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

public class AdapterDietaryK extends RecyclerView.Adapter<AdapterDietaryK.viewHolderK> {
    private Context context;
    private String dietaryA [] = {};

    @NonNull
    @Override
    public AdapterDietaryK.viewHolderK onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.k_dietary,parent,false);
        viewHolderK ViewHolderK = new viewHolderK(view);
        return ViewHolderK;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryK.viewHolderK holder, int i) {
        holder.Tv_dietaryK.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolderK extends RecyclerView.ViewHolder {
        TextView Tv_dietaryK;
        CardView Cv_dietaryK;
        public viewHolderK(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryK = itemView.findViewById(R.id.tv_dietaryK);
            Cv_dietaryK= itemView.findViewById(R.id.cv_dietaryK);
        }
    }
}
