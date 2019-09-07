package com.example.intership_mvvm_teams;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NumberViewModel extends ViewModel {
    private MutableLiveData<Integer> number_teamOne;
       private Integer num_teamOne = 0;

    private MutableLiveData<Integer> number_teamTwo;
    private Integer num_teamTwo = 0;

    public MutableLiveData<Integer> getNumber_teamTwo() {
        if (number_teamTwo == null) {
            number_teamTwo = new MutableLiveData<Integer>();
        }
        return number_teamTwo;
    }

    public void incrementTeamTwo() {
        number_teamTwo.setValue(++num_teamTwo);
    }

    public void decremetnTeamTwo() {
        number_teamTwo.setValue(--num_teamTwo);
    }

    public MutableLiveData<Integer> getNumber_teamOne() {
        if (number_teamOne == null) {
            number_teamOne = new MutableLiveData<Integer>();
        }
        return number_teamOne;
    }


    public void incrementTeamOne() {
        number_teamOne.setValue(++num_teamOne);
    }

    public void decremetnTeamOne() {
        number_teamOne.setValue(--num_teamOne);
    }

  }
