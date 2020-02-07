package Adapter;

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
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.example.vitamin.R;
import com.example.vitamin.Vitamins.vitaminB12;
import com.example.vitamin.Vitamins.vitaminB2;
import com.example.vitamin.Vitamins.vitaminB3;
import com.example.vitamin.Vitamins.vitaminB5;
import com.example.vitamin.Vitamins.vitaminB6;
import com.example.vitamin.Vitamins.vitaminB7;
import com.example.vitamin.Vitamins.vitaminB9;
import com.example.vitamin.Vitamins.vitaminC;
import com.example.vitamin.Vitamins.vitaminD;
import com.example.vitamin.Activity.vitaminA;
import com.example.vitamin.Activity.vitaminB;

public class MyAadpter extends Adapter<MyAadpter.MyHolder> {
 private static Context context;

    private String[] vitamin = { "Vitamin A", "Vitamin B","Vitamin B2","Vitamin B3","Vitamin B5","Vitamin B6",
            "Vitamin B7","Vitamin B9","Vitamin B12","Vitamin C","Vitamin D","Vitamin E","Vitamin F","Vitamin K"

    };


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.vitamin_textview,parent,false);
        context = parent.getContext();
        MyHolder myHolder = new MyHolder(view);
        return myHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int i) {
      holder.tv_vitamins.setText(vitamin[i]);
//      holder.tv_vitamins.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              context.startActivity(new Intent(context, vitaminB2.class));
//          }
//      });
//
    }

    @Override
    public int getItemCount() {
        return vitamin.length;

    }
    public static class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        RelativeLayout rl_vitamin;
        TextView tv_vitamins;
        CardView cv_vitamins;

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            switch (position){
                case 0:
                    context.startActivity(new Intent(context, vitaminA.class ));
                case 1:
                    context.startActivity(new Intent(context, vitaminB.class));

                case 2:
                    context.startActivity(new Intent(context,vitaminB2.class));
                case 3:
                    context.startActivity(new Intent(context, vitaminB3.class));
                case 4:
                    context.startActivity(new Intent(context, vitaminB5.class));
                case 5:
                    context.startActivity(new Intent(context, vitaminB6.class));
                case 6:
                    context.startActivity(new Intent(context, vitaminB7.class));
                case 9:
                    context.startActivity(new Intent(context, vitaminB9.class));
                case 10:
                    context.startActivity(new Intent(context, vitaminB12.class));
                case 11:
                    context.startActivity(new Intent(context, vitaminC.class));
                case 12:
                    context.startActivity(new Intent(context, vitaminD.class));

            }

        }

        public MyHolder(@NonNull  View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            rl_vitamin = itemView.findViewById(R.id.rl_vitamin);
           tv_vitamins = itemView.findViewById(R.id.tv_vitamincat);
           cv_vitamins = itemView.findViewById(R.id.cv_vitamin);

        }


    }
}
