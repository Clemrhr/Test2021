package test2021;

import java.util.ArrayList;
import test2021.Fano.Dossard;

public class Server {

	//Declaration des listes
    ArrayList<User> u_listUser;
    ArrayList<Fano> u_listFano;
   

    //Declaration de l'instance du singleton
    private static Server u_instance = null;

    //Constructeur privé
    private Server () {
        u_listUser = new ArrayList<>();
        u_listFano = new ArrayList<>();
        
    }

    //Methode statique d'acces au serveur unique
    public static Server getInstance() {
        if (u_instance == null) {
            u_instance = new Server();
        }
        return u_instance;
    }
    
    //Enregistrement user
    public void addUser(User user, Fano fano) {
        if (user != null) {
            u_listUser.add(user);
        }
    }
    
    //Enregistrement Fano
    public void addFano(Fano fano, Dossard dossard) {
    	if (fano != null) {
    		u_listFano.add(fano);
    		
    	}
    	
    }
    
    //main avec création de fano et user
    public static void main(String[] args) {
    	addFano(1000,46);
    	addFano(2000,10);
    	addUser(premier,46);
    	addUser(second,10);
    	
	}
    
    
    
	
 }
