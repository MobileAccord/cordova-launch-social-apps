package com.mobileaccord.geopoll.plugins;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.net.Uri;

/**
 * This class echoes a string called from JavaScript.
 */
public class SocialAppsLauncher extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("launchFaceBook")) {
            String id = args.getString(0);
            String url = args.getString(1);
            this.launchFaceBook(id, url, callbackContext);
            return true;
        } else if (action.equals("launchTwitter")) {
            String id = args.getString(0);
            String url = args.getString(1);
            this.launchTwitter(id, url, callbackContext);
            return true;
        }
        return false;
    }

    private void launchFaceBook(String id, String url, CallbackContext callbackContext) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/" + id));
            this.cordova.getActivity().startActivity(intent);
            callbackContext.success("OK");
        } catch (Exception e) {
            this.cordova.getActivity().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + url)));
            callbackContext.success("OK");
        }
    }

    private void launchTwitter(String id, String url, CallbackContext callbackContext) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=" + id));
            this.cordova.getActivity().startActivity(intent);
            callbackContext.success("OK");
        }catch (Exception e) {
            this.cordova.getActivity().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/" + url)));
            callbackContext.success("OK");
        }
    }
}
