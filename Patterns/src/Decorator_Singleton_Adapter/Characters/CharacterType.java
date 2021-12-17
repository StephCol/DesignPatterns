package Decorator_Singleton_Adapter.Characters;

public enum CharacterType{
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
}
