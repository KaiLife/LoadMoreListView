package com.alpamayo.loadmorelistviewdemo;

import android.app.Activity;
import android.os.Bundle;

import com.alpamayo.loadmorelistview.LoadMoreListView;

public class MainActivity extends Activity implements LoadMoreListView.OnLoadMoreListViewListener {


    LoadMoreListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (LoadMoreListView)findViewById(R.id.listView);
        listView.setOnLoadMoreListViewListener(this);

        /**
         * 当启动activity时listview中没有数据时，“加载更多”是不显示的，您需要在首次获取到数据后激活“加载更多”
         * 激活显示“加载更多”  -->    listView.activateMoreRefresh();     PS： listView.activateMoreRefresh("自定义语句如： 正在加载...")
         * 当用户下滑listview时(数据项-1时将会触发) -->onLoadMore() 此时您需要处理数据 PS:当数据处理完成后必须调用 listView.doneMore()  或  listView.noMoreData()
         * doneMore/noMoreData 是来告知系统已完成数据加载，准备进行下次加载更多操作 或 停用listview加载更多   PS：noMoreData("自定义语句如：没有更多数据")
         *
         * 已上方法均在主线程中使用,前提需要实现 OnLoadMoreListViewListener 接口  PS：您可以在任何时候再次激活加载更多功能，就算你调用了onMoredata() activateMoreRefresh也会被激活
         *
         * PS：此加载更多功能配合 android-Ultra-Pull-To-Refresh 下拉刷新绝对绝配
         */


        /*
         * 当然如果有更好的实现方法或BUG或者...，请一定要告知我
         * Q    Q：414348480
         * E-mail: Alpamayo@foxmail.com
         * GitHub: https://github.com/huruiyu
         */
    }

    @Override
    public void onLoadMore() {
        //do something
        //AU.request(....., new AU.ResponseHandler() {
            //@Override
            //public void onSuccess(String rsText, JSONObject object, JSONArray array) {
                   listView.doneMore();
            //}
            //@Override
            //public void onFailure(String msg, int failureCode) {
                //if(failureCode ==3){
                       listView.noMoreData("该分类暂无商品");
                //}else{
                       listView.noMoreData();
                //}
          //});
    }
}
