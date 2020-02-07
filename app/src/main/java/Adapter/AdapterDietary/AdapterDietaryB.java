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

public class AdapterDietaryB extends RecyclerView.Adapter<AdapterDietaryB.viewHolder> {
    private Context context;
    private String dietary [] = {};
    @NonNull
    @Override
    public AdapterDietaryB.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.b_dietary,parent,false);
        viewHolder ViewHolderB = new viewHolder(view);
        return ViewHolderB;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryB.viewHolder holder, int i) {
        holder.Tv_dietary.setText(dietary[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView Tv_dietary;
        CardView Cv_dietary;
        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
            Tv_dietary = itemView.findViewById(R.id.tv_dietaryB);
            Cv_dietary= itemView.findViewById(R.id.cv_dietaryB);
        }
    }
}
