package codereview.chatsys.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Value;

/**
 * read_messageテーブルに対応したBean
 * @author vicugna
 *
 */
@Value
public class ReadMessageBean implements Serializable {
	private static final long serialVersionUID = -8394405955863147057L;
	private int read_message_id;		/* 既読メッセージのID */
	private int message_id;		/* メッセージのID */
	private int account_id;		/* ユーザアカウントのID */
	private Timestamp inserted_at;	/* 投稿時刻を表す変数 */
	/*
	 * 定義
	 */
	public ReadMessageBean(int read_message_id, int message_id, int account_id,
			Timestamp inserted_at) {
		super();
		this.read_message_id = read_message_id;
		this.message_id = message_id;
		this.account_id = account_id;
		this.inserted_at = inserted_at;
	}
}
