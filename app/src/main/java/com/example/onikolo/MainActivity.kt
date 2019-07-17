package com.example.onikolo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.onikolo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bankViewModel: BankViewModel
    private lateinit var bankModel: BankModel
    private lateinit var bankRecomenda: BankRecomenda
    var amount = 0
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        bankViewModel = ViewModelProviders.of(this).get(BankViewModel::class.java)

        binding.apply {
            amount = amountEt.text.toString().toInt()
        }

        binding.calculateButton.setOnClickListener {

        }


    }

    fun calculate (){
        bankRecomenda = BankRecomenda(amount)
//        bankModel = BankModel()
//        bankViewModel.getMaximum(amount,  )
    }
}
