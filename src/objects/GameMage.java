/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import abstracts.IGameFactory;
import interfaces.ICharacterFactory;

/**
 *
 * @author William Gonçalves
 */
public class GameMage extends IGameFactory {

    @Override
    public ICharacterFactory selectCharacter() {
        return new Mage();
    }

}
