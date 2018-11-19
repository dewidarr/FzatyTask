package com.example.dewidar.fzatytask;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment_waitting extends Fragment {
    private static RecyclerView recyclerView;
    private RecycleAdapter_waiting recycleAdapter_waiting;
    private ArrayList<waitinglist> waitinglists;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.waiting_frag, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycleviewWaiting);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        waitinglists = new ArrayList<>();

        waitinglists.add(new waitinglist(R.drawable.type_car, "رجال", "ابى اروح الهايبر وما عندى سيارة ممكن حد يودينى", "منذ ساعه", "فزعة سيارة", null, "2 فزعوا"));
        waitinglists.add(new waitinglist(R.drawable.type_food, "سيدات", "بنات ضرورى عندى عزومة وابى حد يساعدنى", "منذ ساعه", "فزعة اكل", null, "3 فزعوا"));
        waitinglists.add(new waitinglist(R.drawable.type_car, "رجال", "ابى اروح الهايبر وما عندى سيارة ممكن حد يودينى", "منذ ساعه", "فزعة سيارة", null, "2 فزعوا"));
        waitinglists.add(new waitinglist(R.drawable.type_food, "سيدات", "بنات ضرورى عندى عزومة وابى حد يساعدنى", "منذ ساعه", "فزعة اكل", null, "3 فزعوا"));
        waitinglists.add(new waitinglist(R.drawable.type_car, "رجال", "ابى اروح الهايبر وما عندى سيارة ممكن حد يودينى", "منذ ساعه", "فزعة سيارة", null, "2 فزعوا"));
        waitinglists.add(new waitinglist(R.drawable.type_food, "سيدات", "بنات ضرورى عندى عزومة وابى حد يساعدنى", "منذ ساعه", "فزعة اكل", null, "3 فزعوا"));


        recycleAdapter_waiting = new RecycleAdapter_waiting(getContext(), waitinglists);
        recyclerView.setAdapter(recycleAdapter_waiting);
    }
}
