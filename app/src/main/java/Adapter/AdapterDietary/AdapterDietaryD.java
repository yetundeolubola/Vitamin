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

public class AdapterDietaryD extends RecyclerView.Adapter<AdapterDietaryD.viewHolderD> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public AdapterDietaryD.viewHolderD onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.d_dietary,parent,false);
        viewHolderD ViewHolderD = new viewHolderD(view);
        return ViewHolderD;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryD.viewHolderD holder, int i) {
        holder.Tv_dietaryD.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolderD extends RecyclerView.ViewHolder {
        TextView Tv_dietaryD;
        CardView Cv_dietaryD;
        public viewHolderD(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryD = itemView.findViewById(R.id.tv_dietaryD);
            Cv_dietaryD= itemView.findViewById(R.id.cv_dietaryD);
        }
    }
}
