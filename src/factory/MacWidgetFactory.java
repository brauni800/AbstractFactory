/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import componentes.MacScrollBar;
import componentes.MacWindow;
import componentes.ScrollBar;
import componentes.Window;

/**
 *
 * @author A11003001
 */
public class MacWidgetFactory extends WidgetFactory {

    @Override
    public Window createWindow() {
        return new MacWindow();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }
}
