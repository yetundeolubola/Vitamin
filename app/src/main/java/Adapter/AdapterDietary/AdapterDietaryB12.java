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

public class AdapterDietaryB12 extends RecyclerView.Adapter<AdapterDietaryB12.viewHolderB12> {
    private Context context;
    private String dietaryA [] = {};
    @NonNull
    @Override
    public viewHolderB12 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_b12,parent,false);
        viewHolderB12 ViewHolderB12 = new viewHolderB12(view);
        return ViewHolderB12;

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderB12 holder, int i) {
        holder.Tv_dietaryB12.setText(dietaryA[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
 public class viewHolderB12 extends RecyclerView.ViewHolder{
     TextView Tv_dietaryB12;
     CardView Cv_dietaryB12;

    public viewHolderB12(@NonNull View itemView) {

        super(itemView);
        Tv_dietaryB12 = itemView.findViewById(R.id.tv_b12);
        Cv_dietaryB12= itemView.findViewById(R.id.cv_b12);
    }
}

}
