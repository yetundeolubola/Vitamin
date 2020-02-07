package Adapter.AdapterVitamin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.Supplement.Supp_A;
import com.example.vitamin.vitaminDietary.DietaryA;
import com.example.vitamin.R;

public class AdapterA extends RecyclerView.Adapter<AdapterA.mViewHolder> {
    private static Context context;

    private String[] detiary_source ={"Dietary Source", "Supplement", "Effect", "Solubility", "Recommended Dietary Source", "Tolerence Upper Inner"
    } ;



    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_dietary,parent,false);
        context = parent.getContext();
        mViewHolder MViewHolder = new mViewHolder(view);
        return MViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder holder, int i) {
       holder.Tv_dietary.setText(detiary_source[i]);


    }

    @Override
    public int getItemCount()
    {

        return detiary_source.length;
    }

    public class mViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView Tv_dietary;
        CardView Cv_dietary;
        RelativeLayout Rl_dietary;

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            switch (position){
                case 0 :
                    context.startActivity(new Intent(context, DietaryA.class));
                case 1:
                    context.startActivity(new Intent(context, Supp_A.class));
            }
        }

        public mViewHolder(@NonNull View itemView) {
            super(itemView);

            Tv_dietary = itemView.findViewById(R.id.tv_dietary);
            Cv_dietary = itemView.findViewById(R.id.cv_dietary);
            Rl_dietary = itemView.findViewById(R.id.rl_dietary);
        }
    }
}
