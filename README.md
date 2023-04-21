# MVP

根模块，包含一些常用工具类与基类
[GitHub仓库地址](https://github.com/DL-ZhangTeng/MVP)

## 引入

### gradle

```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

implementation 'com.github.DL-ZhangTeng:MVP:2.4.0'
```

## 部分工具功能(安装配套插件快速创建模板文件BaseLibraryTemplatePlugin-2.0.0.jar)

### MVP工具包（com/zhangteng/mvp）

| 工具包名/类名                 | 描述                                                                                                       |
|-------------------------|----------------------------------------------------------------------------------------------------------|
| IModel                  | M层接口                                                                                                     |
| IView                   | V层接口                                                                                                     |
| IPresenter              | P层接口                                                                                                     |
| BaseModel               | M层空实现                                                                                                    |
| BaseLoadingView         | V层带加载中方法的接口                                                                                              |
| BaseStateView           | V层带网络状态方法的接口，继承自BaseLoadingView                                                                          |
| BaseRefreshView         | V层带刷新方法的接口，继承自BaseNoNetworkView                                                                          |
| BasePresenter           | P层实现，实现了attachView、detachView、onDestroy等方法                                                               |
| BaseLoadingPresenter    | P层加载中动画实现，增加了getBaseLoadingView()方法                                                                      |
| BaseHttpEntity          | model到presenter的回调                                                                                       |
| LoadingPresenterHandler | 使用代理的方式自动调用加载动画开启与关闭方法，同步执行方法时才有意义(好像没啥用...)                                                             |
| BaseMvpFragment         | 使用Mvp模式Fragment基类（可使用插件自动创建Fragment。[插件仓库地址](https://github.com/DL-ZhangTeng/BaseLibraryTemplatePlugin)） |
| BaseListMvpFragment     | 使用Mvp模式列表Fragment基类                                                                                      |
| BaseMvpActivity         | 使用Mvp模式Activity基类（可使用插件自动创建Activity。[插件仓库地址](https://github.com/DL-ZhangTeng/BaseLibraryTemplatePlugin)） |
| BaseListMvpActivity     | 使用Mvp模式列表Activity基类                                                                                      |

## 混淆

-keep public class com.zhangteng.**.*{ *; }

## 历史版本

| 版本     | 更新                 | 更新时间               |
|--------|--------------------|--------------------|
| v2.4.0 | 增加ViewBinding实现    | 2023/4/21 at 23:14 |
| v2.3.0 | 简化view层            | 2023/4/5 at 22:50  |
| v2.2.0 | List模板增加VH泛型       | 2022/12/5 at 23:50 |
| v2.0.1 | 使用BaseLibrary2.0.2 | 2022/9/14 at 23:14 |
| v2.0.0 | 分离出MVP库            | 2022/9/14 at 23:14 |

## 赞赏

如果您喜欢MVP，或感觉MVP帮助到了您，可以点右上角“Star”支持一下，您的支持就是我的动力，谢谢

## 联系我

邮箱：763263311@qq.com/ztxiaoran@foxmail.com

## License

Copyright (c) [2020] [Swing]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
