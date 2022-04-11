package Vista;

import Modelo.Bidim;


public class ConstructoresSobre {
    public static void main(String[] args) {
        // TODO code application logic here
        Bidim ob1=new Bidim();
        Bidim ob2=new Bidim(1);
        Bidim ob3=new Bidim(ob1,ob2);
        ob1.impri();
        ob2.impri();
        ob3.impri();
    }
    
}
