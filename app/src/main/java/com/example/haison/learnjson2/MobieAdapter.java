package com.example.haison.learnjson2;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MobieAdapter extends RecyclerView.Adapter<MobieAdapter.MyViewHolder> {

    private Mobie[] mobieList;
    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public MobieAdapter(Context context, Mobie[] mobieList) {
        this.mobieList = mobieList;
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        public TextView name, operatingSystem, screenSize, companyName, rom, backCamera, url;
        private ItemClickListener itemClickListener; //khai báo interface

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txtName);
            screenSize = itemView.findViewById(R.id.txtOS);
            operatingSystem = itemView.findViewById(R.id.txtSize);
            companyName = itemView.findViewById(R.id.txtCompanyName);
            rom = itemView.findViewById(R.id.txtRom);
            //url = itemView.findViewById(R.id.txtUrl);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nameData = name.getText().toString();
                    //String companyNameData = companyName.getText().toString();
                    //String romData = rom.getText().toString();
                    //String backCameraData = backCamera.getText().toString();
                    String screenSizeData = screenSize.getText().toString();


                    Intent intent = new Intent(v.getContext(), ShowDetailActivity.class);
                    // intent.putExtra("data", Mobie[].class.toString());


                    intent.putExtra("Name", nameData);
                    intent.putExtra("Company Name", (Parcelable) companyName);
                    //intent.putExtra("Rom", romData);
                    //  intent.putExtra("Back Camera", backCameraData);
                    intent.putExtra("Screen Size", screenSizeData);

                    v.getContext().startActivity(intent);

                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    Toast.makeText(mContext, "Long item clicked " + name.getText(), Toast.LENGTH_SHORT).show();
                    return true;
                }
            });


        }

        public void setItemClickListener(ItemClickListener itemClickListener) {

            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), false); //gọi interface, false ở đây vì là onClick

        }

        @Override
        public boolean onLongClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), true); //gọi interface, true ở đây là vì onLongClick
            return true;
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = mLayoutInflater.inflate(R.layout.mobie_list, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Mobie mobie = mobieList[position];
        holder.name.setText(mobie.getName());
        holder.screenSize.setText(mobie.getOperatingSystem());
        holder.operatingSystem.setText(mobie.getScreenSize());
        //holder.companyName.setText(mobie.getCompanyName());
         // holder.rom.setText(mobie.getRom());
        //  holder.backCamera.setText(mobie.getBackCamera());

        //holder.url.setText(mobie.getUrl());


    }

    @Override
    public int getItemCount() {
        return mobieList.length;
    }

}
