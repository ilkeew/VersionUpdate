package cn.dagongniu.oax.updatedemotest;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;


/**
 * 类描述：gosn util
 */

public class GsonUtils {


    public static <T> T decodeJSON(String jsonString, Class<T> cls) {
        Gson gson = new Gson();
        T model = gson.fromJson(jsonString, cls);
        return model;
    }

}