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

public class AdapterDietaryB5 extends RecyclerView.Adapter<AdapterDietaryB5.viewHolder> {
    private Context context;
    private String dietary [] = {};
    @NonNull
    @Override
    public AdapterDietaryB5.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.b5_dietary,parent,false);
        viewHolder ViewHolderB5 = new viewHolder(view);
        return ViewHolderB5;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDietaryB5.viewHolder holder, int i) {
        holder.Tv_dietaryB5.setText(dietary[i]);

    }

    @Override
    public int getItemCount() {

        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView Tv_dietaryB5;
        CardView Cv_dietaryB5;
        public viewHolder(@NonNull View itemView)
        { super(itemView);
            Tv_dietaryB5 = itemView.findViewById(R.id.tv_dietaryB5);
            Cv_dietaryB5= itemView.findViewById(R.id.cv_dietaryB5);
        }
    }
}
