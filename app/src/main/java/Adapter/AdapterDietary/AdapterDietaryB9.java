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

public class AdapterDietaryB9 extends RecyclerView.Adapter<AdapterDietaryB9.viewHolderB9> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public AdapterDietaryB9.viewHolderB9 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.b9_dietary,parent,false);
        viewHolderB9 ViewHolderB9 = new viewHolderB9(view);
        return ViewHolderB9;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryB9.viewHolderB9 holder, int i) {
        holder.Tv_dietaryB9.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolderB9 extends RecyclerView.ViewHolder{
        TextView Tv_dietaryB9;
        CardView Cv_dietaryB9;
        public viewHolderB9(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryB9 = itemView.findViewById(R.id.tv_dietaryB9);
            Cv_dietaryB9= itemView.findViewById(R.id.cv_dietaryB9);
        }
    }
}
