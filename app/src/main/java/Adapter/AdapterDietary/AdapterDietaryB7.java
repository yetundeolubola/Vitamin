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

public class AdapterDietaryB7 extends RecyclerView.Adapter<AdapterDietaryB7.viewHolder> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public AdapterDietaryB7.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.b7_dietary,parent,false);
        viewHolder ViewHolderB7 = new viewHolder(view);
        return ViewHolderB7;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryB7.viewHolder holder, int i) {
        holder.Tv_dietaryB7.setText(dietaryA[i]);


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView Tv_dietaryB7;
        CardView Cv_dietaryB7;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryB7 = itemView.findViewById(R.id.tv_dietaryB);
            Cv_dietaryB7= itemView.findViewById(R.id.cv_dietaryB);
        }
    }
}
