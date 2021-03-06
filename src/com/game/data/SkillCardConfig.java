package com.game.data;

/**
* j技能效果卡配置表.xlsx(自动生成，请勿编辑！)
*/
public class SkillCardConfig {
	public int id;//ID
	public String name;//技能卡名称
	public String name_en;//技能卡名称
	public int goodsid;//物品ID
	public int lv;//等级
	public int type;//类型
	public int cfgType;//卡片配置类型
	public int effectType;//效果类型
	public String desc;//描述
	public String desc_en;//描述
	public int nextCard;//下级技能卡
	public float[] param;//参数
	public int exp;//升级所需经验
	public String icon;//图标
	public int quality;//品质
	public int decompose;//分解获得经验
	public int CardType;//技能卡类型
	public int nextQualityCard;//下一个品质的技能卡ID
	public int subType;//子类型
	public int skillPos;//技能位
}