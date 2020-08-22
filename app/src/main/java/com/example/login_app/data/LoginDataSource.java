package com.example.login_app.data;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.example.login_app.MainActivity;
import com.example.login_app.R;
import com.example.login_app.data.model.LoggedInUser;

import java.io.IOException;

import com.google.gson.Gson;

import com.example.util.util.NetRequest;
import org.json.JSONObject;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(Context context, String username, String password) {
        try {
            NetRequest netRequest = new NetRequest();
            String url = context.getString(R.string.host) + context.getString(R.string.login);
            Log.i("----url----", url);
            Toast.makeText(context, url, Toast.LENGTH_LONG).show();
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            "1",
                            username);
            netRequest.sendPost(context, url, fakeUser.toJsonObject());
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
