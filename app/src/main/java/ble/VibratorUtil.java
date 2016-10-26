package ble;
import android.app.Activity;
import android.app.Service;
import android.os.Vibrator;
/**
 * Created by DELL on 2016/10/26.
 */
//手机震动类用来警报
public class VibratorUtil {
    /*
    final BlePreventLostActivity activity：调用该方法的Activity实例
    long milliseconds:震动的时长，单位是毫秒
    long[] pattern:自定义震动模式。数组中数字的含义依次是【静止时长，震动时长，静止时长，震动时长.....】时长的单位是毫秒
    boolean isRepeat:是否反复震动，如果是true，反复震动，如果是false，只震动依次
     */


    public static void Vibrate(final Activity activity,long milliseconds) {
        Vibrator vib=(Vibrator)activity.getSystemService(Service.VIBRATOR_SERVICE);
        vib.vibrate(milliseconds);
    }
    public static void Vibrate(final Activity activity,long[] pattern,boolean isRepeat){
        Vibrator vib=(Vibrator)activity.getSystemService(Service.VIBRATOR_SERVICE);
        vib.vibrate(pattern,isRepeat ? 1:-1);
    }
}
