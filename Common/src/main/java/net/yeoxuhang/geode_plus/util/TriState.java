package net.yeoxuhang.geode_plus.util;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public enum TriState {
    FALSE,
    DEFAULT,
    TRUE;

    TriState() {
    }

    public static TriState of(boolean bool) {
        return bool ? TRUE : FALSE;
    }

    public static TriState of(@Nullable Boolean bool) {
        return bool == null ? DEFAULT : of(bool);
    }

    public boolean get() {
        return this == TRUE;
    }

    public @Nullable Boolean getBoxed() {
        return this == DEFAULT ? null : this.get();
    }

    public boolean orElse(boolean value) {
        return this == DEFAULT ? value : this.get();
    }

    public boolean orElseGet(BooleanSupplier supplier) {
        return this == DEFAULT ? supplier.getAsBoolean() : this.get();
    }

    public <T> Optional<T> map(BooleanFunction<? extends T> mapper) {
        Objects.requireNonNull(mapper, "Mapper function cannot be null");
        return this == DEFAULT ? Optional.empty() : Optional.ofNullable(mapper.apply(this.get()));
    }

    public <X extends Throwable> boolean orElseThrow(Supplier<X> exceptionSupplier) throws Throwable {
        if (this != DEFAULT) {
            return this.get();
        } else {
            throw exceptionSupplier.get();
        }
    }
}