public enum Messages {
    INTRODUCTION("Welcome to WordsReverser"),
    INSTRUCTION("Type words to reverse" + "\n" + "Type E to close the program"),
    EXIT("Do you really want to exit? <y,n>"),
    THANKS("Thank you for visiting WordsReverser. Good luck.");

    String value;

    Messages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
