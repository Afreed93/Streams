package com.example.streams.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.streams.R;
import com.example.streams.RecyclerHistory_Adapter;
import com.example.streams.item_Model;

import java.util.ArrayList;
import java.util.List;

public class historyFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<item_Model> userList;
    RecyclerHistory_Adapter history_adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        userList = new ArrayList<>();
        userList.add(new item_Model(R.drawable.person, "Afreed", "10.45 PM", "How are You.?", "---------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person4, "Prathap", "01.45 PM", "Where are You.?", "-------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person2, "Vandhana", "10.30 AM", "What are You Doing.?", "------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.blank, "Aslam", "02.00 PM", "How are You.?", "----------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person, "Arshad", "08.30 AM", "How are You.?", "---------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person, "Akram", "06.36 PM", "How are You.?", "----------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person, "Aahid", "07.10 AM", "How are You.?", "----------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person, "Shafi", "03.45 PM", "How are You.?", "----------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person, "Atheeq", "04.53 PM", "How are You.?", "---------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person, "Abeena", "05.23 AM", "How are You.?", "---------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person, "Shabeena", "10.45 AM", "How are You.?", "-------------------------------------------------------------------------"));
        userList.add(new item_Model(R.drawable.person, "Afreed", "9.02 PM", "How are You.?", "---------------------------------------------------------------------------"));

        recyclerView = view.findViewById(R.id.recycle_view);
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        history_adapter = new RecyclerHistory_Adapter(userList);
        recyclerView.setAdapter(history_adapter);


    }
}

