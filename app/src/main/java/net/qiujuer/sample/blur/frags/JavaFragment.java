package net.qiujuer.sample.blur.frags;


import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;

import net.qiujuer.genius.blur.StackBlur;

/**
 * A simple {@link Fragment} subclass.
 */
public class JavaFragment extends BaseFragment {

    @Override
    protected void show(long time) {
        super.show(time);
        mText.setText("Java");
    }

    @Override
    protected Bitmap blur(Bitmap bitmap, int radius) {
        return StackBlur.blur(bitmap, radius, true);
    }
}
