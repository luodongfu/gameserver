package com.game.params.rank;

import com.game.params.*;

//AI竞技场榜单元素(工具自动生成，请勿手动修改！）
public class AIArenaRankVO implements IProtocol {
	public String name;//玩家名称
	public int level;//等级
	public int vocation;//职业
	public String gang;//公会
	public int fightingValue;//战力
	public int playerId;//玩家ID
	public int vip;//vip


	public void decode(BufferBuilder bb) {
		this.name = bb.getString();
		this.level = bb.getInt();
		this.vocation = bb.getInt();
		this.gang = bb.getString();
		this.fightingValue = bb.getInt();
		this.playerId = bb.getInt();
		this.vip = bb.getInt();
	}

	public void encode(BufferBuilder bb) {
		bb.putString(this.name);
		bb.putInt(this.level);
		bb.putInt(this.vocation);
		bb.putString(this.gang);
		bb.putInt(this.fightingValue);
		bb.putInt(this.playerId);
		bb.putInt(this.vip);
	}
}
