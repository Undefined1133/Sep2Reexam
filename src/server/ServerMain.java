package server;

import server.Database.ManagerFactory;
import server.model.classes.mediator.RemoteModel;
import server.model.classes.mediator.RemoteModelManager;
import server.model.ServerModel;
import server.model.ServerModelManager;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class ServerMain {
    public static void main(String[] args) throws MalformedURLException, RemoteException {
        ServerModel serverModel = new ServerModelManager();
        RemoteModel remoteModel = new RemoteModelManager(serverModel);
        ManagerFactory managerFactory = new ManagerFactory();





    }
}
