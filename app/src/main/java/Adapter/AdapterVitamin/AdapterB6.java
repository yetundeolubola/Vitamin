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
import com.example.vitamin.Supplement.Supp_B6;
import com.example.vitamin.vitaminDietary.DietaryB6;

public class AdapterB6 extends RecyclerView.Adapter<AdapterB6.Sholder> {
    private Context context;
    private String Supplement []= {"Dietary Source", "Supplement", "Effect", "Solubility", "Recommended Dietary Source", "Tolerence Upper Inner"};
    @NonNull
    @Override
    public AdapterB6.Sholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater .from(parent.getContext()).inflate(R.layout.activity_supplement,parent,false);
        context = parent.getContext();
        Sholder sholder = new Sholder(view);
        return sholder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterB6.Sholder holder, int i) {
        holder.Tv_Supplement.setText(Supplement[i]);

    }

    @Override
    public int getItemCount()

    {
        return Supplement.length;
    }
    public class Sholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_Supplement;
        CardView Cv_Supplement;

        public Sholder(@NonNull View itemView) {
            super(itemView);
            Tv_Supplement = itemView.findViewById(R.id.tv_supplement);
            Cv_Supplement = itemView.findViewById(R.id.cv_supplement);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryB6.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_B6.class));

            }
        }
    }
}
