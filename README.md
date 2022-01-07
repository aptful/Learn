# aptful
R3年度　ソフトウェア工学　

グループ12　（株）7人の小人たち作成　Androidアプリケーション「あぷふる」のリポジトリ

KUTV-project参加

## member.txt
メンバー紹介

## UI
UI置き場
### （例）color
（例）/lyout/color

## db
データベース置き場

## app>src>main>res>drawable[xmlファイル作成時に使うファイル]
・back_flame_back_cream.xml
	→背景：クリーム　枠：黒
	
・back_flame_back_orange.xml
	→背景：オレンジ　枠：黒
	
・border.xml
	→
	
・edittext_flame
	→背景：白　枠：黒　入力フォーム
	
・orange_circle
	→オレンジの丸
	
・rectangle
	→背景：白　枠：黒　四角

## app>src>main>res>layout[画面]
・activity_main.xml
	→元々あったファイル
	
・detailshopscreen.xml
	→お店詳細画面
	
・favshopscreen.xml
	→お気に入りに登録したお店一覧画面
	
・keywordeditscreen.xml
	→キーワード編集画面
	
・keywordshopscreen.xml
	→キーワードに登録したお店一覧画面
	
・option.xml
	→設定画面
	
・shoplist.xml
	→お店一覧画面
	
・signup1.xml
	→新規登録画面1
	
・signup2.xml
	→新規登録画面2
	
・signup3.xml→退会確認画面


## app>java>com>example>myapplication[画面表示]
・configScreen
	→設定画面の表示
	
・couponScreen
	→クーポン一覧画面の表示
	
・favShopScreen
	→お気に入りのお店一覧画面表示
	
・keywordListScreen
	→お気に入りのキーワード画面表示
	
・loginScreen
	→ログイン画面表示
	 新規登録画面１に遷移
	
・mypageScreen
	→マイページ画面表示
	 各画面に遷移

・newsListScreen
	→お知らせ一覧画面
	
・official
	→設定画面表示
	
・searchScreen
	→検索画面表示
	
・signupOne
	→新規登録画面1表示
	
・signupTwo
	→新規登録画面2表示
	
・signupThree
	→新規登録画面3表示
	

## app>manifest[]
・AndroidManifest.xml
	→.ktを動かすためのactiveを追加
	
## Gradleスクリプト
・build.gradle（モジュール）
	→ buildFeatures {
        viewBinding true
   	 }
	 
## app>src>main>res>values>themes
・themes.xml
	→タイトルバー退避
