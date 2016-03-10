# LoadMoreListView
这个库能让你listview更加健壮，为她增加了上拉“加载更多”功能，原来上拉刷新如此的简单！

# 效果展示


# gradle

# 使用简介

1、首次启动一个activity时listview还未加载数据时“加载更多”是不显示的，需要在首次获取到数据后激活“加载更多”。
   PS：listView.activateMoreRefresh();也可以这样: listView.activateMoreRefresh("自定义语句")

2、当滑动listview数据项到count-1时将会触发onLoadMore()，在这里实现你需要的功能。
   PS: 当数据处理完成后必须调用 listView.doneMore()或listView.noMoreData()
   
   doneMore/noMoreData 是来告知系统已完成数据加载，准备进行下次加载更多操作 或 停用listview加载更多  PS：noMoreData("自定义语句")

3、已上方法均在主线程中使用,别忘记实现 OnLoadMoreListViewListener 接口  
   PS：您可以在任何时候再次激活加载更多功能，就算你调用了onMoredata，activateMoreRefresh也会被激活
   
4、本库实现简单，大神勿喷，新手建议下载后阅读源码和Demo，在根据自己的需求加以修改！

#布局
    <com.alpamayo.loadmorelistview.LoadMoreListView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/listView" />

# 心得
  效果展示图中下拉刷新所使用的库是：android-Ultra-Pull-To-Refresh ，
  此库不提供加载更多功能，github上面其他的库都是上拉刷新和下拉刷新一起使用的无法满足我要的功能需求，所以自己封装了一下LoadMoreListView，刚好弥补了pull-to-refresh中listview所需的加载更多功能！
  
#感谢
  当然如果有更好的实现方法或BUG或者...，请一定要告知我
  Q    Q：414348480
  E-mail: Alpamayo@foxmail.com
  GitHub: https://github.com/huruiyu
