package behavior.Mediator.Two;


public abstract class User {
    Chat chat;
    String name;
    boolean isEnable = true;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User [name=" + this.name + "]";
    }
}
