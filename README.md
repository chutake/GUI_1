# Java-GUI programming

統合開発環境 Eclipseでコーディングしました。
#### <機能>
登録用のウィンドウを想定したものです。
![画面](https://user-images.githubusercontent.com/106609749/171466418-a62f2687-5387-47a9-bd3e-f3fcb8ed98e6.png)
<br><br>
名前、パスワード、メールアドレス、性別、生年月日、趣味、自由記入欄を設けた。
必須事項は名前、パスワード、メールアドレス、性別、生年月日。
これらのフィールドになにもアクションをせずに登録ボタンを押しても、登録完了とはならない。

パスワードは2回入力する欄があり、確認用のテキストエリアを設けている。
生年月日を入力する際、うるう年判定などを考慮して、存在しない日（30日、31日など）は表示しない。

#### ＜開発環境＞
JRE システム・ライブラリー[java8]
Javaコンパイラーのコンパイラ準拠レベルは1.8です。
