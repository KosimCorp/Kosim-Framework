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
public interface KosimBiConsumer<S, V> {
    public void accept(S key, V value);
    
    public interface Error<S, V> {
        public void accept(S key, V value) throws Exception;
    }
}
