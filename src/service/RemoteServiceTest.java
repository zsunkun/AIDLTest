package service;

import aidl.calculate.ICalculateService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class RemoteServiceTest extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return new ICalculateServiceImpl();
	}

	private class ICalculateServiceImpl extends ICalculateService.Stub {

		@Override
		public double calcul(double one, double two) throws RemoteException {
			return one + two;
		}

	}

}
