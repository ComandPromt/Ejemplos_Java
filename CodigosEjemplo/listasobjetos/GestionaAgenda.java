package listasobjetos;

public class GestionaAgenda{
	public static void main(String[] args){
		Agenda agenda = new Agenda();
		Persona p= new Persona("Juan", "111");
		try{
			agenda.aņadePersona(p);
			p= new Persona("Antonio", "222");
			agenda.aņadePersona(p);
			p= new Persona("Manuel","333");
			agenda.aņadePersona(p);
			agenda.aņadePersona(p);
			agenda.borraPersona(p);
			agenda.aņadePersona(p);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(agenda.muestraListaPersona());
	}
}
