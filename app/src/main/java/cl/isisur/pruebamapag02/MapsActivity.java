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

        LatLng Lugar1 = new LatLng(-36.61042, -72.10074);
        LatLng Lugar2 = new LatLng(-36.615036, -72.101774);
        LatLng Lugar3 = new LatLng(-36.588602, -72.084995);
        LatLng Lugar4 = new LatLng(-36.610559, -72.103945);
        LatLng Alejandra =new LatLng(-36.627504, -72.029472);


        mMap.addMarker(new MarkerOptions().position(Lugar1).title("Tostaduria Saldaña"));
        mMap.addMarker(new MarkerOptions().position(Lugar2).title("Punto Granel"));
        mMap.addMarker(new MarkerOptions().position(Lugar3).title("Mercado Trunkay"));
        mMap.addMarker(new MarkerOptions().position(Lugar4).title("Frutos del País Claro de Luna"));
        mMap.addMarker(new MarkerOptions().position(Alejandra).title("Alejandra"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugar3));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0f);


    }
}