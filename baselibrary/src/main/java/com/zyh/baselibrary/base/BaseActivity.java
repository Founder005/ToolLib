package com.zyh.baselibrary.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xuexiang.xutil.app.AppUtils;

/**
 * @author ZhangYuhang
 * @describe
 * @date 2019/12/16
 * @updatelog
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        initView();
        initData();
        initEvent();
    }

    protected abstract int initLayout();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initEvent();
}
