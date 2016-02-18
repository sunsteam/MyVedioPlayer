package firstwork.yomii.myplayer.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import firstwork.yomii.myplayer.R;

/**
 * Created by Administrator on 2016/2/16.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getLayoutID()==-1) {
            setContentView(getLayoutView());
        }else{
            setContentView(getLayoutID());
        }

        initView();
        initViewPlugin();
        initData();
    }

    /**
     * 用于代码添加view操作
     * @return 底层布局view
     */
    protected View getLayoutView() {
        return null;
    }

    /**
     * 用于XML添加view操作
     * @return Layout资源id
     */
    protected int getLayoutID() {
        return -1;
    }


    /**
     * 初始化控件
     */
    protected abstract void initView();

    /**
     * 初始化adapter/listener等控件的辅助对象
     */
    protected abstract void initViewPlugin();

    /**
     * 初始化数据,如果有的话可以复写
     */
    protected void initData() {
    }




}
