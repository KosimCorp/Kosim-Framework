/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kosim.core;

import com.kosim.core.kernel.Provider;
import com.kosim.core.util.function.KosimCallback;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user65
 */
public class Global {
    private static Config config;
    
    private static Map<String, Object> _globalValue = new HashMap<>();
    private static Map<String, Provider> _globalProvider = new HashMap<>();
    private static Map<String, KosimCallback> _globalEvent = new HashMap<>();

    public static <T extends Config> T getConfigAs(Class<T> _class) {
        return (T) config;
    }
    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Global.config = config;
    }
    
    public static Map<String, Object> getGlobalValue() {
        return _globalValue;
    }

    public static void setGlobalValue(Map<String, Object> _globalValue) {
        Global._globalValue = _globalValue;
    }

    public static Map<String, Provider> getGlobalProvider() {
        return _globalProvider;
    }

    public static void setGlobalProvider(Map<String, Provider> _globalProvider) {
        Global._globalProvider = _globalProvider;
    }

    public static Map<String, KosimCallback> getGlobalEvent() {
        return _globalEvent;
    }

    public static void setGlobalEvent(Map<String, KosimCallback> _globalEvent) {
        Global._globalEvent = _globalEvent;
    }

    
}
