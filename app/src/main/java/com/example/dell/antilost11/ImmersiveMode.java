package com.example.dell.antilost11;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.example.dell.antilost11.R;
/**
 * Created by DELL on 2016/10/26.
 */
public class ImmersiveMode {

    public static void setImmersiveMode(Activity activity){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true,activity);

            //系统通知栏的颜色
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //系统虚拟按键的颜色
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);//�����д��д������ⷵ�ء�home������������
        }

        SystemBarTintManager tintManager = new SystemBarTintManager(activity);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setStatusBarTintResource(R.color.light_blue_main);

        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setNavigationBarTintResource(R.color.light_blue_main);

    }


    public static void setTranslucentStatus(boolean on,Activity activity) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

}

