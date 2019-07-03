package lesson35.controller;

import lesson35.model.User;

public class Session {
    private static User authorizedUser;

    public static User getAuthorizedUser() {
        return authorizedUser;
    }

    public static void setAuthorizedUser(User authorizedUser) {
        Session.authorizedUser = authorizedUser;
    }
}
