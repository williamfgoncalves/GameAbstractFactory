/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import interfaces.ICharacterFactory;

/**
 *
 * @author William Gonçalves
 */
public class Mage implements ICharacterFactory {

    @Override
    public void createCharacter() {
        System.out.print("YOUR SELECT A MAGE FOR ADVENTURE!" + System.getProperty("line.separator"));
    }
}
