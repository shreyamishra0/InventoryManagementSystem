/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author ecs
 */
public class OpenPdf {
    public static void OpenById(String id ){
    try{
        if((new File(InventoryUtils.billPath+id+".pdf")).exists()){
            Process p = Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FileProtocolHandler "+InventoryUtils.billPath+""+id+".pdf");
        }
        else{
            JOptionPane.showMessageDialog(null, "File does not exist");
        }
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
}
}

