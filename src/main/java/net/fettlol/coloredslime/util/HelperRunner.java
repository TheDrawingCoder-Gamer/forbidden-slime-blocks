package net.fettlol.coloredslime.util; 

import org.jruby.*;
import org.jruby.runtime.builtin.IRubyObject;
import org.jruby.runtime.Helpers;
import org.jruby.javasupport.JavaUtil;
import java.util.Map;
import net.minecraft.util.DyeColor;
import net.minecraft.block.Block;
public class HelperRunner {
    private static final Ruby __ruby__ = Ruby.getGlobalRuntime();
    public static Map<DyeColor,Block> generateSlimeBlocks() {
        String bootstrap = "require './Helpers'";
        __ruby__.evalScriptlet(bootstrap);

        RubyModule rclass = __ruby__.getClassFromPath("Helpers"); 

        IRubyObject obj = Helpers.invoke(__ruby__.getCurrentContext(), rclass, "generateSlimeBlocks");
        return JavaUtil.unwrapJavaObject(obj);
    }
    public static Map<DyeColor,Block> generateHoneyBlocks() {
        String bootstrap = "require './Helpers'";
        __ruby__.evalScriptlet(bootstrap);

        RubyModule rclass = __ruby__.getClassFromPath("Helpers"); 

        IRubyObject obj = Helpers.invoke(__ruby__.getCurrentContext(), rclass, "generateHoneyBlocks");
        return JavaUtil.unwrapJavaObject(obj);
    }
}
