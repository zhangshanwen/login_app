package com.example.login_app.data.model;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

public class Base {
    public JSONObject toJsonObject() throws JSONException {
        Gson gson = new Gson();
        return new JSONObject(gson.toJson(this));
    }
}
