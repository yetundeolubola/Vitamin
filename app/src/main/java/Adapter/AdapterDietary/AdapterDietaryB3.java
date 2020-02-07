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

public class AdapterDietaryB3 extends RecyclerView.Adapter<AdapterDietaryB3.viewHolder> {
    private Context context;
    private String dietary [] = {};
    @NonNull
    @Override
    public AdapterDietaryB3.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.b3_dietary, parent, false);
        viewHolder ViewHolderB3 = new viewHolder(view);
        return ViewHolderB3;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryB3.viewHolder holder, int i) {
        holder.Tv_dietaryB3.setText(dietary[i]);

    }

    @Override
    public int getItemCount() {
        return dietary.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView Tv_dietaryB3;
        CardView Cv_dietaryB3;
        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
            Tv_dietaryB3 = itemView.findViewById(R.id.tv_dietaryB3);
            Cv_dietaryB3= itemView.findViewById(R.id.cv_dietaryB3);
        }
    }
}
