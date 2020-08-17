package com.application.dailycaloriesmanagement.ui.foodlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.application.dailycaloriesmanagement.R;

import java.util.List;

public class FoodAdapter extends
        RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private List<Food> mContacts;
    // Pass in the contact array into the constructor
    public FoodAdapter(List<Food> contacts) {
        mContacts = contacts;
    }
    // ... constructor and member variables

    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.itemrow, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the itemrow through holder
    @Override
    public void onBindViewHolder(FoodAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        Food contact = mContacts.get(position);
        // Set itemrow views based on your views and data model
        TextView textView = holder.nameTextView;
        textView.setText(contact.getmName());
        TextView textView1 = holder.message;
        textView1.setText(contact.getmDescription()+contact.getmCalories());

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mContacts.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public TextView message;
        // We also create a constructor that accepts the entire itemrow row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
            message = (TextView) itemView.findViewById(R.id.message);
        }
    }

}
