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
import com.example.vitamin.Supplement.Supp_D;
import com.example.vitamin.vitaminDietary.DietaryD;

public class AdapterD extends RecyclerView.Adapter<AdapterD.viewHolderD> {
    private Context context;
    private String[] vitamin_D ={"Dietary Source", "Supplement", "Effect", "Solubility",
            "Recommended Dietary Source", "Tolerence Upper Inner"
    } ;
    @NonNull
    @Override
    public AdapterD.viewHolderD onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_d,parent,false);
        context = parent.getContext();
        viewHolderD ViewHolder = new viewHolderD(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterD.viewHolderD holder, int i) {
        holder.Tv_D.setText(vitamin_D[i]);

    }

    @Override
    public int getItemCount() {
        return vitamin_D.length;
    }

    public class viewHolderD extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_D;
        CardView Cv_D;
        public viewHolderD(@NonNull View itemView) {
            super(itemView);

            Tv_D = itemView.findViewById(R.id.tv_D);
            Cv_D = itemView.findViewById(R.id.cv_D);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryD.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_D.class));

            }
        }
    }
}
