package com.moodstrikerdd.module1.debug;

import com.moodstrikerdd.lib_common.base.BaseActivity;
import com.moodstrikerdd.module1.Module1Fragment;
import com.moodstrikerdd.module1.R;

/**
 * @author moodstrikerdd
 */
public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.module1_activity_main;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.flContain, new Module1Fragment(),Module1Fragment.class.getSimpleName())
                .commit();
    }
}
