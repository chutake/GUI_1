# Java-GUI programming

統合開発環境 Eclipseでコーディングした。
#### <機能>
登録用のウィンドウを想定したものです。<br><br>
![画面](https://user-images.githubusercontent.com/106609749/171466418-a62f2687-5387-47a9-bd3e-f3fcb8ed98e6.png)
<br><br>
名前、パスワード、メールアドレス、性別、生年月日、趣味、自由記入欄を設けた。
必須事項は名前、パスワード、メールアドレス、性別、生年月日。
これらのフィールドになにもアクションをせずに登録ボタンを押しても、登録完了とはならない。

##### 名前
名前は数字のみでは許可されない。また3文字以下、16文字以上でも許可されない。<br><br>
![name](https://user-images.githubusercontent.com/106609749/171468195-8ff0a9ee-e1fc-49f4-8df4-ade8dfbde270.png)
<br><br>
##### パスワード
パスワードは2回入力する欄があり、確認用のテキストエリアを設けた。パスワードも名前と同様に3文字以下、16文字以上では許可されない。<br><br>
![pasword](https://user-images.githubusercontent.com/106609749/171468455-49de6569-fc07-44b2-83b0-244d5bce40e8.png)
<br><br>
##### メールアドレス
一般的なメールアドレスは○○@○○.○○といった例である。
Java.util.regex.Patternを用い、適応しているかどうかをチェックする。<br><br>
![mail](https://user-images.githubusercontent.com/106609749/171469147-3c99a060-0448-4024-ab95-61a250da5a3b.png)
<br><br>
メールアドレスが適しているか判定する正規表現は以下のとおりである。
```
Pattern.compile("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
```
<br>

##### 生年月日
生年月日を入力する際、うるう年判定などを考慮して、存在しない日（30日、31日など）は表示しない。<br><br>
![birthday](https://user-images.githubusercontent.com/106609749/171471999-bd1b61c3-4c94-4e53-be65-d73531395c4d.png)
<br><br>
#### 実行例（成功例）
正しく必須事項を入力できると、入力した内容の確認画面が表示されます。
![success](https://user-images.githubusercontent.com/106609749/171472180-4f1def86-6bd4-4c71-b229-8130b94b9153.png)
<br>

#### ＜開発環境＞
JRE システム・ライブラリー[java8]
Javaコンパイラーのコンパイラ準拠レベルは1.8です。

