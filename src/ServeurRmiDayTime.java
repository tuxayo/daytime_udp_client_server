import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRmiDayTime {

	public static void main(String[] args) throws AccessException,
			RemoteException {

		DayTimeImpl object1 = new DayTimeImpl();
		Registry registre = LocateRegistry.getRegistry();
		registre.rebind("daytime", object1);

		System.out.println("Ready!");
	}
}
