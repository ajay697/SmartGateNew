package com.example.www.smartgate.ActivityRecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.www.smartgate.R;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.MyViewHolder> {

    List<OrdersModel> ordersModelsList;
    private Context mContext;
    public OrdersAdapter(Context mContext,List<OrdersModel> ordersModelsList){
        this.mContext = mContext;
        this.ordersModelsList = ordersModelsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.order_recycler_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        OrdersModel mOrders = ordersModelsList.get(position);
        holder.serviceNameTextView.setText(mOrders.getServiceName());
        holder.orderedByTextView.setText(mOrders.getOrderedBy());
        holder.timeTextView.setText(mOrders.getTime());
        holder.serviceProviderNameTextView.setText(mOrders.getServiceProviderName());
        holder.serviceProviderIdTextView.setText(mOrders.getServiceProviderId());

    }

    @Override
    public int getItemCount() {
        return ordersModelsList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView serviceNameTextView,orderedByTextView,
        serviceProviderNameTextView,serviceProviderIdTextView,timeTextView;
        public ImageView sellerImage,productImage,iconImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            serviceNameTextView = (TextView)itemView.findViewById(R.id.service_name_textView);
            orderedByTextView = (TextView)itemView.findViewById(R.id.service_orderedBy_textView);
            serviceProviderNameTextView = (TextView)itemView.findViewById(R.id.service_provider_name_textview);
            serviceProviderIdTextView = (TextView)itemView.findViewById(R.id.provider_id_textview);
            timeTextView = (TextView)itemView.findViewById(R.id.time_textView);
        }
    }
}
