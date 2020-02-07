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

public class AdapterDietaryE extends RecyclerView.Adapter<AdapterDietaryE.viewHolderE> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public AdapterDietaryE.viewHolderE onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.e_dietary,parent,false);
        viewHolderE ViewHolderE = new viewHolderE(view);
        return ViewHolderE;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryE.viewHolderE holder, int i) {
        holder.Tv_dietaryE.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolderE extends RecyclerView.ViewHolder {
        TextView Tv_dietaryE;
        CardView Cv_dietaryE;
        public viewHolderE(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryE = itemView.findViewById(R.id.tv_dietaryE);
            Cv_dietaryE= itemView.findViewById(R.id.cv_dietaryE);
        }
    }
}
