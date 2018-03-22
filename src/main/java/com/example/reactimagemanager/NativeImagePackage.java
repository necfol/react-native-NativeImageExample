package com.example.reactimagemanager;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by Necfol on 3/22/18.
 */

public class NativeImagePackage implements ReactPackage {
        @Override
        public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
            return Collections.emptyList();
        }
        public List<Class<? extends JavaScriptModule>> createJSModules() {
            return Collections.emptyList();
        }
        @Override
        public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
            List<ViewManager> viewManagers = Arrays.<ViewManager>asList(
                    new NativeImageManager(reactContext)
            );
//            viewManagers.add(new NativeImageManager(reactContext));
            return viewManagers;
//            return Collections.emptyList();
        }

}
