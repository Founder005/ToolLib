package com.zyh.baselibrary.base;

/**
 * @author ZhangYuhang
 * @describe
 * @date 2019/12/16
 * @updatelog
 */
public abstract class BaseMvpActivity<P extends BaseMvpPresenter> extends BaseActivity implements BaseMvpView {

    protected P presenter;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        //创建present
        presenter = createPresenter();
        if (presenter != null) {
            presenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除绑定，避免内存泄露
        if (presenter != null) {
            presenter.detachView();
            presenter = null;
        }
    }

    protected abstract P createPresenter();
}
