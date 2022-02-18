package com.paypal.android.ui.paypal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PayPalViewModel : ViewModel() {

    val statusTitle: MutableLiveData<String> = MutableLiveData("")
    val statusText: MutableLiveData<String> = MutableLiveData("")
    val isLoading: MutableLiveData<Boolean> = MutableLiveData(false)
}