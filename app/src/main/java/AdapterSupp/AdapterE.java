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

public class AdapterE extends RecyclerView.Adapter<AdapterE.viewHolder> {
    private Context context;
    private String[] vitamin ={};
    @NonNull
    @Override
    public AdapterE.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.supp_e,parent,false);
        context = parent.getContext();
        viewHolder ViewHolder = new viewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterE.viewHolder holder, int position) {
        holder.Tv_E.setText(vitamin[position]);
    }

    @Override
    public int getItemCount() {
        return vitamin.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView Tv_E;
        CardView Cv_E;
        public viewHolder(@NonNull View itemView) {

            super(itemView);
            Tv_E = itemView.findViewById(R.id.tv_SuppE);
            Cv_E = itemView.findViewById(R.id.cv_SuppE);
        }
    }
}
