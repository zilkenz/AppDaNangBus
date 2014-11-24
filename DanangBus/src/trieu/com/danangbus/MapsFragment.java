package trieu.com.danangbus;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;


public class MapsFragment extends FragmentActivity {

	GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_maps);

		// Getting reference to SupportMapFragment of the activity_main
		SupportMapFragment fm = (SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map);

		// Getting Map for the SupportMapFragment
		map = fm.getMap();

		// Enable/Disable MyLocation Button in the Map
		map.setMyLocationEnabled(true);

		// Enable/Disable Zoom Control 
		map.getUiSettings().setZoomControlsEnabled(true);

		// Sieu Thi
				ViewPoint(16.066474, 108.186791, 15, 0, 0);

				// creat Maker Da Nang - Viet Nam
				CreatMaker(16.066474, 108.186791, "Siêu Thị ", " Coopmart  ");
				
				// creat Maker Ha Noi - Viet Nam with custom icon maker
				// unlock src to test funtion
				//CreatMakerWithDrawable(21.02785, 105.852283, "Ha Noi", " Hoan Kiem Ha Noi Viet Nam",R.drawable.ic_launcher);

				// draw line on Map
				drawLine(16.066474, 108.186791, 16.066474, 108.186791);

		// viewPoint Da Nang
		ViewPoint(16.075568, 108.169605, 15, 0, 0);

		// creat Schooll Da Nang - Viet Nam
		CreatMaker(16.075568, 108.169605, "Đà Nẵng", " Trường Cao Đẳng Thực Hành FPT Đà Nẵng ");
		
		// creat Maker Ha Noi - Viet Nam with custom icon maker
		// unlock src to test funtion
		//CreatMakerWithDrawable(21.02785, 105.852283, "Ha Noi", " Hoan Kiem Ha Noi Viet Nam",R.drawable.ic_launcher);

		// draw line on Map
		drawLine(16.075568, 108.169605, 16.075568, 108.169605);
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void drawLine(double lat1, double long1, double lat2, double long2) {

		// draw a line have location (lat1,long1) & (lat2,long2)
		map.addPolyline(new PolylineOptions()
				.add(new LatLng(lat1, long1), new LatLng(lat2, long2)).width(5)
				.color(Color.RED));

	}

	private void CreatMaker(double latitude, double longitude, String mTitle,
			String mSnippet) {
		map.addMarker(new MarkerOptions()
				.position(new LatLng(latitude, longitude))
				.title(mTitle)
				.snippet(mSnippet)
				.icon(BitmapDescriptorFactory
						.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
	}

	// creat maker with icon is image
	private void CreatMakerWithDrawable(double latitude, double longitude,
			String mTitle, String mSnippet, int icon) {
		map.addMarker(new MarkerOptions()
				.position(new LatLng(latitude, longitude)).title(mTitle)
				.snippet(mSnippet)
				.icon(BitmapDescriptorFactory.fromResource(icon)));
	}

	private void ViewPoint(double lattitude, double longitude, float mZoom,
			float mtilt, float mbearing) {

		// Init View Position
		CameraPosition mPosition = new CameraPosition(new LatLng(lattitude,
				longitude), mZoom, mtilt, mbearing);

		// update camera
		map.animateCamera(CameraUpdateFactory.newCameraPosition(mPosition));

	}

}
