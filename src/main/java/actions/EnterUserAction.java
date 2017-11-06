package actions;

import pages.VerfuegerInputPage;

public class EnterUserAction implements Action {

    //TODO: Refactor so other pages may also benefit of the action under consideration
    private VerfuegerInputPage page;

    private String userNumber;

    public EnterUserAction(VerfuegerInputPage page) {
        this.page = page;
    }

    @Override
    public void doIt() {
        this.page.enterUserNumber(this.userNumber);
        this.page.startLogin();
    }

    /**
     * Serves as simple setter method. At this point in time no change to the page happens.
     * @param userNumber Verfüger
     * @return The current action object
     */
    public EnterUserAction as(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
}
