package org.ioniconline;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;
/**
 * This class echoes a string called from JavaScript.
 */
public class MyDemo extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            Log.e("MyDemo", "process the req");
            String str = android.os.Build.VERSION.RELEASE;
            PluginResult r = new PluginResult(PluginResult.Status.OK, str);
            r.setKeepCallback(true);
            callbackContext.sendPluginResult(r);

            return true;
        }
        return false;
    }
}
