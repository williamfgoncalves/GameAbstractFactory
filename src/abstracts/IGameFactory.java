/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import interfaces.ICharacterFactory;
import objects.GameArcher;
import objects.GameMage;
import objects.GameWarrior;

/**
 *
 * @author William Gonçalves
 */
public abstract class IGameFactory {

    public abstract ICharacterFactory selectCharacter();

    public static IGameFactory playTheGame(String character) throws Exception {
        if (character.contains("ARCHER")) {
            return new GameArcher();
        }
        if (character.contains("MAGE")) {
            return new GameMage();
        }

        if (character.contains("WARRIOR")) {
            return new GameWarrior();
        }
        throw new Exception("NAO ENCOTREI NEW PERSONGEM");
    };
}
