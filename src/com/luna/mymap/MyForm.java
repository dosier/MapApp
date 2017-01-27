package com.luna.mymap;

import com.codename1.ui.events.ActionEvent;

public class MyForm extends com.codename1.ui.Form {
    public MyForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public MyForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

    public void create_Custom_1_1_1(ActionEvent ev) {
    }

    //-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.GridLayout(2, 1));
    private com.codename1.ui.Container gui_Map_1 = new com.codename1.ui.Container();
    private com.codename1.ui.list.MultiList gui_MultiList_1 = new com.codename1.ui.list.MultiList();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setTitle("MyForm");
        setName("MyForm");
        addComponent(gui_Container_1);
        gui_Container_1.setScrollableX(true);
        gui_Container_1.setName("Container_1");
        gui_Container_1.addComponent(gui_Map_1);
        gui_Container_1.addComponent(gui_MultiList_1);
        gui_Map_1.setName("Map_1");
        gui_MultiList_1.setName("MultiList_1");
        gui_Container_1.setScrollableX(true);
        gui_Container_1.setName("Container_1");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
