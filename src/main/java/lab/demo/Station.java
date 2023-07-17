package lab.demo;

public class Station {

    private static final int MIN_LENGTH = 2;
    private static final int MAX_LENGTH = 5;

    private final String name;

    public Station(final String name) {
        validate(name);
        this.name = name;
    }

    private void validate(final String name) {
        if (name.length() < MIN_LENGTH || name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("역 이름 길이 예외");
        }
    }
}
