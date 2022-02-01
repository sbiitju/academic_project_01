package com.mad.project_3.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.mad.project_3.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView districtImage;
    TextView disName;
    Button button;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        districtImage=itemView.findViewById(R.id.districtImg);
        disName=itemView.findViewById(R.id.districtName);
        button=itemView.findViewById(R.id.districtshowBtn);
    }
}
