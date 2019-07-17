package com.example.onikolo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BankViewModel : ViewModel() {
    val bestBank = MutableLiveData<BankModel>()


    fun getMaximum(r: Int, bankModel: BankModel) {
        var b = BankRecomenda(r)
        var max = b.getGreatest()
        bestBank.postValue(max)

    }
}