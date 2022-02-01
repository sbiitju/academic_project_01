package com.mad.project_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.mad.project_3.adapter.MyAdapter;
import com.mad.project_3.model.DistrictModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Dhaka(View view) {
        List<DistrictModel> dhakaList=new ArrayList<>();
        int[] districtOfDhakaPic={R.drawable.first_image,R.drawable.second_image};
        DistrictModel dhaka=new DistrictModel("Dhaka","About Dhaka");
        DistrictModel gazipur=new DistrictModel("Gazipur","About Gazipur");
        dhakaList.add(dhaka);
        dhakaList.add(gazipur);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        View view1=getLayoutInflater().inflate(R.layout.districtlist,null);
        RecyclerView recyclerView=view1.findViewById(R.id.recyclerview);
        MyAdapter myAdapter=new MyAdapter(dhakaList,this,districtOfDhakaPic);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(myAdapter);
        builder.setView(view1).show();
    }

    public void Khulna(View view) {
    }

    public void Maymansing(View view) {
    }

    public void Ctg(View view) {
    }

    public void Borisal(View view) {
    }

    public void Rajsahi(View view) {
    }

    public void Rangpur(View view) {
    }

    public void Sylet(View view) {
    }
}