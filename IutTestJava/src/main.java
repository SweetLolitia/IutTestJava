import java.util.UUID;

class Main{
class Classeprincipale {
	public void afficherTexte(){
		System.out.println("Ceci est la classe principale.");
		afficherUUID();
	}
}
 
class ClasseFille extends Classeprincipale{
	public void afficherTexte(){
		System.out.println("Ceci est la classe fille.");
	}
}
 
class SingletonClass{  
	  
private static SingletonClass instance = null;  

static UUID uuid = UUID.randomUUID();
static String randomUUIDString = uuid.toString();

public void afficherUUID(){
	System.out.println(randomUUIDString);
}
  
public SingletonClass getInstance() {  
if (instance == null){  
instance = new SingletonClass();  
}  
return instance;  
  
}  

    public void main(String args[]) {
 
    	Classeprincipale cp = new Classeprincipale();
    	cp.afficherTexte();
 
    	ClasseFille cf = new ClasseFille();
    	cf.afficherTexte();
    }
