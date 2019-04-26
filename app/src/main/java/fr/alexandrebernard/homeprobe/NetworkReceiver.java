package fr.alexandrebernard.homeprobe;

import android.app.usage.NetworkStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.widget.Toast;

/*-----------------------------------------------------*/
/*                                                     */
/*                Date: 11/10/2018 14:28               */
/*                 All right reserved                  */
/*-----------------------------------------------------*/
public class NetworkReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if(checkInternet(context))	{
			Toast.makeText(context, "Network Available Do operations",Toast.LENGTH_LONG).show();
		}
	}

	boolean checkInternet(Context context) {
		ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
		return activeNetworkInfo != null && activeNetworkInfo.isConnected();
	}

}