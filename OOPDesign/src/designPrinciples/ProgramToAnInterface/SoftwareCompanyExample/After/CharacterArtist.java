package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

public class CharacterArtist implements Employee {

	private void sketch(){
		System.out.println("The artist is sketching a character");
	}
	private void digitalize() {
		System.out.println("The artist is digitalizing the character");
	}
	
	@Override
	public void doWork() {
		sketch();
		digitalize();
	}

}
