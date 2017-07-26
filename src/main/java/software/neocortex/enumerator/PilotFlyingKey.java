package software.neocortex.enumerator;

public enum PilotFlyingKey {
    KVS("КВС"),
    VP("2П");

    private String key;

    PilotFlyingKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

