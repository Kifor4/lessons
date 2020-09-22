package les5.task1;

public class Factory {
    public Logger getLogger(LoggerType type) {
        Logger result = null;
        switch (type) {
            case FILE -> result = new FileLogger();
            case CONSOLE -> result = new ConsoleLogger();
            case DATABASE -> result = new DbLogger();
        }
        return result;
    }
}
