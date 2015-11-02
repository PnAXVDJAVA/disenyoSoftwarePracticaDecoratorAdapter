package yeee;

public class EjemploDecorador {
	
	public abstract class Componente{
	    abstract public void operacion();
	 }
	 
	 public class ComponenteConcreto extends Componente{
	    public void operacion(){
	        System.out.println("ComponenteConcreto.operacion()");
	    }
	 }
	 
	 public abstract class Decorador extends Componente{
	    private Componente _componente;
	 
	        public Decorador(Componente componente){
	                _componente = componente;
	        }
	 
	        public void operacion(){
	                _componente.operacion();
	        }
	 }
	 
	 public class DecoradorConcretoA extends Decorador{
	        private String _propiedadAñadida;
	 
	        public DecoradorConcretoA(Componente componente){
	            super(componente);
	        }
	 
	        public void operacion(){
	                super.operacion();
	                _propiedadAñadida = "Nueva propiedad";
	                System.out.println("DecoradorConcretoA.operacion()");
	        }
	 }
	 
	 public class DecoradorConcretoB extends Decorador{
	    public DecoradorConcretoB(Componente componente){
	        super(componente);
	    }
	 
	        public void operacion(){
	                super.operacion();
	                comportamientoAñadido();
	                System.out.println("DecoradorConcretoB.operacion()");
	        }
	 
	        public void comportamientoAñadido(){
	                System.out.println("Comportamiento B añadido");
	        }
	 }
	 
	 public class Cliente{
	        public void main(String[] args){
	                ComponenteConcreto c = new ComponenteConcreto();
	                DecoradorConcretoA d1 = new DecoradorConcretoA(c);
	                DecoradorConcretoB d2 = new DecoradorConcretoB(d1);
	                d2.operacion();
	        }
	 }
}

