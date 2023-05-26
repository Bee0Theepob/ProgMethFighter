package entity.skill;

import entity.base.BaseSkill;
import entity.base.EffectPlayer;
import entity.unit.Player;

public class SpeedUp extends BaseSkill implements EffectPlayer{

	public SpeedUp() {
		super("SpeedUp");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performEffect(Player player) {
		player.setSpeed(player.getSpeed()+1);
	}

}
