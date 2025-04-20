package robert_on.glitched.gameasset;

import java.util.Set;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import yesman.epicfight.skill.dodge.DodgeSkill;

public class EpicFightSkills {
  	/** Dodging skills **/
	public static Skill GLITCHCHASER;
	public static Skill GLITCHSTEP;

  public static void buildSkillEvent(SkillBuildEvent build) {
		ModRegistryWorker modRegistry = build.createRegistryWorker(EpicFightMod.MODID);

		GLITCHSTEP = modRegistry.build("glitchstep", DodgeSkill::new, DodgeSkill.createDodgeBuilder().setAnimations(Animations.BIPED_STEP_FORWARD, Animations.BIPED_STEP_BACKWARD, Animations.BIPED_STEP_LEFT, Animations.BIPED_STEP_RIGHT));
