import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.GregorianCalendar;

public class DayTimeImpl extends UnicastRemoteObject implements
		DayTimeInterface {
	private static final long serialVersionUID = -4695476117949241267L;

	public DayTimeImpl() throws RemoteException {
	}

	@Override
	public String getDayTime() {
		return new GregorianCalendar().getTime().toString();
	}
}
