package com.example.www.smartgate.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.www.smartgate.ActivityRecyclerView.OrdersAdapter;
import com.example.www.smartgate.ActivityRecyclerView.OrdersModel;
import com.example.www.smartgate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivityFragment extends Fragment {


    private OrdersAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private List<OrdersModel> ordersModelList;
    public ActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_activity, container, false);
        // Inflate the layout for this fragment
        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.orders_recyclerView);
        ordersModelList = new ArrayList<>();
        mAdapter = new OrdersAdapter(getContext(),ordersModelList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);

        recyclerViewData();

        return rootView;
    }

    private void recyclerViewData(){
        OrdersModel orders = new OrdersModel("Delivery","PreAllowed by Aditya Chaurasiya","Sai nath","1 mg","11:21 AM");
        ordersModelList.add(orders);
        mAdapter.notifyDataSetChanged();
    }

}
