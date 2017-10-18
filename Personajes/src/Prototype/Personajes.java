package Prototype;

public class Personajes implements Cloneable {
	
	  private String nombre;
      private String arma;
	  private String escudo;
	  
	  @Override
	    public Personajes clone() {
	        Personajes PersonajeClonado = null;
	        try {
	        	PersonajeClonado = (Personajes) super.clone();
	        	PersonajeClonado.setEscudo(escudo);
	        	PersonajeClonado.setArma(arma);
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        } // catch	
	        return PersonajeClonado;
	    } // method clone

	    private void setArma(String arma) {
		// TODO Auto-generated method stub
		
	}

		private void setEscudo(String escudo) {
		// TODO Auto-generated method stub
		
	}
		
		private void setNombre(String nombre) {
			// TODO Auto-generated method stub
			
		}

		public String helloPersonaje() {
	        return "El personaje es" + getNombre() + "con un arma " + getArma()+"Y un escudo:"+getEscudo();
	    }

		private String getNombre() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getArma() {
			// TODO Auto-generated method stub
			return null;
		}
		
		private String getEscudo() {
			// TODO Auto-generated method stub
			return null;
		}
	  

}
