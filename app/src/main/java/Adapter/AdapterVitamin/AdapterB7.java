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
import com.example.vitamin.Supplement.Supp_B7;
import com.example.vitamin.vitaminDietary.DietaryB7;

public class AdapterB7 extends RecyclerView.Adapter<AdapterB7.viewholderB7> {
    private Context context;
    private String VitaminB7 []= {"Dietary Source", "Supplement", "Effect", "Solubility",
            "Recommended Dietary Source", "Tolerence Upper Inner"};

    @NonNull
    @Override
    public AdapterB7.viewholderB7 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_b7,parent,false);
        context = parent.getContext();
        viewholderB7 ViewholderB7 = new viewholderB7(view);
        return ViewholderB7;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterB7.viewholderB7 holder, int i) {
        holder.Tv_B7.setText(VitaminB7[i]);


    }

    @Override
    public int getItemCount() {
        return VitaminB7.length;
    }

    public class viewholderB7 extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_B7;
        CardView Cv_B7;
        public viewholderB7(@NonNull View itemView) {
            super(itemView);

            Tv_B7 = itemView.findViewWithTag(R.id.tv_b7);
            Cv_B7 = itemView.findViewById(R.id.cv_b7);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryB7.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_B7.class));

            }
        }
    }
}
