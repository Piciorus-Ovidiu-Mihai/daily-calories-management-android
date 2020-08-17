package com.application.dailycaloriesmanagement.ui.daycalories;

import java.util.ArrayList;
import java.util.List;

class Calories {
    String name;
    String age;

    Calories(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

