package com.application.dailycaloriesmanagement.ui.calculator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.application.dailycaloriesmanagement.R;

import static java.lang.String.valueOf;

public class CalculatorFragment extends Fragment {

    EditText age, height, weight, dailyCalories;
    RadioGroup mf;
    RadioButton m, f;
    Button calculateButton;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        age = view.findViewById(R.id.ageEditText);
        height = view.findViewById(R.id.heightEditText);
        weight = view.findViewById(R.id.weightEditText);
        m = view.findViewById(R.id.maleRadioBtn);
        f = view.findViewById(R.id.FemaleRadioBtn);
        mf = view.findViewById(R.id.mfRadioGroup);
        dailyCalories = view.findViewById(R.id.caloriesEditText);
        calculateButton = view.findViewById(R.id.calculator_Btn);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageText = age.getText().toString().trim();
                String heightText = height.getText().toString().trim();
                String weightText = weight.getText().toString().trim();

                if (mf.getCheckedRadioButtonId() == -1) {
                } else if (ageText.isEmpty()) {
                    age.setError("Please enter age");
                    age.requestFocus();
                } else if (heightText.isEmpty()) {
                    height.setError("Please enter Height");
                    height.requestFocus();
                } else if (weightText.isEmpty()) {
                    weight.setError("Please enter weight");
                    weight.requestFocus();
                } else {
                    if (f.isChecked()) {
                        Integer a = Integer.parseInt(ageText);
                        Integer h = Integer.parseInt(heightText);
                        Integer w = Integer.parseInt(weightText);
                        double result = 9.247 * w + 3.098 * h - 4.330 * a + 447.593;
                        dailyCalories.setText(valueOf(result));
                    } else if (m.isChecked()) {
                        Integer a = Integer.parseInt(ageText);
                        Integer h = Integer.parseInt(heightText);
                        Integer w = Integer.parseInt(weightText);
                        double result = 13.397 * w + 4.799 * h - 5.677 * a + 88.362;
                        dailyCalories.setText(valueOf(result));
                    }
                }
            }
        });
    }
}