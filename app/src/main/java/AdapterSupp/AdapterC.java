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

public class AdapterC extends RecyclerView.Adapter<AdapterC.viewHolder> {
    private Context context;
    private String[] vitamin ={};
    @NonNull
    @Override
    public AdapterC.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.supp_c,parent,false);
        context = parent.getContext();
        viewHolder ViewHolder = new viewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterC.viewHolder holder, int position) {
        holder.Tv_C.setText(vitamin[position]);
    }

    @Override
    public int getItemCount() {
        return vitamin.length;

    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView Tv_C;
        CardView Cv_C;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            Tv_C = itemView.findViewById(R.id.tv_SuppC);
            Cv_C = itemView.findViewById(R.id.cv_SuppC);
        }
    }
}
