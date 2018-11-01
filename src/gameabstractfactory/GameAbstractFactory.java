/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameabstractfactory;

import abstracts.IGameFactory;
import objects.TypeCharacter;

/**
 *
 * @author William Gonçalves
 */
public class GameAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        IGameFactory.playTheGame(TypeCharacter.ARCHER.toString()).selectCharacter().createCharacter();
        IGameFactory.playTheGame(TypeCharacter.MAGE.toString()).selectCharacter().createCharacter();
        IGameFactory.playTheGame(TypeCharacter.WARRIOR.toString()).selectCharacter().createCharacter();
        IGameFactory.playTheGame("ba veio").selectCharacter().createCharacter();
    }
}
