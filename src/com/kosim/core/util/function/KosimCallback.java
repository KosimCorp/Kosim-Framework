/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kosim.core.util.function;

/**
 *
 * @author user65
 */
public interface KosimCallback<S, V> {
    public V call(S param);
}
