package com.example.geomusic

import android.location.Location
import android.location.LocationListener

class MyLocationListener : LocationListener {
    lateinit var deviceLocation: Location
    override fun onLocationChanged(location: Location) {
        deviceLocation = location
    }
}
