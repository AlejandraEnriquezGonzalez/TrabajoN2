package cl.isisur.pruebamapag02;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.pruebamapag02.databinding.ActivityMapsBinding;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng Lugares = new LatLng(-36.603367, -72.091297);
        LatLng Lugares1 = new LatLng(-36.604587, -72.083914);
        LatLng Lugares2 = new LatLng(-36.6119628,-72.07268723);
        LatLng Grez = new LatLng(-36.602517302817866,-72.10115649861793);
        LatLng Felipe =new LatLng(-36.635414, -71.996863);


        mMap.addMarker(new MarkerOptions().position(Lugares).title("Heladeria y Cafeteria Cremossos"));
        mMap.addMarker(new MarkerOptions().position(Lugares1).title("Cecinas Ramos Cordillera"));
        mMap.addMarker(new MarkerOptions().position(Grez).title("Grez y Ulloa"));
        mMap.addMarker(new MarkerOptions().position(Felipe).title("Felipe"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugares2));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0f);


    }
}