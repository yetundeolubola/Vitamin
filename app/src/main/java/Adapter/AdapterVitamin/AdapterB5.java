package Adapter.AdapterVitamin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.R;
import com.example.vitamin.Supplement.Supp_B5;
import com.example.vitamin.vitaminDietary.DietaryB5;

public class AdapterB5 extends RecyclerView.Adapter<AdapterB5.SviewHolder> {

    private Context context;
    private String Solubility [] = {"Dietary Source", "Supplement", "Effect", "Solubility", "Recommended Dietary Source", "Tolerence Upper Inner"};
    @NonNull
    @Override
    public AdapterB5.SviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_solubility,parent,false);
        context = parent.getContext();
        SviewHolder sviewHolder = new SviewHolder(view);
        return sviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterB5.SviewHolder holder, int i) {
        holder.Tv_solubility.setText(Solubility[i]);
    }

    @Override
    public int getItemCount() {

        return Solubility.length;
    }
     public class SviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_solubility;
        CardView Cv_solubility;
         public SviewHolder(@NonNull View itemView) {
             super(itemView);
             Tv_solubility = itemView.findViewById(R.id.tv_solubility);
             Cv_solubility = itemView.findViewById(R.id.cv_solubility);
         }

         @Override
         public void onClick(View v) {
             int position = getAdapterPosition();
             switch (position) {
                 case 0:
                     context.startActivity(new Intent(context, DietaryB5.class));
                 case 1:
                     context.startActivity(new Intent(context, Supp_B5.class));

             }
         }
     }
}
