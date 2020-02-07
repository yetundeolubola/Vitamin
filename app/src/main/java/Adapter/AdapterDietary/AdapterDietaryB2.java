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

public class AdapterDietaryB2 extends RecyclerView.Adapter<AdapterDietaryB2.viewHolder> {
    private Context context;
    private String dietary [] = {};
    @NonNull
    @Override
    public AdapterDietaryB2.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.b2_dietary,parent,false);
        viewHolder ViewHolderB2 = new viewHolder(view);
        return ViewHolderB2;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryB2.viewHolder holder, int i) {
        holder.Tv_dietaryB2.setText(dietary[i]);

    }

    @Override
    public int getItemCount()
    {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView Tv_dietaryB2;
        CardView Cv_dietaryB2;

        public viewHolder(@NonNull View itemView) {

            super(itemView);
            Tv_dietaryB2 = itemView.findViewById(R.id.tv_dietaryB2);
            Cv_dietaryB2= itemView.findViewById(R.id.cv_dietaryB2);
        }
    }
}
