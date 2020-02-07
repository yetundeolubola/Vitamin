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

public class AdapterDietaryB6 extends RecyclerView.Adapter<AdapterDietaryB6.viewHolder> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public AdapterDietaryB6.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.b6_dietary,parent,false);
        viewHolder ViewHolderB6 = new viewHolder(view);
        return ViewHolderB6;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryB6.viewHolder holder, int i) {
        holder.Tv_dietaryB6.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView Tv_dietaryB6;
        CardView Cv_dietaryB6;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryB6 = itemView.findViewById(R.id.tv_dietaryB);
            Cv_dietaryB6= itemView.findViewById(R.id.cv_dietaryB);
        }
    }
}
