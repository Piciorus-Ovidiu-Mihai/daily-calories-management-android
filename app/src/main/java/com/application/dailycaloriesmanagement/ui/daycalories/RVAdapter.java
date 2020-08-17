package com.application.dailycaloriesmanagement.ui.daycalories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.application.dailycaloriesmanagement.R;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    PersonViewHolder personViewHolder;
    private List<Calories> persons;
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int i) {
        Calories person = persons.get(i);
        TextView textView = holder.personName;
        TextView textview1 = holder.personAge;
        textView.setText(person.getName());
        textview1.setText(person.getAge());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }



    public RVAdapter(List<Calories> persons){
        this.persons = persons;
    }
    @Override
    public int getItemCount() {
        return persons.size();
    }

    // This method creates an ArrayList that has three Calories objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personAge;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
        }
    }
}