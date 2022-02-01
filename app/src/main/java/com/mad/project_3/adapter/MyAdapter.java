package com.mad.project_3.adapter;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mad.project_3.R;
import com.mad.project_3.model.DistrictModel;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<DistrictModel> districtModelList;
    private Context context;
    private int[] pictureList;

    public MyAdapter(List<DistrictModel> districtModelList, Context context, int[] pictureList) {
        this.districtModelList = districtModelList;
        this.context = context;
        this.pictureList = pictureList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.district_card,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.districtImage.setImageResource(pictureList[position]);
        holder.disName.setText(districtModelList.get(position).getDistrictName());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                View view1 = LayoutInflater.from(context).inflate(R.layout.descrption, null);
                TextView dTitle, dDescription;
                dTitle = view1.findViewById(R.id.descriptionTitle);
                dDescription = view1.findViewById(R.id.descriptionInfo);
                dTitle.setText(districtModelList.get(holder.getPosition()).getDistrictName());
                dDescription.setText(districtModelList.get(holder.getPosition()).getDistrictDescription());
                builder.setView(view1).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return districtModelList.size();
    }
}
