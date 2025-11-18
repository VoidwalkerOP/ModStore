/* 
  Mod Store by Voidwalker and Enby
  Freedom to download!

  Script for gathering system information
*/
import java.lang.*;
import android.os.Build;
public class SysInfo {
    public static void getSysProp() {
        //Android OS information
        System.out.println("OS Name (Codename): " + Build.VERSION.CODENAME);
        System.out.println("OS Version (Release): " + Build.VERSION.RELEASE);
        System.out.println("SDK Version (API Level): " + Build.VERSION.SDK_INT);
        System.out.println("Device Brand: " + Build.BRAND);
        System.out.println("Device Model: " + Build.MODEL);
        System.out.println("Manufacturer: " + Build.MANUFACTURER);
        System.out.println("Build ID: " + Build.ID);
        System.out.println("Build Fingerprint: " + Build.FINGERPRINT);

        //Java system properties information
        System.out.println("Java OS Name: " + System.getProperty("os.name"));
        System.out.println("Java OS Version: " + System.getProperty("os.version"));
        System.out.println("Java OS Architecture: " + System.getProperty("os.arch"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
    }
}
