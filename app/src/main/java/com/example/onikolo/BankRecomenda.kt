package com.example.onikolo

class BankRecomenda (private val amount: Int) {

    var sc_charge: Double = ((amount / 100)).toDouble()


    fun init(bankName: String, rate: Double, charges: Double, reward: Double): BankModel {
        return BankModel(bankName, rate, charges, reward)
    }

    fun checkReward(rate: Double): Double {
        return rate / 100 * amount
    }

    fun printChargeForSc(): Double {
        return sc_charge
    }

    fun checkforGt(): BankModel {
        var reward = checkReward(GT_RATE) - GT_CHARGE
        if (reward > 5000){
            reward = 5000.0
            return init("Glory Trust", GT_RATE, GT_CHARGE, reward)
        }
        else {
            return init("Glory Trust", GT_RATE, GT_CHARGE, reward)
        }
    }

    fun checkforAb(): BankModel {
        var reward = checkReward(AB_RATE) - AB_CHARGE
        if (reward > 7000.0){
            reward = 7000.0
            return init("Apex Bank", AB_RATE, AB_CHARGE, reward)
        }else{
            return init("Apex Bank", AB_RATE, AB_CHARGE, reward)
        }

    }

    fun checkforSc(): BankModel {

        System.out.println(" hey" + sc_charge)
        var reward = checkReward(SC_RATE) - printChargeForSc()
        if (reward> 10000.0){
            reward = 10000.0
            return init("Standard Charts", SC_RATE, sc_charge, reward)
        }
        else{
            return init("Standard Charts", SC_RATE, sc_charge, reward)
        }}


    fun getResultInHashSet(): HashSet<BankModel> {
        var hashSetOfResults = HashSet<BankModel>()
        hashSetOfResults.add(checkforGt())
        hashSetOfResults.add(checkforAb())
        hashSetOfResults.add(checkforSc())
        return hashSetOfResults
    }

    fun getGreatest(): BankModel {
        var hashetOfBank = getResultInHashSet()
        val sortedValues = mutableListOf<BankModel>()
        for (eachBankModel in hashetOfBank) {
            sortedValues.add(eachBankModel)
        }
        sortedValues.sortBy { it.reward }
        return sortedValues.get(2)
    }


    companion object {
        val GT_RATE = 5.75
        val AB_RATE = 6.00
        val SC_RATE = 6.25
        val GT_CHARGE = 70.0
        val AB_CHARGE = 120.0
    }
}