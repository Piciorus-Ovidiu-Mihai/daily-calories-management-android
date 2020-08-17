package com.application.dailycaloriesmanagement.ui.foodlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.application.dailycaloriesmanagement.R;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    private FoodViewModel galleryViewModel;
    EditText nameFood,caloriesPerGram,gramFood;
    Button addingBtn;
    RecyclerView list;
    ArrayList<Food> listofFood;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(FoodViewModel.class);
        View root = inflater.inflate(R.layout.fragment_foodlist, container, false);

        return root;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        nameFood = view.findViewById(R.id.nameoffood);
        caloriesPerGram = view.findViewById(R.id.gramsoffood);
        gramFood = view.findViewById(R.id.caloriesperfood);

        addingBtn = view.findViewById(R.id.buttonAdd);
        RecyclerView rvContacts = (RecyclerView) view.findViewById(R.id.rvContacts);

        listofFood = Food.createContactsList();


        addingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Attach
                // the adapter to the recyclerview to populate items
                listofFood.add(new Food(nameFood.toString(),caloriesPerGram.toString() , gramFood.toString()));

            }
        });
        FoodAdapter adapter = new FoodAdapter(listofFood);
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(getContext()));
        // That's all!


    }
}