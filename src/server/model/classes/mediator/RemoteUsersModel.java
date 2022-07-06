package server.model.classes.mediator;



import java.rmi.RemoteException;

public interface RemoteUsersModel {

    boolean login (String password) throws RemoteException;

}
