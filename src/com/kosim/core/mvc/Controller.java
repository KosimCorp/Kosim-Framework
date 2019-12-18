/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kosim.core.mvc;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user65
 */
public class Controller {
    private Map<String, Object> _controllerValue = new HashMap<>();

    public Map<String, Object> getControllerValue() {
        return _controllerValue;
    }

    public void setControllerValue(Map<String, Object> _controllerValue) {
        this._controllerValue = _controllerValue;
    }
    
    
}
