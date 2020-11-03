//******************************************************************************
// SCICHART® Copyright SciChart Ltd. 2011-2017. All rights reserved.
//
// Web: http://www.scichart.com
// Support: support@scichart.com
// Sales:   sales@scichart.com
//
// SciChartApp.java is part of the SCICHART® Examples. Permission is hereby granted
// to modify, create derivative works, distribute and publish any part of this source
// code whether for commercial, private or personal use.
//
// The SCICHART® examples are distributed in the hope that they will be useful, but
// without any warranty. It is provided "AS IS" without warranty of any kind, either
// expressed or implied.
//******************************************************************************

package com.scichart.examples;

import android.app.Application;
import android.util.Log;

//BEGIN_DEMO_APPLICATION
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.demo.helpers.Module;
//END_DEMO_APPLICATION

public class SciChartApp extends Application {

    private static SciChartApp sInstance;

    public static SciChartApp getInstance() {
        return sInstance;
    }

    //BEGIN_DEMO_APPLICATION
    private final Module module = new Module(this);
    //END_DEMO_APPLICATION

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        setUpSciChartLicense();
    }

    private void setUpSciChartLicense() {
        // Set your license code here to license the SciChart Android Examples app
        // You can get a trial license key from https://www.scichart.com/licensing-scichart-android/
        // Purchased license keys can be viewed at https://www.scichart.com/profile
        //
        // e.g.
        //
        try {
            SciChartSurface.setRuntimeLicenseKey("2tasaE46GEV+sCdmSTOAFZySM947W7zI1zLlDxFYlieVdcmbWgcKlBTlXn/8hCHWHtjezlvQ/85mg0D0w4TF0BjRZKIs1myMLMy3Dq04ajyfWalr5/ob6HD7zi2DmlTjM5ZKZB0rvwYKdmxEBSmeSftu7Nd6+jtJM+9ywElfmWBx6D+TPhymvnH931lvymuEv8I47ruw4wxjFGMcwI7GpHm0xZRReGEz5qtKcmefW/9iNfrL4/v5pEHY+J7kep5J9qxxgo45hFXBFGlh+WSPILBA+RnLkfhbX1W0Tyw5BV1VEMEQ9kswaqlsBJGcs1EDQpjNOHy/Gg5/Vo6+K9wttB9ebAQUeBRzZQkAYTLnMFXR8Ph7qlDUSufi/RB+7CFKDnQK7F+GVkX+a/K3T9BGZlcxpdc4GNnjvuP5bfLOi5mztV/b2E+Dzv+Tbq875zgJhWFMDPpV6f2tQAqVf8iFW/qakZ0MCWYqN3Atgtg7ckmhgwub1O9jmSknvEP/laTRrtb6jO6B");
        } catch (Exception e){
            e.printStackTrace();
        }


        try {
            com.scichart.charting.visuals.SciChartSurface.setRuntimeLicenseKey("");
        } catch (Exception e) {
            Log.e("SciChart", "Error when setting the license", e);
        }
    }

    //BEGIN_DEMO_APPLICATION
    public final Module getModule() {
        return module;
    }
    //END_DEMO_APPLICATION
}
