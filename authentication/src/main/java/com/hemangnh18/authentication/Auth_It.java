package com.hemangnh18.authentication;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;

import static android.content.Context.KEYGUARD_SERVICE;

public class Auth_It {

    Activity context;

    public static int AUTH_KEY=500;
    public Auth_It(Activity context)
    {
        this.context = context;
    }

    public void Authenticate()
    {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            KeyguardManager km = (KeyguardManager) context.getSystemService(KEYGUARD_SERVICE);

            if (km.isKeyguardSecure()) {
                Intent authIntent = km.createConfirmDeviceCredentialIntent("Authentication", "Hemang!");
                context.startActivityForResult(authIntent,AUTH_KEY);
            }
        }
    }

}
