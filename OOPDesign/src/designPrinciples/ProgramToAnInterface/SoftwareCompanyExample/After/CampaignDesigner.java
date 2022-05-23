package designPrinciples.ProgramToAnInterface.SoftwareCompanyExample.After;

public class CampaignDesigner implements Employee {

	private void designingCampains() {
		System.out.println("The designer is disigning a game campaign");
	}
	@Override
	public void doWork() {
		designingCampains();
	}

}
