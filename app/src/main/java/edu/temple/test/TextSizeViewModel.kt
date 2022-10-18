package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextSizeViewModel : ViewModel() {

    private val textSize : MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()

    }
    fun getTextSize() : LiveData<Int> {
        return textSize
    }
    fun setTextSize(size:Int){
        textSize.value = size
    }


}