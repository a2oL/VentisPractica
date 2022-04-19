package mx.org.aad.ventispractica

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.org.aad.ventis.FragmentsModel
import mx.org.aad.ventis.FragmentProvider

class MainViewModel :ViewModel() {
    val fragmentModel = MutableLiveData<FragmentsModel>()
    fun randomTitulo() {
        val nuevoTitulo = FragmentProvider.random()
        fragmentModel.postValue(nuevoTitulo)
    }
}