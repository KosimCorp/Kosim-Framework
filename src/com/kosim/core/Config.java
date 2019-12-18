/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kosim.core;

/**
 *
 * @author user65
 */
public interface Config {
    public String getAppName();
    public String getAppVersionName();
    public int getAppVersionNumber();
    public boolean isDebug();
}
