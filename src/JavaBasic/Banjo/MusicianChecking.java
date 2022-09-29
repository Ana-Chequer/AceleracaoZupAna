package JavaBasic.Banjo;

public class MusicianChecking {

	public boolean checkingStartName(String nome) {

		if ((nome.startsWith("R")) || (nome.startsWith("r"))) {
			return true; 

		} else {
			return false;
		}

	}
	
	public String checkingPlayingBanjo(boolean answer, String nome) {
		String resultado = nome + " does not play banjo";
		
		if(answer == true) {
			resultado = nome + " plays banjo";	
		}	
		
		return resultado;
	}

}
