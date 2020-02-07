package Adapter.AdapterDietary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.R;

public class AdapterDietaryA extends RecyclerView.Adapter<AdapterDietaryA.viewHolderA> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public AdapterDietaryA.viewHolderA onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.a_dietary,parent,false);
        viewHolderA ViewHolderA = new viewHolderA(view);
        return ViewHolderA;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryA.viewHolderA holder, int i) {
        holder.Tv_dietaryA.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return dietaryA.length;
    }

    public class viewHolderA extends RecyclerView.ViewHolder {
        TextView Tv_dietaryA;
        CardView Cv_dietaryA;


        public viewHolderA(@NonNull View itemView) {
            super(itemView);
            Tv_dietaryA = itemView.findViewById(R.id.tv_dietaryA);
            Cv_dietaryA = itemView.findViewById(R.id.cv_dietaryA);

        }
    }
}
