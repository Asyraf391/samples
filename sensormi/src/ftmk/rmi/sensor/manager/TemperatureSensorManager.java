package ftmk.rmi.sensor.manager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import ftmk.rmi.sensor.TemperatureSensor;
/**
* This class manage the value of temperature from the sensor.
*
* @author AsyrafHanif
*
*/
public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor {
	
		private static final long serialVersionUID = 1L;
		
		private HashMap<String, Integer> temperatures = new HashMap<>();
		
		public TemperatureSensorManager() throws RemoteException {
			
			super();
			this.loadTemperatureData();
			
		}
		
		@Override 
		public int getTemperature() throws RemoteException {
			
			return 35;
		}
		@Override
		public int getDailyTemperature(String day) throws RemoteException {
			
			return this.temperatures.getOrDefault(day, 0);
		}
		@Override
		public int getWeeklyTemperatureAverage() throws RemoteException {
			
			int sumOfTemperature = 0;
			for (Integer value : this.temperatures.values())
				sumOfTemperature += value;
			return sumOfTemperature / this.temperatures.size();
		}
		private void loadTemperatureData() {
			this.temperatures.put("Monday", 32);
			this.temperatures.put("Tuesday", 31);
			this.temperatures.put("Wednesday", 33);
			this.temperatures.put("Thursday", 35);
			this.temperatures.put("Friday", 36);
			this.temperatures.put("Saturday", 33);
			this.temperatures.put("Sunday", 33);
		}
	}
