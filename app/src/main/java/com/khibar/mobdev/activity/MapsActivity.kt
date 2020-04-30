package com.khibar.mobdev.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.khibar.mobdev.R
import kotlinx.android.synthetic.main.fragment_map.*

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_map)

        //pakai supportMapFragment
        val map: SupportMapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        map.getMapAsync(this)



//        mapView.getMapAsync {
//            googleMap ->
//            googleMap.addMarker(MarkerOptions().position(LatLng(106.827153, -6.175392)).title("Monas"))
//        }


    }

    override fun onMapReady(map: GoogleMap) {
        val lok = LatLng(-6.259412, 106.878688)
        val update = CameraUpdateFactory.newLatLng(lok)
        val zoom = CameraUpdateFactory.zoomTo(17f)
        map.moveCamera(update)
        map.animateCamera(zoom)
        map.addMarker(
            MarkerOptions()
            .position(lok)
            .title("Toko KhiOs").snippet("Alamatnya di sana"))

    }
    }



