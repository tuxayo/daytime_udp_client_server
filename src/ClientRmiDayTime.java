import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRmiDayTime {

	public static void main(String[] args) throws RemoteException,
			NotBoundException {
		String adrServeur = "localhost";

		Registry registry = LocateRegistry.getRegistry(adrServeur);
		DayTimeInterface stubReferenceToRemoteObject = (DayTimeInterface) registry
				.lookup("daytime");
		System.out.println(stubReferenceToRemoteObject.getDayTime());
	}

}