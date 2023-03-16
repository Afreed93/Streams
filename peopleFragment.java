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

import com.example.streams.PeopleModel;
import com.example.streams.R;
import com.example.streams.RecyclerHistory_Adapter;
import com.example.streams.RecyclerPeopleAdapter;
import com.example.streams.item_Model;

import java.util.ArrayList;
import java.util.List;

public class peopleFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<PeopleModel> contactList;
    RecyclerPeopleAdapter peopleAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_people, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        contactList=new ArrayList<>();
        contactList.add(new PeopleModel(R.drawable.person,"Afreed","On Desktop","-------------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Aslam","On Mobile","---------------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Arshad","On Mobile","--------------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Akram","On Desktop","--------------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Shafi","Stepped out","-------------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Atheeq","On Desktop","-------------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Aahid","On Desktop","--------------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Abeena","On Desktop","-------------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Shabeena","On Desktop","-----------------------------------------------------------------------------------"));
        contactList.add(new PeopleModel(R.drawable.person,"Salman","On Desktop","-------------------------------------------------------------------------------------"));


        recyclerView = view.findViewById(R.id.recyclerView2);
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        peopleAdapter = new RecyclerPeopleAdapter(contactList);
        recyclerView.setAdapter(peopleAdapter);

    }
}