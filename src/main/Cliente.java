/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import factory.MacWidgetFactory;
import factory.MotifWidgetFactory;
import factory.WidgetFactory;

/**
 *
 * @author A11003001
 */
public class Cliente {
    public static void main(String[] args) {
        WidgetFactory wfMoti = new MotifWidgetFactory();
        wfMoti.createWindow().view();
        wfMoti.createScrollBar().create();

        System.out.println("-----------------------------------------");

        WidgetFactory wfMac = new MacWidgetFactory();
        wfMac.createWindow().view();
        wfMac.createScrollBar().create();
    }
}
