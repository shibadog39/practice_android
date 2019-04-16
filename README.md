# practice_android
一応Lessonごとにブランチ切ってます。

## Lesson1

- レイアウトの種類
ConstraintLayout
LinearLayout
とか
https://developer.android.com/guide/topics/ui/declaring-layout?hl=ja#load

- データバインディングのさせ方
ActivityMainBinding
DataBindingUtil.setContentView

```
 <data>
   <variable name="view" type="com.example.myapplication.MainActivity"/>
 </data>
```

- onClickのさせ方

## Lesson2

- enum
whenの使い方
http://saburesan.hatenablog.com/entry/2016/09/06/125833
https://superkotlin.com/kotlin-when-statement/

- !!
nullが入るかのうせいがあるものにnull来ないよと証明する 強制アンラップ
https://tech.pjin.jp/blog/2017/04/10/kotlin_null_safety/
https://qiita.com/koher/items/d9411a00986f14683a3f

- ?.let vs if not null
https://qiita.com/mattak/items/f817fd4c83d18454cd9e
https://qiita.com/mkosuke/items/22bbbc22418f4484b27c

- gravityとlayout-gravity
gravityはその要素内での重力、layout_gravityはその要素が属するlayout内での重力
