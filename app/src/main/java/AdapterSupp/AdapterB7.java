package AdapterSupp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.R;

public class AdapterB7 extends RecyclerView.Adapter<AdapterB7.viewHolder> {
    private Context context;
    private String[] vitamin ={};
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.supp_b7,parent,false);
        context = parent.getContext();
        viewHolder ViewHolder = new viewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.Tv_B7.setText(vitamin[position]);
    }

    @Override
    public int getItemCount() {
        return vitamin.length;

    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView Tv_B7;
        CardView Cv_B7;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            Tv_B7 = itemView.findViewById(R.id.tv_SuppB7);
            Cv_B7 = itemView.findViewById(R.id.cv_SuppB7);
        }
    }
}
