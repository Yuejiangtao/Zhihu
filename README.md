*** 
# 作品：仿写实现部分功能的知乎日报
## 作者：岳江涛
----
### 一、
#### 作品的描述：
* 在创作这个作品的时候，我使用了所给的部分api，实现了部分功能（功能不全，太菜了）。实现了首页新闻，首页侧滑栏，登录界面雏形，新闻详情页这些部分的操作。

#### 作品的感受：
* 当开始写这个作品的时候，我才明白一个看似简单的app，其实它的实现代码是非常复杂的。
 当我在写这个作品的时候，我才了解到了除基本的四种布局外，还有其他布局，如：DrawerLayout布局、CoordinatorLayout布局、AppBarLayout布局、
     CollapsingToolbarLayout布局。
 我还了解到了一些其他的控件，如：WebVew、NavigationView、CircleImageView等控件。
 同时在写这个作品时，我也体验到了写代码的枯燥，还有那种“死胡同”的感觉。
 不过，当自己写出一点成果时，内心还非常开心的。
 
 #### 作品的体会：
 * 经过写这次作业，我意识到了自己对于学过的知识点，还处于半懂半不懂的状态。在写这次作业的时候，也遇到了许许多多的困难，但也因此我更善于运用网上的知识了。
 ----
 ### 二、
 #### 功能及操作：
 ##### 1、首页新闻条目部分：
 * 首页的新闻可以上下滑动翻阅，点击新闻条目，可查看新闻详细信息。
 
 ![](https://github.com/Yuejiangtao/Zhihu/blob/master/1551413506446.gif)
 ##### 2、首页顶部栏：
 * 首页设置了侧滑栏、提醒图标点击和Menu，Menu里包含了夜间模式、设置选项。
 
 ![](https://github.com/Yuejiangtao/Zhihu/blob/master/1551413674334.gif)
 ##### 3、侧滑栏：
 * 上部分登录、我的收藏、离线下载，但这些都需要用户登录后使用；下部分为menu选项，点击首页，回到首页界面。
 
 ![](https://github.com/Yuejiangtao/Zhihu/blob/master/QQ%E5%9B%BE%E7%89%8720190301125201.png)
 ##### 4、登陆界面：
 * 我仅实现了这个界面的样式。
 
 ![](https://github.com/Yuejiangtao/Zhihu/blob/master/QQ%E5%9B%BE%E7%89%8720190301125139.png)
 ##### 5、新闻详情页：
 * 新闻详情页实现了新闻头部图片、新闻详细内容和滑动新闻时标题栏隐藏。
 
 ![](https://github.com/Yuejiangtao/Zhihu/blob/master/1551413576215.gif)
 ### 三、
 #### 实现功能所使用到的技术/知识点：
 ##### 1、首页新闻条目部分：
 * DrawerLayout布局、FrameLayout、网络请求、Gson解析、RecyclerView以及它的点击事件、递归。
 ##### 2、首页顶部栏：
 * Toolbar、Menu、Intent。
 ##### 3、侧滑栏：
 * Menu、CircleImageView、NavigationView。
 ##### 4、登陆界面：
 * Toolbar、ImageView、Button、TextView。
 ##### 5、新闻详情页：
 * Intent传输数据、网络请求、Gson解析、CoordinatorLayout布局、AppBarLayout以及CollapsingToolbarLayout、NestedScrollView、WebView控件(对bady，js，css的拼接)。
 
 ### 谢谢查看！！！
