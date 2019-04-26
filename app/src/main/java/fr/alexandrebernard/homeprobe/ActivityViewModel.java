package fr.alexandrebernard.homeprobe;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.valashko.xaapi.XaapiException;
import com.valashko.xaapi.device.XiaomiGateway;

import java.io.IOException;

/*-----------------------------------------------------*/
/*                     Rectus29                        */
/*                                                     */
/*                   Date: 26/04/2019                  */
/*                 All right reserved                  */
/*-----------------------------------------------------*/
public class ActivityViewModel extends ViewModel {

	private MutableLiveData<String> plop;
	private XiaomiGateway gateway;

	public ActivityViewModel() {
		try {
			gateway = new XiaomiGateway("192.168.1.220").configurePassword("");
			getPlop().setValue(gateway.getSid());
		} catch (XaapiException | IOException e) {
			e.printStackTrace();
		}
	}



	public MutableLiveData<String> getPlop() {
		if (plop == null) {
			plop = new MutableLiveData<String>();
		}
		return plop;
	}
}
