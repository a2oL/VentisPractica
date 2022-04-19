package mx.org.aad.ventispractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.view.get
import androidx.lifecycle.Observer
import mx.org.aad.ventispractica.databinding.*
import mx.org.aad.ventispractica.view.fragments.FragmentActualizar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingF1: Fragment1Binding
    private lateinit var bindingF2: Fragment2Binding
    private lateinit var bindingF3: Fragment3Binding

    private  val fragmentsViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        fragmentsViewModel.fragmentModel.observe(this, Observer {
            Log.e("ED",it.descripcion)
        })
    }
}