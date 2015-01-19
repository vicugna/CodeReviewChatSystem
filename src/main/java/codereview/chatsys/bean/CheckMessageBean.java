package codereview.chatsys.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Value;

/**
 * check_messageテーブルに対応したBean
 * @author vicugna
 *
 */
@Value
public class CheckMessageBean implements Serializable {
	private static final long serialVersionUID = 8754317337708755261L;
	private int read_message_id;
	private int message_id;
	private int account_id;
	private Timestamp inserted_at;
	public CheckMessageBean(int read_message_id, int message_id, int account_id,
			Timestamp inserted_at) {
		super();
		this.read_message_id = read_message_id;
		this.message_id = message_id;
		this.account_id = account_id;
		this.inserted_at = inserted_at;
	}
}
