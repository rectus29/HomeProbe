package fr.alexandrebernard.homeprobe;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.valashko.xaapi.XaapiException;
import com.valashko.xaapi.device.XiaomiGateway;

import java.io.IOException;
public class MainActivity extends AppCompatActivity {


	@Override
	protected void onStart() {
		super.onStart();

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		final TextView pgTextView = findViewById(R.id.powerGridLabel);
		final TextView networkTextView = findViewById(R.id.networkLabel);

//		ActivityViewModel model = ViewModelProviders.of(this).get(ActivityViewModel.class);
//
//		Observer<String> aqaraObserver = new Observer<String>() {
//			@Override
//			public void onChanged(@Nullable String o) {
//				tv.setText(o);
//			}
//		};
//		model.getPlop().observe(this, aqaraObserver);
	}


	private boolean isNetworkAvailable() {
		ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
		return activeNetworkInfo != null && activeNetworkInfo.isConnected();
	}

}
