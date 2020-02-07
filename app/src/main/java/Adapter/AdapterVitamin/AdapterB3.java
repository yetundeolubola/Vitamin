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
import com.example.vitamin.Supplement.Supp_B3;
import com.example.vitamin.vitaminDietary.DietaryB3;

public class AdapterB3 extends RecyclerView.Adapter<AdapterB3.Eholder>{

    private Context context ;

    private String [] Effect = {"Night Blindness","Dry Eyes","Frequent Infections","Dark Urine","Joint Pain","Dry Skin"};

    @NonNull
    @Override
    public AdapterB3.Eholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_effect,parent,false);
       context = parent.getContext();
       Eholder eholder = new Eholder(view);
       return  eholder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterB3.Eholder holder, int i) {
     holder.Tv_effect.setText(Effect[i]);

    }

    @Override
    public int getItemCount() {
        return Effect.length;
    }


    public class Eholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Tv_effect;
        CardView Cv_effect;

        public Eholder(@NonNull View itemView) {
            super(itemView);
            Tv_effect = itemView.findViewById(R.id.tv_effect);
            Cv_effect = itemView.findViewById(R.id.cv_effect);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            switch (position) {
                case 0:
                    context.startActivity(new Intent(context, DietaryB3.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_B3.class));

            }
        }
    }
}
