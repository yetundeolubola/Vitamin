package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitamin.R;

import java.util.List;

public class MyAadpter extends RecyclerView.Adapter<MyAadpter.MyHolder> {
    private String[] vitamin = {

    };

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.vitamin_textview,parent,false);
        MyHolder myHolder = new MyHolder(textView);
        return myHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int i) {
      holder.tv_vitamin.setText(vitamin[i]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public static class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView VersionName;
        private TextView tv_vitamin;

        public MyHolder(@NonNull  TextView itemView) {
            super(itemView);
            VersionName = itemView;

            itemView.setOnClickListener(this);
           tv_vitamin = itemView.findViewById(R.id.tv_vitamincat);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
