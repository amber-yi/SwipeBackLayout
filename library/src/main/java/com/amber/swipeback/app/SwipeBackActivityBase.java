package com.amber.swipeback.app;

import com.amber.swipeback.SwipeBackLayout;

/**
 * Created by luosiyi
 * Desc:
 * Date :19-5-17 下午2:37
 */
public interface SwipeBackActivityBase {
    /**
     * @return the SwipeBackLayout associated with this activity.
     */
    public abstract SwipeBackLayout getSwipeBackLayout();

    public abstract void setSwipeBackEnable(boolean enable);

    /**
     * Scroll out contentView and finish the activity
     */
    public abstract void scrollToFinishActivity();

}
