package com.amber.swipeback.app;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.amber.swipeback.SwipeBackLayout;
import com.amber.swipeback.Utils;

/**
 * Created by luosiyi
 * Desc:
 * Date :19-5-17 下午2:56
 */
public class SwipeBackActivity extends AppCompatActivity implements SwipeBackActivityBase , SwipeBackLayout.FinishActivityListener {
    private SwipeBackActivityHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHelper = new SwipeBackActivityHelper(this);
        mHelper.onActivityCreate();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mHelper.onPostCreate();
        getSwipeBackLayout().setOnFinishActivityListener(this);
    }
    @Override
    public <T extends View> T findViewById(int id) {
        T v = super.findViewById(id);
        if (v == null && mHelper != null){
            v=mHelper.findViewById(id);
        }
        return v;
    }


    @Override
    public SwipeBackLayout getSwipeBackLayout() {
        return mHelper.getSwipeBackLayout();
    }

    @Override
    public void setSwipeBackEnable(boolean enable) {
        getSwipeBackLayout().setEnableGesture(enable);
    }

    @Override
    public void scrollToFinishActivity() {
        Utils.convertActivityToTranslucent(this);
        getSwipeBackLayout().scrollToFinishActivity();
    }

    @Override
    public void dothingBeforeFinish() {

    }
}

