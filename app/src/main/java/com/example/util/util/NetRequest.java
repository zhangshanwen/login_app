package com.example.util.util;


import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONObject;


public class NetRequest {
    public void sendPost(final Context context, final String url_address, JSONObject data) {
        RequestQueue queue = Volley.newRequestQueue(context);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.POST, url_address, data, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("-------Response-----", response.toString());
                        Toast.makeText(context, "请求成功" + response.toString(), Toast.LENGTH_LONG).show();

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("-------网络请求错误请稍后再试-----", "网络请求错误请稍后再试");
                        Toast.makeText(context, "网络请求错误,请稍后再试!", Toast.LENGTH_LONG).show();
                    }
                });
        queue.add(jsonObjectRequest);
    }
}