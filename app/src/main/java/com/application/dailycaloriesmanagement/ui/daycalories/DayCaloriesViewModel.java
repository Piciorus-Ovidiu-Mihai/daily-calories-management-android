package com.application.dailycaloriesmanagement.ui.daycalories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DayCaloriesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DayCaloriesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}