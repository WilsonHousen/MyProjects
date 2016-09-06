package pkg203lab2;

/**
 * A class for producing simple greetings.
 */
public class Greeter {

    /**
     * Constructs a Greeter object that can greet a person or entity.
     *
     * @param aName the name of the person or entity who should be addressed in
     * the greetings.
     */
    public Greeter(String aName) {
        name = aName;
    }

    /**
     * setName method to change the content of the string in World greeter
     *
     * @param sName the new name/string for the string name
     */
    public void setName(String sName) {

        name = sName;

    }

    /**
     * swaps the name strings of two Greeter objects
     *
     * @param Greeter, a Greeter object
     */
    public void swapNames(Greeter Greeter) {

        String name2 = this.name;

        this.setName(Greeter.name);

        this.setName(name2);

    }

    /**
     * Greet with a "Hello" message.
     *
     * @return a message containing "Hello" and the name of the greeted person
     * or entity.
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }
    private String name;

}
