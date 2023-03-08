package kr.codesquad.ladder.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Names {

    private final List<Name> names;

    private Names(List<Name> names) {
        this.names = names;
    }

    public static Names createNames(List<String> names) {
        return new Names(names.stream()
                .map(Name::new)
                .collect(Collectors.toUnmodifiableList()));
    }

    public int getSize() {
        return names.size();
    }

    @Override
    public String toString() {
        return names.stream()
                .map(name -> name.toString())
                .collect(Collectors.joining());
    }
}
