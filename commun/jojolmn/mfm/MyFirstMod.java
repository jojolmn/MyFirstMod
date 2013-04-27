package jojolmn.mfm;

import jojolmn.mfm.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * MyFirstMod
 * 
 * MyFirstMod
 * 
 * @author jojolmn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod( modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class MyFirstMod {

    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        
    }
    
    @Init
    public void init(FMLInitializationEvent event){
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }
    
}
