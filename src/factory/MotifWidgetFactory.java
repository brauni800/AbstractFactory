/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import componentes.MotifScrollBar;
import componentes.MotifWindow;
import componentes.ScrollBar;
import componentes.Window;

/**
 *
 * @author A11003001
 */
public class MotifWidgetFactory extends WidgetFactory {

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }
}
