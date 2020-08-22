package com.example.login_app.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    public final String displayName;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }
}
