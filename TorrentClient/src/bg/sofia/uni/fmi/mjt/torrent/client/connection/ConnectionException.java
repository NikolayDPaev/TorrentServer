package bg.sofia.uni.fmi.mjt.torrent.client.connection;

public class ConnectionException extends Exception {
    public ConnectionException(String message, Exception exception) {
        super(message, exception);
    }

    public ConnectionException(String message) {
        super(message);
    }
}
