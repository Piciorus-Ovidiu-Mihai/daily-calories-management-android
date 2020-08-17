package com.application.dailycaloriesmanagement.ui.daycalories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.application.dailycaloriesmanagement.R;
import com.application.dailycaloriesmanagement.ui.foodlist.Food;

import java.util.ArrayList;
import java.util.List;

public class DayCaloriesFragment extends Fragment {

    private DayCaloriesViewModel dayCaloriesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dayCaloriesViewModel =
                ViewModelProviders.of(this).get(DayCaloriesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_daycalories, container, false);
        return root;
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        initializeData();
        RecyclerView rv = (RecyclerView)view.findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        RVAdapter adapter = new RVAdapter(caloriess);
        rv.setAdapter(adapter);

    }
    private List<Calories> caloriess = new ArrayList<Calories>();
;
    // This method creates an ArrayList that has three Calories objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
       Calories p1 = new Calories("Ovidiu","test");
       Calories p2 = new Calories("Ovidiu","test");
       Calories p3 = new Calories("Lapte","200 Kcal");
       Calories p4 = new Calories("Paine","153 Kcal");
       Calories p5 = new Calories("Cascaval","130 Kcal");
       Calories p6 = new Calories("Branza","256 Kcal");
       caloriess.add(p1);
       caloriess.add(p2);
       caloriess.add(p3);
       caloriess.add(p4);
       caloriess.add(p5);
       caloriess.add(p6);

    }
}