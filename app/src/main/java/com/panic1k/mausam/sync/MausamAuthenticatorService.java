package com.panic1k.mausam.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Sanjay on 02/06/17.
 */

public class MausamAuthenticatorService extends Service {



    private MausamAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new MausamAuthenticator(this);
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
