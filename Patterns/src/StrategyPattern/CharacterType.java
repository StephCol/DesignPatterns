package StrategyPattern;

public enum CharacterType {
    HUMAN{
        public Character getCharacter(){
            return new Human();
        }
    },
    ROBOT{
        public Character getCharacter(){
            return new Robot();
        }
    },
    ANIMAL{
        public Character getCharacter(){
            return new Animal();
        }
    };

    public abstract Character getCharacter();

    public static CharacterType[] getCharacterTypes(){
        return CharacterType.values();
    }
}
