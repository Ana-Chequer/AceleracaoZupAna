package JavaBasic.Banjo;

public class Banjo {

	public static void main(String[] args) {
	
		Musician musician = new Musician();
		musician.setNome("Ramon");
		
		MusicianChecking musicianChecking = new MusicianChecking();
		boolean check = musicianChecking.checkingStartName(musician.getNome());
		String answer = musicianChecking.checkingPlayingBanjo(check, musician.getNome());
		System.out.println(answer);
		
	
	}

	

}
