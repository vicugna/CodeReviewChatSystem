CodeReviewChatSystem
====================

コードレビュー機能付きのチャットシステム（返信・確認機能付き）、画像・ファイルアップロード機能付き

#  要件

## 主要機能

- ログインID、メールアドレスどちらでもログインできる

- コードレビュー機能付きのチャットシステム
    - 特定のメッセージに対して返信できる
    - 特定のメッセージに対して確認できる

- メッセージタイプ
     - 通常（親=parent）
     - 返信（子=children）

- メッセージの属性
     - 確認可能であるかどうかはメッセージごとに決められる
     - レビュー（返信）可能
     - 既読数（既読ユーザ確認）
     - 添付ファイル

- Bootstrapでスマホからも利用できる
- 投稿者がプロフィール画像を設定できる
- 投稿者が自分のパスワードを変更できる

## 付加機能

- ファイルアップロード機能付き
- RSS機能
- メール送信機能