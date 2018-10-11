package fr.alexandrebernard.homeprobe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;

/*-----------------------------------------------------*/
/*                                                     */
/*                Date: 11/10/2018 14:28               */
/*                 All right reserved                  */
/*-----------------------------------------------------*/
public class PowerConnectionReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
		boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
				status == BatteryManager.BATTERY_STATUS_FULL;


		int chargePlug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
		boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
		boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;
		//remove some variables if you don't need it.
	}
}