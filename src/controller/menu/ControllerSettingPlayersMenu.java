package controller.menu;

import java.awt.Color;
import controller.audio.AudioManager;
import model.myEnum.Pawns;
import model.player.PlayerImpl;
import view.menu.NewGameMenu;
/**
 * 
 * Class for managing SettingPlayersMenu action.
 *
 */
public class ControllerSettingPlayersMenu implements ControllerMenu{
/**
 * Class builder.	
 */
	public ControllerSettingPlayersMenu() {
		
	}
/**
 * {@inheritDoc}
 */
	public void musicStop(final String s ,final AudioManager clip ) {
		if(s.equals("Audio On")) {
			clip.getMusicMenu().stop();
			NewGameMenu.getClip().getRockMusic().stop();
			NewGameMenu.getClip().getClassicMusic().stop();
			NewGameMenu.getClip().getTecnoMusic().stop();
			NewGameMenu.getClip().getPopMusic().stop();
			
			}else {
				clip.getMusicMenu().loop();
			}
/**
 * Player creation.
 * @return player
 */
	}
	public PlayerImpl start(final String name,final Color color,final Pawns pawn, String diff){
		PlayerImpl player = new PlayerImpl(name, color, pawn, diff);
		return player;	
	}
/**
 * Player color choice.	
 * @param n number corresponding to the choice
 * @return chosen color
 */
	public Color chosenColor(final Integer n) {
		Color color = new Color(0,0,0);
		switch(n) {
		case 0:
			color =  Color.red;
			break;
		case 1:
			color = Color.YELLOW;
			break;
		case 2: 
			color = Color.GREEN;
			break;
		case 3:
			color = Color.blue;
			break;
		case 4:
			color = Color.PINK;
			break;
		case 5:
			color =  Color.CYAN;
			break;
		}
		return color;
}
/**
 * Choice of the pawn.
 * @param n number corresponding to the choice
 * @return chosen pawn
 */
	
	public Pawns chosenPawn (final Integer n) {
		Pawns pawn = Pawns.BANK;
		switch(n) {
		case 0:
			pawn = Pawns.CAR;
			break;
		case 1:
			pawn = Pawns.BALL;
			break;
		case 2:
			pawn = Pawns.PEN;
			break;
		case 3:
			pawn = Pawns.IRON;
			break;
		case 4:
			pawn = Pawns.BIKE;
			break;
		case 5:
			pawn = Pawns.MOTO;
			break;
		}
		return pawn;
					
		}



		
}
