package com.example.diplomaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.diplomaapp.di.viewModel.ViewModelFactory
import com.example.diplomaapp.ui.sensor.SensorViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: ViewModelFactory
    private val viewModel: SensorViewModel by viewModels { factory }

    private val sensorName: TextView by lazy { findViewById(R.id.sensorName) }
    private val status: TextView by lazy { findViewById(R.id.status) }
    private val lastTrigger: TextView by lazy{ findViewById(R.id.lastTriggered) }
    private val triggerCount: TextView by lazy { findViewById(R.id.triggerCount) }
    private val violationType: TextView by lazy { findViewById(R.id.violationType) }
    private val location: TextView by lazy { findViewById(R.id.location) }
    private val statusInfo: TextView by lazy { findViewById(R.id.statusInfo) }
    private val swipe: SwipeRefreshLayout by lazy { findViewById(R.id.swipe) }


    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as DaggerApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initObserver()


        swipe.setOnRefreshListener {
            viewModel.getSensor()
        }
    }

    private fun initObserver() {
        viewModel.sensorLiveData.observe(this) {sensorItem ->
            swipe.isRefreshing = false
            status.text = sensorItem.status.toString()
            lastTrigger.text = sensorItem.lastTriggered
            triggerCount.text = sensorItem.triggerCount.toString()
            violationType.text = sensorItem.violationType
            location.text = sensorItem.location
            statusInfo.text = sensorItem.statusInfo
        }
    }
}