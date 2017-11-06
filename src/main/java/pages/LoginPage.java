package pages;

import actions.LoginAction;

public class LoginPage {

    //TODO: extract domain, client-id and environment
    public static String getUrl() {
        return "https://login.fat.sparkasse.at/sts/oauth/authorize?response_type=token&client_id=stsdemo";
    }

    public static LoginAction login() {
        return new LoginAction();
    }

}
