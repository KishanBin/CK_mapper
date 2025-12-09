package com.example.ck_mapper.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ck_mapper.R;
import com.example.ck_mapper.models.Custom_btn_model;

import java.util.List;

public class CustomBtnAdapter extends RecyclerView.Adapter<CustomBtnAdapter.ViewHolder> {

    private final Context context;
    private final List<Custom_btn_model> buttonList;

    public CustomBtnAdapter(Context context, List<Custom_btn_model> buttonList) {
        this.context = context;
        this.buttonList = buttonList;
    }

    @NonNull
    @Override
    public CustomBtnAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.activity_custome_btns,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomBtnAdapter.ViewHolder holder, int position) {
         Custom_btn_model item = buttonList.get(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageButton icon;
        TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.btnIcon);
            text = itemView.findViewById(R.id.btnText);
        }
    }
}
