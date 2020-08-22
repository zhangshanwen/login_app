package com.example.login_app;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;


import static org.junit.Assert.*;

class main {
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.login_app", appContext.getPackageName());
    }
}
