package android.bignerdranch.com;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    double mLat;
    double mLon;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        updateUI();
    }

        private void updateUI() {
            mLat = getIntent().getDoubleExtra("Latitude", 0.0);
            mLon = getIntent().getDoubleExtra("Longitude", 0.0);
            LatLng myPoint = new LatLng(mLat, mLon);
//            MarkerOptions myMarker = new MarkerOptions().position(myPoint).title("Receipt Location");
            int zoomLevel = 15;
            mMap.addMarker(new MarkerOptions().position(myPoint).title("Your Location"));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myPoint, zoomLevel));
//            mMap.clear();
//            mMap.addMarker(myMarker);
//
//            int zoomLevel = 0;
//            CameraUpdate update = CameraUpdateFactory.newLatLngZoom(myPoint, zoomLevel);
//            mMap.animateCamera(update);
            Log.i("UMMM", ""+ myPoint);
//        }

        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }}
